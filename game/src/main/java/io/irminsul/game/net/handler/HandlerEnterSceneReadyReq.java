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
        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to handle packet {} in a bad state: player cannot be null!", this);
            return;
        }

        EnterSceneReadyReqOuterClass.EnterSceneReadyReq request =
            EnterSceneReadyReqOuterClass.EnterSceneReadyReq.parseFrom(packet.getData());

        session.getPlayer().setEnterSceneToken(request.getEnterSceneToken());
        new PacketEnterScenePeerNotify(session).send();
        new PacketEnterSceneReadyRsp(session).send();
    }
}
