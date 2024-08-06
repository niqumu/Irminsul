package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SetPlayerNameReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketSetPlayerNameRsp;

public class HandlerSetPlayerNameReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.SetPlayerNameReq;
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

        SetPlayerNameReqOuterClass.SetPlayerNameReq request =
            SetPlayerNameReqOuterClass.SetPlayerNameReq.parseFrom(packet.getData());

        session.getPlayer().getProfile().setNickname(request.getNickName());
        new PacketSetPlayerNameRsp(session, request.getNickName()).send();
    }
}
