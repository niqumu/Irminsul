package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SetPlayerSignatureReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketSetPlayerSignatureRsp;

public class HandlerSetPlayerSignatureReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.SetPlayerSignatureReq;
    }

    /**
     * Handle an incoming packet
     *
     * @param packet  The packet being sent
     * @param session The session that sent the packet
     */
    @Override
    public void handle(InboundPacket packet, Session session) throws Exception {
        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq request =
            SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq.parseFrom(packet.getData());

        session.getPlayer().getProfile().setSignature(request.getSignature());
        new PacketSetPlayerSignatureRsp(session, request.getSignature()).send();
    }
}
