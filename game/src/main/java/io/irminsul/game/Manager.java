package io.irminsul.game;

import io.irminsul.common.game.GameServer;

/**
 * Represents an abstract manager that belongs to a game server
 */
public interface Manager {

    /**
     * @return The {@link GameServer} this manager belongs to
     */
    GameServer getServer();
}
