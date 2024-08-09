package io.irminsul.game.net.handler;

import io.irminsul.common.game.GameServerContainer;
import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.PrivateChatReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;

public class HandlerPrivateChatReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.PrivateChatReq;
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

        PrivateChatReqOuterClass.PrivateChatReq request =
            PrivateChatReqOuterClass.PrivateChatReq.parseFrom(packet.getData());

        GameServerContainer.getServer().getCommandManager()
            .handlePrivateChatReq(session.getPlayer(), request.getTargetUid(), request.getText());
    }
}
