package io.irminsul.game.net.handler;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.EvtAvatarLockChairReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketEvtAvatarLockChairRsp;

public class HandlerEvtAvatarLockChairReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.EvtAvatarLockChairReq;
    }

    /**
     * Handle an incoming packet
     *
     * @param packet  The packet being sent
     * @param session The session that sent the packet
     */
    @Override
    public void handle(InboundPacket packet, Session session) throws Exception {
        EvtAvatarLockChairReqOuterClass.EvtAvatarLockChairReq request =
            EvtAvatarLockChairReqOuterClass.EvtAvatarLockChairReq.parseFrom(packet.getData());

        new PacketEvtAvatarLockChairRsp(session, request.getChairId(), request.getPosition()).send();
    }
}
