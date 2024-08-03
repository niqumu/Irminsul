package io.irminsul.game.net.handler;

import io.irminsul.common.game.Session;
import io.irminsul.common.game.player.PlayerProfile;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetPlayerSocialDetailReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketGetPlayerSocialDetailRsp;

public class HandlerGetPlayerSocialDetailReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.GetPlayerSocialDetailReq;
    }

    /**
     * Handle an incoming packet
     *
     * @param packet  The packet being sent
     * @param session The session that sent the packet
     */
    @Override
    public void handle(InboundPacket packet, Session session) throws Exception {
        GetPlayerSocialDetailReqOuterClass.GetPlayerSocialDetailReq request =
            GetPlayerSocialDetailReqOuterClass.GetPlayerSocialDetailReq.parseFrom(packet.getData());

        PlayerProfile profile = session.getServer().lookupPlayerProfile(request.getUid());

        if (profile != null) {
            new PacketGetPlayerSocialDetailRsp(session, profile).send();
        }
    }
}
