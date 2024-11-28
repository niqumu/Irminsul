package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.PullPrivateChatReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;

public class HandlerPullPrivateChatReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.PullPrivateChatReq;
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

        PullPrivateChatReqOuterClass.PullPrivateChatReq request =
            PullPrivateChatReqOuterClass.PullPrivateChatReq.parseFrom(packet.getData());

        session.getServer().getCommandManager().handlePullPrivateChatReq(session.getPlayer(), request.getTargetUid());
    }
}
