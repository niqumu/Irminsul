package io.irminsul.game.net.handler;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.ChangeAvatarReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;

public class HandlerChangeAvatarReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.ChangeAvatarReq;
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

        ChangeAvatarReqOuterClass.ChangeAvatarReq request =
            ChangeAvatarReqOuterClass.ChangeAvatarReq.parseFrom(packet.getData());

        session.getPlayer().getTeamManager().switchActiveAvatar(request.getGuid());
    }
}
