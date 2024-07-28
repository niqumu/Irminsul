package io.irminsul.game.net.handler;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.PlayerLoginReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketPlayerLoginRsp;

public class HandlerPlayerLoginReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.PlayerLoginReq;
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

        PlayerLoginReqOuterClass.PlayerLoginReq loginReq =
            PlayerLoginReqOuterClass.PlayerLoginReq.parseFrom(packet.getData());

        // TODO authenticate - this always works!

        session.getPlayer().login();

        new PacketPlayerLoginRsp(session).send();
    }
}
