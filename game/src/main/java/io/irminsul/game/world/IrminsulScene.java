package io.irminsul.game.world;

import io.irminsul.common.game.Entity;
import io.irminsul.common.game.data.SceneData;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.world.Scene;
import io.irminsul.common.game.world.World;
import io.irminsul.game.data.DataContainer;
import io.irminsul.game.net.packet.PacketSceneEntityAppearNotify;
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
     * A list of {@link Player}s within this scene
     */
    private final List<Player> players = new ArrayList<>();

    /**
     * A list of {@link Entity}s within this scene
     */
    private final List<Entity> entities = new ArrayList<>();

    public IrminsulScene(@NotNull World world, int id) {
        this.world = world;
        this.id = id;
        this.sceneData = DataContainer.getOrLoadSceneData(this.id);
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
    }

    /**
     * Removes a player from the scene
     * @param player The player to remove from this scene
     */
    @Override
    public void removePlayer(@NotNull Player player) {
        this.players.remove(player);
        // todo broadcast remove avatar packet
    }

    /**
     * Adds an entity to the scene
     * @param entity The entity to add to this scene
     */
    @Override
    public void addEntity(@NotNull Entity entity) {
        this.entities.add(entity);
        new PacketSceneEntityAppearNotify(null, entity).broadcast(this.players);
    }

    /**
     * Removes an entity from this scene
     * @param entity The entity to remove from this scene
     */
    @Override
    public void removeEntity(@NotNull Entity entity) {
        this.entities.remove(entity);
        // todo broadcast remove packet
    }

    /**
     * Sends the provided player the packets needed to spawn the entities within the scene
     * @param player The player to spawn entities for
     */
    @Override
    public void addEntitiesFor(@NotNull Player player) {
        this.entities.forEach(entity -> new PacketSceneEntityAppearNotify(player.getSession(), entity).send());
    }
}