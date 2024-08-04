package io.irminsul.common.game.world;

import io.irminsul.common.game.Entity;
import io.irminsul.common.game.data.scene.SceneData;
import io.irminsul.common.game.player.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Represents a scene within a {@link World}
 */
public interface Scene {

    /**
     * @return The {@link World} that this scene belongs to
     */
    @NotNull World getWorld();

    /**
     * @return This scene's ID
     */
    int getId();

    /**
     * @return The {@link SceneData} of this scene
     */
    @NotNull SceneData getSceneData();

    /**
     * @return A list of {@link Player}s within this scene
     */
    @NotNull List<Player> getPlayers();

    /**
     * @return A list of {@link Entity}s within this scene
     */
    @NotNull List<Entity> getEntities();

    /**
     * Adds a player to the scene
     * @param player The player to add to this scene
     */
    void addPlayer(@NotNull Player player);

    /**
     * Removes a player from the scene
     * @param player The player to remove from this scene
     */
    void removePlayer(@NotNull Player player);

    /**
     * Adds an entity to the scene
     * @param entity The entity to add to this scene
     */
    void addEntity(@NotNull Entity entity);

    /**
     * Removes an entity from this scene
     * @param entity The entity to remove from this scene
     */
    void removeEntity(@NotNull Entity entity);

    /**
     * Sends the provided player the packets needed to spawn the entities within the scene
     * @param player The player to spawn entities for
     */
    void addEntitiesFor(@NotNull Player player);
}
