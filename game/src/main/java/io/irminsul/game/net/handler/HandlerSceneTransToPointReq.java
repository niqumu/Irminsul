package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.game.data.scene.SceneData;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SceneTransToPointReqOuterClass;
import io.irminsul.game.data.EnterReason;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketSceneTransToPointRsp;

public class HandlerSceneTransToPointReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.SceneTransToPointReq;
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

        if (session.getPlayer().getScene() == null) {
            session.getServer().getLogger().warn("Tried to handle packet {} in a bad state: scene cannot be null!", this);
            return;
        }

        SceneTransToPointReqOuterClass.SceneTransToPointReq request =
            SceneTransToPointReqOuterClass.SceneTransToPointReq.parseFrom(packet.getData());
        int sceneId = request.getSceneId(), pointId = request.getPointId();

        // Teleport the player TODO rotations are broken, figure that out
        SceneData sceneData = session.getPlayer().getWorld().getOrCreateScene(sceneId).getSceneData();
        session.getPlayer().sendToScene(sceneId, sceneData.getTransPoints().get(pointId).getTransPosition(),
            EnterReason.TRANS_POINT);

        // Respond
        new PacketSceneTransToPointRsp(session, request.getSceneId(), request.getPointId());
    }
}
