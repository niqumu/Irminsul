package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SetUpAvatarTeamReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketSetUpAvatarTeamRsp;

public class HandlerSetUpAvatarTeamReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.SetUpAvatarTeamReq;
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

        SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq request =
            SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq.parseFrom(packet.getData());

        // Instruct the team manager to modify the team
        session.getPlayer().getTeamManager().handleSetupTeam(request.getTeamId() - 1, request.getAvatarTeamGuidListList());

        // Respond
        new PacketSetUpAvatarTeamRsp(session, request.getTeamId() - 1).send();
    }
}