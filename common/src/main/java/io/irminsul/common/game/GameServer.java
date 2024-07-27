package io.irminsul.common.game;

import kcp.highway.Ukcp;
import org.slf4j.Logger;

import java.util.HashMap;

public interface GameServer {

    /**
     * @return This server's logger
     */
    Logger getLogger();

    /**
     * @return The port this web server is running on
     */
    int getPort();

    /**
     * @return A map of {@link Session}s connected to the server
     */
    HashMap<Ukcp, Session> getSessions();

    /**
     * Handles a packet
     * @param raw The raw bytes of the packet
     * @param session The session that sent the packet
     */
    void handlePacket(byte[] raw, Session session);
}
