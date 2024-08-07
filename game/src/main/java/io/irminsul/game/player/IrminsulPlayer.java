package io.irminsul.game.player;

import io.irminsul.common.game.GameServerContainer;
import io.irminsul.common.game.world.Teleport;
import io.irminsul.common.proto.EnterTypeOuterClass;
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
import io.irminsul.game.event.impl.PlayerLoginEvent;
import io.irminsul.game.net.packet.PacketAvatarDataNotify;
import io.irminsul.game.net.packet.PacketPlayerDataNotify;
import io.irminsul.game.net.packet.PacketPlayerEnterSceneNotify;
import io.irminsul.game.world.IrminsulWorld;
import lombok.Data;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serial;
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

    @Serial
    private final static long serialVersionUID = 1;

    // ================================================================ //
    //                               Core                               //
    // ================================================================ //

    /**
     * The {@link Session} this player is connecting through. Excluded from serialization as this is not a persistent
     * piece of data; the session is different every time the player connects.
     */
    private transient Session session;

    /**
     * This player's UID
     */
    private final int uid;

    /**
     * This player's social profile
     */
    private final PlayerProfile profile;

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
    private List<Integer> ownedFlyCloaks = List.of(140001);

    /**
     * A list, by ID, of avatar costumes this player owns
     */
    private List<Integer> ownedCostumes = List.of();

    /**
     * A list, by ID, of name cards this player owns
     */
    private List<Integer> ownedNameCards = List.of(210001);

    // ================================================================ //
    //                               World                              //
    // ================================================================ //

    /**
     * This player's current {@link World}. Excluded from serialization as a world is created for the player every time
     * they connect
     */
    private transient World world;

    /**
     * This player's current {@link Position} within their scene. Excluded from serialization as a world is created for
     * the player every time they connect
     */
    private transient Position position;

    /**
     * The ID of this player's current scene. Excluded from serialization as a world is created for the player every
     * time they connect
     */
    private transient int sceneId = 0;

    /**
     * This player's current token used to transfer between scenes. Excluded from serialization as a world is created
     * for the player every time they connect
     */
    private transient int enterSceneToken = 0;

    /**
     * This player's peer ID to their world. Excluded from serialization as a world is created for the player every
     * time they connect
     */
    private transient int peerId;

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
        if (!GameServerContainer.getServer().isSandbox()) {
            return this.properties;
        }
        Map<Integer, Integer> map = new HashMap<>(this.properties);
        map.putAll(PlayerProperty.SANDBOX_PROPERTIES);
        return map;
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

        // If the player has no avatars, give them the traveler
        if (this.avatars.isEmpty()) {
            this.avatars.add(new IrminsulAvatar(GameConstants.FEMALE_TRAVELER_AVATAR_ID, this));
            this.teamManager.getActiveTeam().getAvatars().add(this.avatars.getFirst());
        }

        // Send player data
        new PacketPlayerDataNotify(this.session).send();
        new PacketAvatarDataNotify(this.session).send();

        // Fire login event
        GameServerContainer.getServer().getEventBus().postEvent(new PlayerLoginEvent(this));

        // Continue the login process
        this.sendToScene(GameConstants.OVERWORLD_SCENE, EnterReason.Login);
        this.session.setState(SessionState.ACTIVE);
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
     * Sends this player to a specified scene at the default spawn position
     * @param sceneId The scene to send the player to
     */
    @Override
    public void sendToScene(int sceneId) {
        Position spawn = this.world.getOrCreateScene(sceneId).getSceneData().getSpawn();
        this.sendToScene(sceneId, spawn, EnterReason.Gm);
    }

    /**
     * Sends this player to a specified scene at the default spawn position
     * @param sceneId The scene to send the player to
     * @param reason  The reason for the teleport
     */
    @Override
    public void sendToScene(int sceneId, int reason) {
        Position spawn = this.world.getOrCreateScene(sceneId).getSceneData().getSpawn();
        this.sendToScene(sceneId, spawn, reason);
    }

    /**
     * Sends this player to a specified scene at a specified position
     * @param sceneId  The scene to send the player to
     * @param position The position within the new scene to send the player to
     */
    @Override
    public void sendToScene(int sceneId, @NotNull Position position) {
        this.sendToScene(sceneId, position, EnterReason.Gm);
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

        // Teleporting within the same scene
        if (teleport.getScene() == this.sceneId) {
            this.teleport(teleport.getPosition());
            return;
        }

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
        this.session.getServer().getLogger().info("Teleporting {} to {} within scene {}", this, position, this.sceneId);

        this.generateEnterSceneToken();
        this.position = position;

        if (this.getScene() != null) {
            new PacketPlayerEnterSceneNotify(this.session, new Teleport(this.sceneId, this.position,
                EnterTypeOuterClass.EnterType.ENTER_TYPE_GOTO, EnterReason.Gm)).send();

            // Rotate
            this.getScene().replaceEntity(this.teamManager.getActiveAvatar(), this.teamManager.getActiveAvatar());
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

    // ================================================================ //
    //                             Tickable                             //
    // ================================================================ //

    /**
     * Called at a regular interval by the server; update this object in some way
     */
    @Override
    public void tick() {

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
