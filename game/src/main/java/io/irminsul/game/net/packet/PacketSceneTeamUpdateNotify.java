package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.AbilitySyncStateInfoOuterClass;
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

        // Iterate over players in the world
        session.getPlayer().getWorld().getPlayers().forEach(player -> {

            // Iterate over avatars on their active team
            player.getTeamManager().getActiveTeam().getAvatars().forEach(avatar -> {
                SceneTeamAvatarOuterClass.SceneTeamAvatar sceneTeamAvatar =
                    SceneTeamAvatarOuterClass.SceneTeamAvatar.newBuilder()
                        .setPlayerUid(player.getUid())
                        .setSceneId(player.getSceneId())
                        .setSceneEntityInfo(avatar.buildSceneEntityInfo())
                        .setAvatarGuid(avatar.getGuid())
                        .setAvatarAbilityInfo(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder().build())
                        .setEntityId(avatar.getEntityId())
                        .setWeaponEntityId(avatar.getWeapon().getEntityId())
                        .setWeaponGuid(avatar.getWeapon().getGuid())
                        .setWeaponAbilityInfo(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder().build())
                        .setAvatarInfo(avatar.buildAvatarInfo())
                        .setSceneAvatarInfo(avatar.buildSceneAvatarInfo())
                        .setAbilityControlBlock(avatar.buildAbilityControlBlock())
                        .build();

                builder.addSceneTeamAvatarList(sceneTeamAvatar);
            });

        });

        this.setData(builder.build().toByteArray());
    }
}
