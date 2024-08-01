package io.irminsul.game.net.handler;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetSceneAreaReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketGetSceneAreaRsp;

public class HandlerGetSceneAreaReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.GetSceneAreaReq;
    }

    /**
     * Handle an incoming packet
     *
     * @param packet  The packet being sent
     * @param session The session that sent the packet
     */
    @Override
    public void handle(InboundPacket packet, Session session) throws Exception {
        GetSceneAreaReqOuterClass.GetSceneAreaReq request =
            GetSceneAreaReqOuterClass.GetSceneAreaReq.parseFrom(packet.getData());

        new PacketGetSceneAreaRsp(session, request.getSceneId()).send();
    }
}
