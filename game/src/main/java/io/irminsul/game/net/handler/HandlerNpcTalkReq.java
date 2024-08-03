package io.irminsul.game.net.handler;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.NpcTalkReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketNpcTalkRsp;

public class HandlerNpcTalkReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.NpcTalkReq;
    }

    /**
     * Handle an incoming packet
     *
     * @param packet  The packet being sent
     * @param session The session that sent the packet
     */
    @Override
    public void handle(InboundPacket packet, Session session) throws Exception {
        NpcTalkReqOuterClass.NpcTalkReq request = NpcTalkReqOuterClass.NpcTalkReq.parseFrom(packet.getData());
        new PacketNpcTalkRsp(session, request.getNpcEntityId(), request.getTalkId(), request.getEntityId()).send();
    }
}
