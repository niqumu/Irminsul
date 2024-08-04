package io.irminsul.game.net.handler;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.PlayerSetPauseReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketPlayerSetPauseRsp;

public class HandlerPlayerSetPauseReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.PlayerSetPauseReq;
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

        PlayerSetPauseReqOuterClass.PlayerSetPauseReq request =
            PlayerSetPauseReqOuterClass.PlayerSetPauseReq.parseFrom(packet.getData());

        // Pausing cannot be done in multiplayer
        if (!session.getPlayer().getWorld().isMultiplayer()) {
            session.getPlayer().getWorld().setPaused(request.getIsPaused());
            new PacketPlayerSetPauseRsp(session).send();
        }
    }
}
