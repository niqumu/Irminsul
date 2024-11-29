package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SetPlayerBirthdayReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketSetPlayerBirthdayRsp;

public class HandlerSetPlayerBirthdayReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.SetPlayerBirthdayReq;
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

        SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq request =
            SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq.parseFrom(packet.getData());

        int month = request.getBirthday().getMonth(), day = request.getBirthday().getDay();

        session.getPlayer().getProfile().setBirthday(month, day);
        new PacketSetPlayerBirthdayRsp(session, month, day).send();

        // Log
        session.getServer().getLogger().info("{} set their birthday to {}/{}!", session.getPlayer(), month, day);
    }
}
