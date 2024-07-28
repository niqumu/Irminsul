package io.irminsul.game;

import io.irminsul.common.game.player.Player;

/**
 * Represents an abstract manager that belongs to a player
 */
public interface PlayerManager {

    /**
     * @return The {@link Player} this manager belongs to
     */
    Player getPlayer();
}
