package io.irminsul.game.net.packet;

import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.net.Session;
import io.irminsul.common.game.player.PlayerTeam;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.AvatarTeamOuterClass;
import io.irminsul.common.proto.AvatarTeamUpdateNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketAvatarTeamUpdateNotify extends OutboundPacket {
    public PacketAvatarTeamUpdateNotify(Session session) {
        super(PacketIds.AvatarTeamUpdateNotify, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify.Builder builder =
            AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify.newBuilder();

        for (int i = 0; i < session.getPlayer().getTeamManager().getTeams().size(); i++) {
            PlayerTeam team = session.getPlayer().getTeamManager().getTeams().get(i);

            builder.putAvatarTeamMap(i + 1,
                AvatarTeamOuterClass.AvatarTeam.newBuilder()
                    .setTeamName(team.getName())
                    .addAllAvatarGuidList(team.getAvatars().stream().map(Avatar::getGuid).toList())
                    .build()
            );
        }

        this.setData(builder.build().toByteArray());
    }
}
