package io.irminsul.game.player;

import io.irminsul.common.game.GameConstants;
import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.Session;
import io.irminsul.common.game.SessionState;
import io.irminsul.common.game.player.PlayerProfile;
import io.irminsul.common.game.player.PlayerProgress;
import io.irminsul.common.game.player.PlayerTeamManager;
import io.irminsul.common.game.world.Position;
import io.irminsul.common.game.world.Scene;
import io.irminsul.common.game.world.World;
import io.irminsul.game.avatar.IrminsulAvatar;
import io.irminsul.game.net.packet.PacketAvatarDataNotify;
import io.irminsul.game.net.packet.PacketPlayerDataNotify;
import io.irminsul.game.net.packet.PacketPlayerEnterSceneNotify;
import io.irminsul.game.world.IrminsulWorld;
import lombok.Data;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * An implementation of {@link Player}, representing an Irminsul player
 */
@Data
public class IrminsulPlayer implements Player {

    // ================================================================ //
    //                               Core                               //
    // ================================================================ //

    /**
     * The {@link Session} this player is connecting through
     */
    private final Session session;

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

    // ================================================================ //
    //                             Internal                             //
    // ================================================================ //

    /**
     * The last assigned free GUID
     */
    private int lastGuid = 0;

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
        this.world = new IrminsulWorld(this.session.getServer(), this);
        this.session.getServer().getWorlds().add(this.world);
        this.peerId = this.world.getNextPeerId();

        // Add default avatar
        this.avatars.add(new IrminsulAvatar(GameConstants.FEMALE_TRAVELER_AVATAR_ID, this));

        // Create managers
        this.teamManager = new IrminsulPlayerTeamManager(this);
        this.progress = new IrminsulPlayerProgress(this);
    }

    /**
     * Execute the login process for this player, sending them to the overworld scene
     */
    @Override
    public void login() {

        // Send player data
        new PacketPlayerDataNotify(this.session).send();
        new PacketAvatarDataNotify(this.session).send();

        // Let the managers handle this (TODO: let them sub to a login event)
        this.progress.onLogin();

        // Continue the login process
        this.sendToScene(GameConstants.OVERWORLD_SCENE);
        this.session.setState(SessionState.ACTIVE);
    }

    /**
     * Sends this player to a specified scene
     * @param sceneId The scene to send the player to
     */
    @Override
    public void sendToScene(int sceneId) {
        this.session.getServer().getLogger().info("Sending player {} from scene {} -> {}",
            this.uid, this.sceneId, sceneId);

        this.generateEnterSceneToken();
        this.position = this.world.getOrCreateScene(sceneId).getSceneData().getSpawn();
        this.sceneId = sceneId;
        this.world.getScenes().get(sceneId).addPlayer(this);
        new PacketPlayerEnterSceneNotify(this.session, sceneId, this.position).send();
    }

    /**
     * Sends this player to a specified scene at a specified position
     * @param sceneId The scene to send the player to
     * @param position The position within the new scene to send the player to
     */
    @Override
    public void sendToScene(int sceneId, Position position) {
        this.session.getServer().getLogger().info("Sending player {} from scene {} -> {} at {}",
            this.uid, this.sceneId, sceneId, position);

        this.generateEnterSceneToken();
        this.position = position;
        this.sceneId = sceneId;
        this.world.getScenes().get(sceneId).addPlayer(this);
        new PacketPlayerEnterSceneNotify(this.session, sceneId, this.position).send();
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
}
