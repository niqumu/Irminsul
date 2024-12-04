package io.irminsul.game.player;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.database.PlayerData;
import io.irminsul.common.game.event.PlayerLogoutEvent;
import io.irminsul.common.game.event.PlayerTeleportEvent;
import io.irminsul.common.game.event.PlayerTickEvent;
import io.irminsul.common.game.world.Teleport;
import io.irminsul.common.proto.EnterTypeOuterClass;
import io.irminsul.common.proto.MotionStateOuterClass;
import io.irminsul.game.GameConstants;
import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.player.*;
import io.irminsul.common.game.net.Session;
import io.irminsul.common.game.net.SessionState;
import io.irminsul.common.game.world.Position;
import io.irminsul.common.game.world.Scene;
import io.irminsul.common.game.world.World;
import io.irminsul.game.avatar.IrminsulAvatar;
import io.irminsul.game.data.EnterReason;
import io.irminsul.game.data.PlayerProperty;
import io.irminsul.common.game.event.PlayerLoginEvent;
import io.irminsul.game.database.IrminsulPlayerData;
import io.irminsul.game.net.packet.*;
import io.irminsul.game.world.IrminsulWorld;
import lombok.Data;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/**
 * An implementation of {@link Player}, representing an Irminsul player.
 * <p>
 * When a player is logging in for the first time, a new IrminsulPlayer instance should be created via the default
 * {@link IrminsulPlayer#IrminsulPlayer(Session, int)} constructor. This creates a new player object with fresh/blank
 * stats, settings, etc., and no progress.
 * <p>
 * When deserializing an existing player, the session should first be set via the {@link Player#setSession(Session)}
 * method. A world must then be created and assigned via the {@link Player#createWorld()} method. These steps must be
 * completed in this order <i>prior</i> to calling the {@link Player#login()} method.
 */
@Data
public class IrminsulPlayer implements Player {

    // ================================================================ //
    //                               Core                               //
    // ================================================================ //

    /**
     * The {@link Session} this player is connecting through
     */
    private Session session;

    /**
     * This player's UID
     */
    private final int uid;

    /**
     * This player's social profile
     */
    private PlayerProfile profile;

    // ================================================================ //
    //                               Data                               //
    // ================================================================ //

    /**
     * A map of properties that this player has
     * @see PlayerProperty
     */
    private final Map<Integer, Integer> properties = new HashMap<>();

    /**
     * A list of {@link Avatar}s owned by this player
     */
    private List<Avatar> avatars = new ArrayList<>();

    /**
     * A list, by ID, of chat emojis this player has unlocked
     */
    private List<Integer> chatEmojis = new ArrayList<>();

    /**
     * A list, by ID, of gliders this player owns
     */
    private List<Integer> ownedFlyCloaks = new ArrayList<>(List.of(140001));

    /**
     * A list, by ID, of avatar costumes this player owns
     */
    private List<Integer> ownedCostumes = new ArrayList<>();

    /**
     * A list, by ID, of name cards this player owns
     */
    private List<Integer> ownedNameCards = new ArrayList<>(List.of(210001));

    // ================================================================ //
    //                               World                              //
    // ================================================================ //

    /**
     * This player's current {@link World}
     */
    private World world;

    /**
     * This player's current {@link Position} within their scene
     */
    private Position position;

    /**
     * The ID of this player's current scene
     */
    private int sceneId = 0;

    /**
     * This player's current token used to transfer between scenes
     */
    private int enterSceneToken = 0;

    /**
     * This player's peer ID to their world
     */
    private int peerId;

    // ================================================================ //
    //                             Managers                             //
    // ================================================================ //

    /**
     * This player's {@link PlayerTeamManager} instance
     */
    private final PlayerTeamManager teamManager;

    /**
     * This player's game progress container
     */
    private final PlayerProgress progress;

    /**
     * This player's {@link PlayerInventory} instance
     */
    private final PlayerInventory inventory;

    // ================================================================ //
    //                             Internal                             //
    // ================================================================ //

    /**
     * The last assigned free GUID. Excluded from serialization as this is not a persistent piece of data; GUIDs are
     * assigned on a per-session basis.
     */
    private transient int lastGuid = 0;

    // ================================================================ //

    /**
     * Creates a new player with fresh data.
     * @param session The session this player is connecting through
     * @param uid The uid to assign to this player
     */
    public IrminsulPlayer(Session session, int uid) {
        this.session = session;
        this.uid = uid;

        // Create fresh social profile
        this.profile = new IrminsulPlayerProfile(this.uid);

        // Create world
        this.createWorld();

        // Create managers
        this.teamManager = new IrminsulPlayerTeamManager(this);
        this.progress = new IrminsulPlayerProgress(this);
        this.inventory = new IrminsulPlayerInventory(this);

        // Add default properties
        this.properties.putAll(PlayerProperty.DEFAULT_PROPERTIES);
    }

    /**
     * @return A map of properties that this player has
     */
    public @NotNull Map<Integer, Integer> getProperties() {

        // Sandbox properties
        if (this.getServer().getConfig().isSandbox()) {
            Map<Integer, Integer> map = new HashMap<>(this.properties);
            map.putAll(PlayerProperty.SANDBOX_PROPERTIES);
            return map;
        }

        // Regular properties
        return this.properties;
    }

    /**
     * @return The {@link GameServer} this player is connected to
     */
    @Override
    public @NotNull GameServer getServer() {
        return this.session.getServer();
    }

    /**
     * Sets the session that this player is connecting through, first ensuring that no session is already set. If a
     * session is already set (not null), an exception is raised.
     * @param session The new session that this player is connecting through
     */
    public void setSession(@NotNull Session session) {
        if (this.session != null) {
            throw new IllegalStateException("Session is already set!");
        }
        this.session = session;
    }

    /**
     * Execute the login process for this player, sending them to the overworld scene
     */
    @Override
    public void login() {

        // Ensure that the player has a world to log into
        if (this.world == null) {
            throw new IllegalStateException("No world to log into!");
        }

        // Add the player to the online players list
        this.getServer().getOnlinePlayers().put(this.uid, this);

        // Load data
        PlayerData saveData = this.getServer().getPlayerDataManager().load(this.uid);
        boolean firstLogin = saveData == null;
        if (firstLogin) {
            this.firstLogin();
        } else {
            this.importData(saveData);

            // TODO temporary until avatars are saved/loaded
            this.avatars.add(new IrminsulAvatar(GameConstants.FEMALE_TRAVELER_AVATAR_ID, this));
            this.teamManager.getActiveTeam().getAvatars().add(this.avatars.getFirst());
        }

        // Send player data
        new PacketPlayerDataNotify(this.session).send();
        new PacketAvatarDataNotify(this.session).send();

        // Fire login event
        this.session.getServer().getEventBus().postEvent(new PlayerLoginEvent(this, firstLogin));

        // Send player to their scene and position
        this.world.getOrCreateScene(this.sceneId);
        this.generateEnterSceneToken();
        this.world.getScenes().get(this.sceneId).addPlayer(this);
        new PacketPlayerEnterSceneNotify(this.session, new Teleport(this.sceneId, this.position,
            EnterTypeOuterClass.EnterType.ENTER_TYPE_SELF, EnterReason.LOGIN)).send();

        // Done
        this.session.setState(SessionState.ACTIVE);
        this.getServer().getLogger().info("{} ({}) joined the game from {}", this.profile.getNickname(), this.uid,
            this.getSession().getTunnel().getAddress().toString());
    }

    /**
     * Called when the player logs in for the first time
     */
    private void firstLogin() {

        // Give the player the traveler
        this.avatars.add(new IrminsulAvatar(GameConstants.FEMALE_TRAVELER_AVATAR_ID, this));
        this.teamManager.getActiveTeam().getAvatars().add(this.avatars.getFirst());

        // Teleport the player to the spawn point of the overworld
        this.sceneId = GameConstants.OVERWORLD_SCENE;
        this.position = this.world.getOrCreateScene(this.sceneId).getSpawnPoint();

        // Send the player the welcome mail
        this.getServer().getMailManager().sendWelcomeMail(this);
    }

    /**
     * Executes the logout process for this player, saving their data and closing their connection
     */
    @Override
    public void logout() {

        // Remove the player to the online players list
        this.getServer().getOnlinePlayers().remove(this.uid);

        // Log
        this.getServer().getLogger().info("{} ({}) left the game", this.getProfile().getNickname(), this.uid);

        // Save
        this.getServer().getPlayerDataManager().save(this.exportData(), this.uid);

        // Fire event
        this.getServer().getEventBus().postEvent(new PlayerLogoutEvent(this));

        // Close connection in 1000 ms
        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                this.getServer().getLogger().error("Somehow failed to disconnect player {}?", this.uid);
            }
            this.session.setPlayer(null);
            this.session.getTunnel().close();
        }).start();
    }

    /**
     * Create a new world for this player and register it, first ensuring that no world is already set. If a world is
     * already set (not null), an exception is raised.
     * <p>
     * This is called automatically when a new player is created. When deserializing an existing player, this
     * <b>must</b> be called prior to the {@link Player#login()} method. Prior to this method being called, the player's
     * session must be set. If a session is not set, an exception is raised.
     */
    @Override
    public void createWorld() {

        // Ensure that the player has a session set
        if (this.session == null) {
            throw new IllegalStateException("Trying to create a world for a player without a session!");
        }

        // Ensure that a world isn't already set
        if (this.world != null) {
            throw new IllegalStateException("World is already set!");
        }

        this.world = new IrminsulWorld(this.session.getServer(), this);
        this.session.getServer().getWorlds().add(this.world);
        this.peerId = this.world.getNextPeerId();
    }

    /**
     * Gives this player the provided avatar
     * @param avatar The avatar to give the player
     */
    @Override
    public void addAvatar(@NotNull Avatar avatar) {
        this.avatars.add(avatar);
        new PacketAvatarAddNotify(this.session, avatar).send();
    }

    /**
     * Attempts to look up an avatar this player owns by GUID
     *
     * @param guid The GUID of the avatar to look up
     * @return An {@link Avatar} instance if one was found, otherwise {@code null}
     */
    @Override
    public @Nullable Avatar getAvatar(long guid) {
        for (Avatar avatar : this.avatars) {
            if (avatar.getGuid() == guid) {
                return avatar;
            }
        }
        return null;
    }

    /**
     * Sends this player to a specified scene at the default spawn position
     * @param sceneId The scene to send the player to
     */
    @Override
    public void sendToScene(int sceneId) {
        Position spawn = this.world.getOrCreateScene(sceneId).getSpawnPoint();
        this.sendToScene(sceneId, spawn, EnterReason.GM);
    }

    /**
     * Sends this player to a specified scene at the default spawn position
     * @param sceneId The scene to send the player to
     * @param reason  The reason for the teleport
     */
    @Override
    public void sendToScene(int sceneId, int reason) {
        Position spawn = this.world.getOrCreateScene(sceneId).getSpawnPoint();
        this.sendToScene(sceneId, spawn, reason);
    }

    /**
     * Sends this player to a specified scene at a specified position
     * @param sceneId  The scene to send the player to
     * @param position The position within the new scene to send the player to
     */
    @Override
    public void sendToScene(int sceneId, @NotNull Position position) {
        this.sendToScene(sceneId, position, EnterReason.GM);
    }

    /**
     * Sends this player to a specified scene at a specified position
     * @param sceneId  The scene to send the player to
     * @param position The position within the new scene to send the player to
     * @param reason   The reason for the teleport
     */
    @Override
    public void sendToScene(int sceneId, @NotNull Position position, int reason) {
        this.sendToScene(new Teleport(sceneId, position, EnterTypeOuterClass.EnterType.ENTER_TYPE_SELF, reason, 0));
    }

    /**
     * Sends this player to a scene at a specified position
     * @param teleport The teleport data to use
     */
    @Override
    public void sendToScene(Teleport teleport) {
        this.sendToScene(teleport, true);
    }

    /**
     * Sends this player to a scene at a specified position
     * @param teleport The teleport data to use
     * @param fireEvent Whether to fire a {@link PlayerTeleportEvent} as a result of the teleport
     */
    private void sendToScene(Teleport teleport, boolean fireEvent) {

        if (fireEvent) {
            // Create and fire teleport event
            PlayerTeleportEvent event = new PlayerTeleportEvent(false, this, this.sceneId,
                teleport.getScene(), this.getPosition(), teleport.getPosition(), teleport.getEnterReason());
            this.session.getServer().getEventBus().postEvent(event);

            // If the event was cancelled, do nothing
            if (event.isCancelled()) {
                return;
            }

            // Make sure that the event still has sane values after being posted
            if (event.getToScene() == 0) {
                this.session.getServer().getLogger().warn("Event {} is bad! toScene must be non-zero. " +
                    "The event will not be processed", event);
                return;
            }

            teleport.setScene(event.getToScene());
            teleport.setPosition(event.getToPos().copy());
            teleport.setEnterReason(event.getReason());
        }

        // Teleporting within the same scene
        if (teleport.getScene() == this.sceneId) {
            this.teleport(teleport.getPosition(), false); // don't fire the event again
            return;
        }

        // Log
        this.session.getServer().getLogger().info("Sending {} from scene {} -> {} at {} with reason {}",
            this, this.sceneId, teleport.getScene(), teleport.getPosition(),
            EnterReason.getReasonById(teleport.getEnterReason()));

        // Load scene
        this.world.getOrCreateScene(teleport.getScene());

        // Teleport
        this.generateEnterSceneToken();
        this.position = teleport.getPosition();
        this.sceneId = teleport.getScene();
        this.world.getScenes().get(teleport.getScene()).addPlayer(this);
        new PacketPlayerEnterSceneNotify(this.session, teleport).send();
    }

    /**
     * Sends this player to a specified position within their current scene
     * @param position The position within the current scene to send the player to
     */
    @Override
    public void teleport(@NotNull Position position) {
        this.teleport(position, true);
    }

    /**
     * Sends this player to a specified position within their current scene
     * @param position The position within the current scene to send the player to
     * @param fireEvent Whether to fire a {@link PlayerTeleportEvent} as a result of the teleport
     */
    private void teleport(@NotNull Position position, boolean fireEvent) {

        if (fireEvent) {
            // Create and fire teleport event
            PlayerTeleportEvent event = new PlayerTeleportEvent(false, this, this.sceneId,
                this.sceneId, this.getPosition(), position, EnterReason.GM);
            this.session.getServer().getEventBus().postEvent(event);

            // If the event was cancelled, do nothing
            if (event.isCancelled()) {
                return;
            }

            // Teleporting to a different scene
            if (event.getToScene() != this.sceneId) {
                this.sendToScene(new Teleport(event.getToScene(), event.getToPos(),
                    EnterTypeOuterClass.EnterType.ENTER_TYPE_SELF, event.getReason()), false); // don't fire again
                return;
            }

            position = event.getToPos().copy();
        }

        // Log
        this.session.getServer().getLogger().info("Teleporting {} to {} within scene {}", this, position, this.sceneId);

        this.generateEnterSceneToken();
        this.position = position;

        if (this.getScene() != null) {
            new PacketPlayerEnterSceneNotify(this.session, new Teleport(this.sceneId, this.position,
                EnterTypeOuterClass.EnterType.ENTER_TYPE_GOTO, EnterReason.GM)).send();

            // Rotate
            this.getScene().replaceEntity(this.teamManager.getActiveAvatar(), this.teamManager.getActiveAvatar());
        } else {
            this.session.getServer().getLogger().warn("Tried to teleport {} within a null scene!", this);
        }
    }

    private void generateEnterSceneToken() {
        this.enterSceneToken = 1000 + (int) (Math.random() * 10000);
    }

    /**
     * @return This player's current scene, or null if none exists
     */
    @Override
    public @Nullable Scene getScene() {
        if (this.sceneId == 0) {
            return null; // The player hasn't logged in yet
        }
        return this.world.getScenes().get(this.sceneId);
    }

    /**
     * @return This player's current {@link MotionStateOuterClass.MotionState}
     */
    @Override
    public @NotNull MotionStateOuterClass.MotionState getMotionState() {
        return this.getTeamManager().getActiveAvatar().getMotionState();
    }

    /**
     * @return This next free GUID to assign. Calling this method will mark the returned value as used.
     */
    @Override
    public long getNextGuid() {
        return ((long) this.getUid() << 32) + ++this.lastGuid;
    }

    /**
     * Award this player a certain amount of AR exp
     * @param exp The amount of EXP to award
     */
    @Override
    public void awardExp(int exp) {
        this.properties.put(PlayerProperty.PLAYER_EXP.getId(),
            this.properties.getOrDefault(PlayerProperty.PLAYER_EXP.getId(), 0) + exp);
        new PacketPlayerDataNotify(this.session).send();
    }

    /**
     * @return The amount of primogems (H coins) held by this player
     */
    @Override
    public int getPrimogems() {
        return this.properties.getOrDefault(PlayerProperty.PLAYER_HCOIN.getId(), 0);
    }

    /**
     * Sets the amount of primogems (H coins) held by this player
     *
     * @param primogems The new amount of primogems
     */
    @Override
    public void setPrimogems(int primogems) {
        this.properties.put(PlayerProperty.PLAYER_HCOIN.getId(), primogems);
        new PacketPlayerDataNotify(this.session).send();
    }

    /**
     * @return The amount of genesis crystals (M coins) held by this player
     */
    @Override
    public int getCrystals() {
        return this.properties.getOrDefault(PlayerProperty.PLAYER_MCOIN.getId(), 0);
    }

    /**
     * Sets the amount of genesis crystals (M coins) held by this player
     *
     * @param genesisCrystals The new amount of genesis crystals
     */
    @Override
    public void setCrystals(int genesisCrystals) {
        this.properties.put(PlayerProperty.PLAYER_MCOIN.getId(), genesisCrystals);
        new PacketPlayerDataNotify(this.session).send();
    }

    /**
     * @return The amount of mora (S coins) held by this player
     */
    @Override
    public int getMora() {
        return this.properties.getOrDefault(PlayerProperty.PLAYER_SCOIN.getId(), 0);
    }

    /**
     * Sets the amount of mora (S coins) held by this player
     *
     * @param mora The new amount of genesis mora
     */
    @Override
    public void setMora(int mora) {
        this.properties.put(PlayerProperty.PLAYER_SCOIN.getId(), mora);
        new PacketPlayerDataNotify(this.session).send();
    }

    /**
     * @return The amount of home coins held by this player
     */
    @Override
    public int getHomeCoins() {
        return this.properties.getOrDefault(PlayerProperty.PLAYER_HOME_COIN.getId(), 0);
    }

    /**
     * Sets the amount of home coins held by this player
     *
     * @param homeCoins The new amount of home coins
     */
    @Override
    public void setHomeCoins(int homeCoins) {
        this.properties.put(PlayerProperty.PLAYER_HOME_COIN.getId(), homeCoins);
        new PacketPlayerDataNotify(this.session).send();
    }

    /**
     * Exports this player's data
     *
     * @return This player's data, as a {@link PlayerData} instance
     */
    @Override
    public @NotNull PlayerData exportData() {
        PlayerData data = new IrminsulPlayerData(this.uid);

        data.setProfile(this.profile);
        data.setPosition(this.position);
        data.setScene(this.sceneId);
        data.setMailbox(this.getServer().getMailManager().exportMailbox(this.uid));

        return data;
    }

    /**
     * Imports this player's data
     *
     * @param data The data to load, as a {@link PlayerData} instance
     */
    @Override
    public void importData(@NotNull PlayerData data) {
        this.profile = data.getProfile();
        this.position = data.getPosition();
        this.sceneId = data.getScene();
        this.getServer().getMailManager().loadAndSendMailbox(this.uid, data.getMailbox());
    }

    // ================================================================ //
    //                             Tickable                             //
    // ================================================================ //

    /**
     * Called at a regular interval by the server; update this object in some way
     */
    @Override
    public void tick() {

        // Create and fire event
        PlayerTickEvent event = new PlayerTickEvent(this);
        this.getServer().getEventBus().postEvent(event);

        // Read position and rotation from current avatar entity
//        this.position = this.teamManager.getActiveAvatar().getPosition();

        // Update avatar stats
        this.teamManager.getActiveTeam().getAvatars().forEach(Avatar::updateStats);
    }

    // ================================================================ //
    //                               Base                               //
    // ================================================================ //

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Player player)) {
            return false;
        }
        return player.getUid() == this.getUid();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.uid);
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.profile.getNickname(), this.uid);
    }
}
