package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;

// Player logout packet handler
//
// Why on earth is this a Req and not a Notify? What, is the server going to say no to the client disconnecting?
// The Rsp literally serves no purpose. The client logs out regardless...
public class HandlerPlayerForceExitReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.PlayerForceExitReq;
    }

    /**
     * Handle an incoming packet
     *
     * @param packet  The packet being sent
     * @param session The session that sent the packet
     */
    @Override
    public void handle(InboundPacket packet, Session session) throws Exception {

        // I'm technically supposed to send back an RSP, but the client is disconnecting, who cares? Not me!

        // Initiate logout sequence
        if (session.getPlayer() != null) {
            session.getPlayer().logout();
        }
    }
}
