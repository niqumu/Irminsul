package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.game.world.Position;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.MapMarkPointTypeOuterClass.MapMarkPointType;
import io.irminsul.common.proto.MarkMapReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;

public class HandlerMarkMapReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.MarkMapReq;
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

        MarkMapReqOuterClass.MarkMapReq request = MarkMapReqOuterClass.MarkMapReq.parseFrom(packet.getData());

        // Sandbox mode teleportation
        if (request.getOp().equals(MarkMapReqOuterClass.MarkMapReq.Operation.OPERATION_ADD) &&
                request.getMark().getPointType().equals(MapMarkPointType.MAP_MARK_POINT_TYPE_FISH_POOL) &&
                session.getServer().getConfig().isSandbox()) {

            session.getPlayer().sendToScene(request.getMark().getSceneId(),
                new Position(request.getMark().getPos().getX(), 500, request.getMark().getPos().getZ()));
        }
    }
}
