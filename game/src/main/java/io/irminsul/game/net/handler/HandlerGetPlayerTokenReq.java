package io.irminsul.game.net.handler;

import io.irminsul.common.game.Session;
import io.irminsul.common.proto.PacketIds;
import io.irminsul.game.net.GenericPacket;
import io.irminsul.game.net.PacketHandler;

public class HandlerGetPlayerTokenReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.GetPlayerTokenReq;
    }

    /**
     * Handle an incoming packet
     *
     * @param packet  The packet being sent
     * @param session The session that sent the packet
     */
    @Override
    public void handle(GenericPacket packet, Session session) {
        System.out.println("Handling packet!");
    }
}
