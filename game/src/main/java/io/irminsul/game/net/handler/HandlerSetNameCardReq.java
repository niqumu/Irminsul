package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SetNameCardReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketSetNameCardRsp;

public class HandlerSetNameCardReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.SetNameCardReq;
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
            session.getServer().getLogger().warn("Tried to handle packet {} in a bad state: player cannot be null!", this);
            return;
        }

        SetNameCardReqOuterClass.SetNameCardReq request =
            SetNameCardReqOuterClass.SetNameCardReq.parseFrom(packet.getData());

        session.getPlayer().getProfile().setNameCard(request.getNameCardId());
        new PacketSetNameCardRsp(session).send();

        // Log
        session.getServer().getLogger().info("{} set their namecard to {}!", session.getPlayer(), request.getNameCardId());
    }
}
