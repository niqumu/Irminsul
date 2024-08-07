package io.irminsul.game.world;

import io.irminsul.common.game.world.Entity;
import io.irminsul.common.game.data.scene.SceneData;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.world.Scene;
import io.irminsul.common.game.world.SceneScriptManager;
import io.irminsul.common.game.world.World;
import io.irminsul.common.proto.VisionTypeOuterClass;
import io.irminsul.game.data.DataContainer;
import io.irminsul.game.net.packet.PacketPlayerGameTimeNotify;
import io.irminsul.game.net.packet.PacketSceneEntityAppearNotify;
import io.irminsul.game.net.packet.PacketSceneEntityDisappearNotify;
import io.irminsul.game.net.packet.PacketSceneTimeNotify;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of {@link Scene}, representing a scene within a {@link World}
 */
@Data
public class IrminsulScene implements Scene {

    /**
     * The {@link World} that this scene belongs to
     */
    private final World world;

    /**
     * This scene's ID
     */
    private final int id;

    /**
     * The {@link SceneData} of this scene
     */
    private final SceneData sceneData;

    /**
     * The {@link SceneScriptManager} instance of this scene
     */
    private final SceneScriptManager scriptManager;

    /**
     * A list of {@link Player}s within this scene
     */
    private final List<Player> players = new ArrayList<>();

    /**
     * A list of {@link Entity}s within this scene
     */
    private final List<Entity> entities = new ArrayList<>();

    /**
     * The last timestamp at which the time was broadcast to all players
     */
    private long lastTimeBroadcast = 0;

    /**
     * The timestamp at which this scene was created
     */
    private long creationTime = System.currentTimeMillis();

    /**
     * Adjustable scene time offset, in milliseconds
     */
    private long timeModifier = 0;

    public IrminsulScene(@NotNull World world, int id) {
        this.world = world;
        this.id = id;

        // Load scene data
        this.sceneData = DataContainer.getOrLoadSceneData(this.id);

        // Set up scripts
        this.scriptManager = new IrminsulSceneScriptManager(this);
    }

    /**
     * Adds a player to the scene
     * @param player The player to add to this scene
     */
    @Override
    public void addPlayer(@NotNull Player player) {

        // Remove the player from their last scene
        if (player.getScene() != null) {
            player.getScene().removePlayer(player);
        }

        // Add the player to this scene
        player.setSceneId(this.id);
        this.players.add(player);

        // Add the player's avatar to the scene
        this.addEntity(player.getTeamManager().getActiveAvatar());

        // Inform the player of the current time in this scene
        this.sendTime(player);
    }

    /**
     * Removes a player from the scene
     * @param player The player to remove from this scene
     */
    @Override
    public void removePlayer(@NotNull Player player) {
        this.players.remove(player);

        // Remove the player's avatar fom the scene
        this.removeEntity(player.getTeamManager().getActiveAvatar());
    }

    /**
     * Adds an entity to the scene
     * @param entity The entity to add to this scene
     */
    @Override
    public void addEntity(@NotNull Entity entity) {
        this.entities.add(entity);
        new PacketSceneEntityAppearNotify(null, entity,
            VisionTypeOuterClass.VisionType.VISION_TYPE_BORN).broadcast(this.players);
    }

    /**
     * Removes an entity from this scene
     * @param entity The entity to remove from this scene
     */
    @Override
    public void removeEntity(@NotNull Entity entity) {
        this.entities.remove(entity);
        new PacketSceneEntityDisappearNotify(null, entity,
            VisionTypeOuterClass.VisionType.VISION_TYPE_REMOVE).broadcast(this.players);
    }

    /**
     * Replace an entity with a new one
     * @param oldEntity The entity to replace
     * @param newEntity The entity to replace oldEntity with
     */
    @Override
    public void replaceEntity(@NotNull Entity oldEntity, @NotNull Entity newEntity) {

        // Remove old
        this.entities.remove(oldEntity);
        new PacketSceneEntityDisappearNotify(null, oldEntity,
            VisionTypeOuterClass.VisionType.VISION_TYPE_REPLACE).broadcast(this.players);

        // Add new
        this.entities.add(newEntity);
        new PacketSceneEntityAppearNotify(null, newEntity,
            VisionTypeOuterClass.VisionType.VISION_TYPE_REPLACE).broadcast(this.players);
    }

    /**
     * Sends the provided player the packets needed to spawn the entities within the scene
     * @param player The player to spawn entities for
     */
    @Override
    public void addEntitiesFor(@NotNull Player player) {
        this.entities.forEach(entity -> new PacketSceneEntityAppearNotify(player.getSession(), entity,
            VisionTypeOuterClass.VisionType.VISION_TYPE_BORN).send());
    }

    /**
     * @return The current time, in seconds, that has elapsed within this scene
     */
    @Override
    public int getSceneTime() {
        return (int) ((System.currentTimeMillis() - this.creationTime + this.timeModifier) / 1000);
    }

    /**
     * Modifies the current scene time by a set amount of milliseconds
     * @param millis The amount, in milliseconds, to modify the scene time by
     */
    @Override
    public void modifySceneTime(long millis) {
        this.timeModifier += millis;
    }

    /**
     * Informs all players in this scene of the current time
     */
    @Override
    public void broadcastTime() {
        this.players.forEach(this::sendTime);
        this.lastTimeBroadcast = System.currentTimeMillis();
    }

    /**
     * Inform a player of the current time
     * @param player The player to inform
     */
    @Override
    public void sendTime(@NotNull Player player) {
        new PacketSceneTimeNotify(player.getSession(), this).send();
        new PacketPlayerGameTimeNotify(player.getSession(), this.getSceneTime()).send();
    }

    /**
     * Called at a regular interval by the server; update this object in some way
     */
    @Override
    public void tick() {

        // Don't tick this scene if it's empty
        if (this.players.isEmpty()) {
            return;
        }

        // Tick players
        this.players.forEach(Player::tick);

        // Broadcast time if the parent world is not paused
        if (System.currentTimeMillis() - this.lastTimeBroadcast >= 10000 && !this.world.isPaused()) {
            this.broadcastTime();
        }
    }
}
