package io.irminsul.common.game.world;

import io.irminsul.common.game.Entity;
import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.property.EntityIdType;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

public interface World extends Entity {

    /**
     * @return The {@link GameServer} that this world belongs to
     */
    @NotNull GameServer getServer();

    /**
     * @return The {@link Player} hosting this world
     */
    @NotNull Player getHost();

    /**
     * @return A list of {@link Player}s in this world
     */
    @NotNull List<Player> getPlayers();

    /**
     * @return A map of loaded {@link Scene}s in this World, keyed by scene ID
     */
    @NotNull Map<Integer, Scene> getScenes();

    /**
     * @return Whether this world is mutiplayer
     */
    boolean isMultiplayer();

    /**
     * @return The world level of this world
     */
    int getWorldLevel();

    /**
     * @return Whether this world is currently paused/frozen
     */
    boolean isPaused();

    /**
     * @return The next free entity ID
     */
    int getNextEntityId(EntityIdType type);

    /**
     * @return The next free connection/peer ID
     */
    int getNextPeerId();

    @NotNull Scene getOrCreateScene(int sceneId);
}
