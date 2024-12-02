package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SkipPlayerGameTimeReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketSkipPlayerGameTimeRsp;
import io.irminsul.game.world.IrminsulScene;

public class HandlerSkipPlayerGameTimeReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.SkipPlayerGameTimeReq;
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

        SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq request =
            SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq.parseFrom(packet.getData());

        // Set the time and send it
        session.getPlayer().getScene().modifySceneTime((request.getGameTime() * 1000L) -
            ((IrminsulScene) session.getPlayer().getScene()).getTimeModifier());
        session.getPlayer().getScene().broadcastTime();

        // Respond
        new PacketSkipPlayerGameTimeRsp(session, request.getClientGameTime(), (int) (session.getPlayer().getScene().getSceneTime() / 1000L)).send();
    }
}
