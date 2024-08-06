package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.UnlockTransPointReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketUnlockTransPointRsp;

public class HandlerUnlockTransPointReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.UnlockTransPointReq;
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

        UnlockTransPointReqOuterClass.UnlockTransPointReq request =
            UnlockTransPointReqOuterClass.UnlockTransPointReq.parseFrom(packet.getData());

        // Save the saved unlocked waypoint
        session.getPlayer().getProgress().unlockScenePoint(request.getSceneId(), request.getPointId());

        // Respond to the client
        new PacketUnlockTransPointRsp(session).send();
    }
}
