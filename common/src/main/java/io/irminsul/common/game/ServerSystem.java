package io.irminsul.common.game;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

/**
 * Represents an abstract system that belongs to a game server
 */
public interface ServerSystem {

    /**
     * @return The {@link GameServer} this system belongs to
     */
    @NotNull GameServer getServer();

    /**
     * @return This system's parent server's SLF4J logger
     */
    default @NotNull Logger getLogger() {
        return this.getServer().getLogger();
    }
}
