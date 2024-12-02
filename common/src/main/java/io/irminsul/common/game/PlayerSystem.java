package io.irminsul.common.game;

import io.irminsul.common.game.player.Player;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

/**
 * Represents an abstract system that belongs to a player
 */
public interface PlayerSystem {

    /**
     * @return The {@link Player} this system belongs to
     */
    Player getPlayer();

    /**
     * @return This system's parent server's SLF4J logger
     */
    default @NotNull Logger getLogger() {
        return this.getPlayer().getServer().getLogger();
    }
}
