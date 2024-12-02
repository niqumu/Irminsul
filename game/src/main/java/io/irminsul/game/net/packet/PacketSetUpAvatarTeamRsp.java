package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SetUpAvatarTeamRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketSetUpAvatarTeamRsp extends OutboundPacket {

    /**
     * @param teamId The <b>zero-indexed</b> team ID
     */
    public PacketSetUpAvatarTeamRsp(Session session, int teamId) {
        super(PacketIds.SetUpAvatarTeamRsp, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        SetUpAvatarTeamRspOuterClass.SetUpAvatarTeamRsp.Builder responseBuilder =
            SetUpAvatarTeamRspOuterClass.SetUpAvatarTeamRsp.newBuilder()
                .setTeamId(teamId + 1)
                .setCurAvatarGuid(session.getPlayer().getTeamManager().getActiveAvatar().getGuid());

        // Add avatars in team
        session.getPlayer().getTeamManager().getActiveTeam().getAvatars()
            .forEach(avatar -> responseBuilder.addAvatarTeamGuidList(avatar.getGuid()));

        this.setData(responseBuilder.build().toByteArray());
    }
}
