package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SetPlayerHeadImageReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketSetPlayerHeadImageRsp;

public class HandlerSetPlayerHeadImageReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.SetPlayerHeadImageReq;
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

        SetPlayerHeadImageReqOuterClass.SetPlayerHeadImageReq request =
            SetPlayerHeadImageReqOuterClass.SetPlayerHeadImageReq.parseFrom(packet.getData());

        // Set profile picture
        session.getPlayer().getProfile().setProfilePicture(request.getAvatarId());

        // Log
        session.getServer().getLogger().info("{} changed their profile picture to {}!", session.getPlayer(), request.getAvatarId());

        // Response
        new PacketSetPlayerHeadImageRsp(session).send();
    }
}
