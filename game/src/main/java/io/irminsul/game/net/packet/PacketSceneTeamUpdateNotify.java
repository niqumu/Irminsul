package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SceneTeamAvatarOuterClass;
import io.irminsul.common.proto.SceneTeamUpdateNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketSceneTeamUpdateNotify extends OutboundPacket {
    public PacketSceneTeamUpdateNotify(Session session) {
        super(PacketIds.SceneTeamUpdateNotify, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify.Builder builder =
            SceneTeamUpdateNotifyOuterClass.SceneTeamUpdateNotify.newBuilder();
        builder.setIsInMp(session.getPlayer().getWorld().isMultiplayer());

        session.getPlayer().getWorld().getPlayers().forEach(player -> {
            player.getTeamManager().getActiveTeam().getAvatars().forEach(avatar -> {
                SceneTeamAvatarOuterClass.SceneTeamAvatar.Builder avatarBuilder =
                    SceneTeamAvatarOuterClass.SceneTeamAvatar.newBuilder()
                        .setPlayerUid(player.getUid())
                        .setSceneId(player.getSceneId())
//                        .setSceneEntityInfo() // TODO
                        .setAvatarGuid(avatar.getGuid())
                        .setEntityId(avatar.getEntityId());

                if (avatar.getWeapon() != null) {
                    avatarBuilder.setWeaponEntityId(avatar.getWeapon().getEntityId());
                    avatarBuilder.setWeaponGuid(avatar.getWeapon().getGuid());
                }

                if (player.getWorld().isMultiplayer()) {
                    avatarBuilder.setAvatarInfo(avatar.getAvatarInfo());
                    avatarBuilder.setSceneAvatarInfo(avatar.getSceneAvatarInfo());
                }

                builder.addSceneTeamAvatarList(avatarBuilder.build());
            });
        });

        this.setData(builder.build().toByteArray());
    }
}
