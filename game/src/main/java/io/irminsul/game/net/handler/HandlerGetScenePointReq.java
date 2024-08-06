package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetScenePointReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketGetScenePointRsp;

public class HandlerGetScenePointReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.GetScenePointReq;
    }

    /**
     * Handle an incoming packet
     *
     * @param packet  The packet being sent
     * @param session The session that sent the packet
     */
    @Override
    public void handle(InboundPacket packet, Session session) throws Exception {
        GetScenePointReqOuterClass.GetScenePointReq request =
            GetScenePointReqOuterClass.GetScenePointReq.parseFrom(packet.getData());

        new PacketGetScenePointRsp(session, request.getSceneId()).send();
    }
}
