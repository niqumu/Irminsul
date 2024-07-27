package io.irminsul.game.net;

import io.irminsul.common.game.Session;

public interface PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    int getTargetID();

    /**
     * Handle an incoming packet
     * @param packet The packet being sent
     * @param session The session that sent the packet
     */
    void handle(InboundPacket packet, Session session) throws Exception;
}
