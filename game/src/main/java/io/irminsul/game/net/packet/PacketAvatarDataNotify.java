package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.game.player.PlayerTeam;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.AvatarDataNotifyOuterClass;
import io.irminsul.common.proto.AvatarTeamOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketAvatarDataNotify extends OutboundPacket {
    public PacketAvatarDataNotify(Session session) {
        super(PacketIds.AvatarDataNotify, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        AvatarDataNotifyOuterClass.AvatarDataNotify.Builder avatarDataNotifyBuilder =
            AvatarDataNotifyOuterClass.AvatarDataNotify.newBuilder()
                .setCurAvatarTeamId(session.getPlayer().getTeamManager().getActiveTeamIndex())
                .setChooseAvatarGuid(session.getPlayer().getTeamManager().getActiveAvatar().getGuid())
                .addAllOwnedCostumeList(session.getPlayer().getOwnedCostumes())
                .addAllOwnedFlycloakList(session.getPlayer().getOwnedFlyCloaks());

        // Add avatars
        session.getPlayer().getAvatars().forEach(av -> avatarDataNotifyBuilder.addAvatarList(av.buildAvatarInfo()));

        // Iterate over teams, building an object containing all avatars
        for (int index = 0; index < session.getPlayer().getTeamManager().getTeams().size(); index++) {
            PlayerTeam team = session.getPlayer().getTeamManager().getTeams().get(index);

            AvatarTeamOuterClass.AvatarTeam.Builder avatarTeamBuilder =
                AvatarTeamOuterClass.AvatarTeam.newBuilder()
                    .setTeamName(team.getName());

            team.getAvatars().forEach(avatar -> avatarTeamBuilder.addAvatarGuidList(avatar.getGuid()));
            avatarDataNotifyBuilder.putAvatarTeamMap(index, avatarTeamBuilder.build());
        }

        // TODO testing
        avatarDataNotifyBuilder.setChooseAvatarGuid(session.getPlayer().getTeamManager().getActiveAvatar().getGuid());

        this.setData(avatarDataNotifyBuilder.build().toByteArray());
    }
}
