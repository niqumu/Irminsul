package io.irminsul.common.game;

/**
 * Represents an abstract manager that belongs to a game server
 */
public interface ServerManager {

    /**
     * @return The {@link GameServer} this manager belongs to
     */
    GameServer getServer();
}
