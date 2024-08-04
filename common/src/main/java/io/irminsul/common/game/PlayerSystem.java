package io.irminsul.common.game;

import io.irminsul.common.game.player.Player;

/**
 * Represents an abstract system that belongs to a player
 */
public interface PlayerSystem {

    /**
     * @return The {@link Player} this system belongs to
     */
    Player getPlayer();
}
