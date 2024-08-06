package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.game.data.scene.DungeonEntryPoint;
import io.irminsul.common.game.data.scene.SceneData;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.DungeonEntryInfoReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketDungeonEntryInfoRsp;

public class HandlerDungeonEntryInfoReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.DungeonEntryInfoReq;
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

        DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq request =
            DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq.parseFrom(packet.getData());

        SceneData sceneData = session.getPlayer().getWorld().getOrCreateScene(request.getSceneId()).getSceneData();
        DungeonEntryPoint dungeonEntryPoint = sceneData.getDungeonEntryPoints().get(request.getPointId());

        // Sanity check
        if (dungeonEntryPoint == null) {
            session.getServer().getLogger().warn("{} tried to access an unknown dungeon entrance: scene {} point {}",
                session.getPlayer(), request.getSceneId(), request.getPointId());
            return;
        }

        new PacketDungeonEntryInfoRsp(session, request.getPointId(), dungeonEntryPoint).send();
    }
}
