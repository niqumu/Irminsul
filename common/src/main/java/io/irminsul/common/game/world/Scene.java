package io.irminsul.common.game.world;

import io.irminsul.common.game.Tickable;
import io.irminsul.common.game.data.scene.SceneData;
import io.irminsul.common.game.player.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Represents a scene within a {@link World}
 */
public interface Scene extends Tickable {

    /**
     * @return The {@link World} that this scene belongs to
     */
    @NotNull World getWorld();

    /**
     * @return This scene's ID
     */
    int getId();

    /**
     * @return The spawn point of this scene, as a {@link Position}
     */
    @NotNull Position getSpawnPoint();

    /**
     * @return The {@link SceneData} of this scene
     */
    @NotNull SceneData getSceneData();

    /**
     * @return The {@link SceneScriptManager} instance of this scene
     */
    @NotNull SceneScriptManager getScriptManager();

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
     * Replace an entity with a new one
     * @param oldEntity The entity to replace
     * @param newEntity The entity to replace oldEntity with
     */
    void replaceEntity(@NotNull Entity oldEntity, @NotNull Entity newEntity);

    /**
     * Sends the provided player the packets needed to spawn the entities within the scene
     * @param player The player to spawn entities for
     */
    void addEntitiesFor(@NotNull Player player);

    /**
     * @return The current time, in seconds, that has elapsed within this scene
     */
    int getSceneTime();

    /**
     * Modifies the current scene time by a set amount of milliseconds
     * @param millis The amount, in milliseconds, to modify the scene time by
     */
    void modifySceneTime(long millis);

    /**
     * Informs all players in this scene of the current time
     */
    void broadcastTime();

    /**
     * Inform a player of the current time
     * @param player The player to inform
     */
    void sendTime(@NotNull Player player);
}
