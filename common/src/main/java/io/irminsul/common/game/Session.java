package io.irminsul.common.game;

import io.irminsul.common.game.net.KcpChannel;
import io.irminsul.common.game.net.KcpTunnel;

public interface Session extends KcpChannel {

    /**
     * @return The {@link GameServer} the session belongs to
     */
    GameServer getServer();

    /**
     * @return The {@link KcpTunnel} of the session
     */
    KcpTunnel getTunnel();

    /**
     * @return The current {@link SessionState} of the session
     */
    SessionState getState();

    /**
     * Sets the state of the session
     * @param state The new {@link SessionState} of the session
     */
    void setState(SessionState state);

    /**
     * @return The next client sequence to use
     */
    int getNextClientSequence();

    /**
     * Enables encryption of packets
     */
    void enableEncryption();
}
