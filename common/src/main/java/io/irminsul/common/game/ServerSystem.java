package io.irminsul.common.game;

/**
 * Represents an abstract system that belongs to a game server
 */
public interface ServerSystem {

    /**
     * @return The {@link GameServer} this system belongs to
     */
    GameServer getServer();
}
