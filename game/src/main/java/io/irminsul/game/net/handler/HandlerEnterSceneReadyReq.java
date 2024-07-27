package io.irminsul.game.net.handler;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.EnterSceneReadyReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketEnterScenePeerNotify;
import io.irminsul.game.net.packet.PacketEnterSceneReadyRsp;

public class HandlerEnterSceneReadyReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.EnterSceneReadyReq;
    }

    /**
     * Handle an incoming packet
     *
     * @param packet  The packet being sent
     * @param session The session that sent the packet
     */
    @Override
    public void handle(InboundPacket packet, Session session) throws Exception {
        EnterSceneReadyReqOuterClass.EnterSceneReadyReq request =
            EnterSceneReadyReqOuterClass.EnterSceneReadyReq.parseFrom(packet.getData());

        new PacketEnterScenePeerNotify(session, request.getEnterSceneToken()).send();
        new PacketEnterSceneReadyRsp(session, request.getEnterSceneToken()).send();
    }
}
