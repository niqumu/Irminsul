package io.irminsul.common.game.world;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.player.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface World {

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
}
