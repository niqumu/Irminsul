package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.*;
import io.irminsul.game.net.OutboundPacket;

public class PacketPlayerEnterSceneInfoNotify extends OutboundPacket {
    public PacketPlayerEnterSceneInfoNotify(Session session) {
        super(PacketIds.PlayerEnterSceneInfoNotify, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        PlayerEnterSceneInfoNotifyOuterClass.PlayerEnterSceneInfoNotify.Builder builder =
            PlayerEnterSceneInfoNotifyOuterClass.PlayerEnterSceneInfoNotify.newBuilder()
                .setEnterSceneToken(session.getPlayer().getEnterSceneToken())
                .setCurAvatarEntityId(session.getPlayer().getTeamManager().getActiveAvatar().getId())
                .setTeamEnterInfo(
                    TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.newBuilder()
                        .setTeamEntityId(150995833)
                        .setTeamAbilityInfo(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder().build())
                        .build())
                .setMpLevelEntityInfo(
                    MPLevelEntityInfoOuterClass.MPLevelEntityInfo.newBuilder()
                        .setEntityId(184550274)
                        .setAuthorityPeerId(0)
                        .build())
                .addAvatarEnterInfo(
                    AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo.newBuilder()
                        .setAvatarGuid(0)
                        .setAvatarEntityId(0)
                        .setWeaponGuid(0)
                        .setWeaponEntityId(0)
                        .setAvatarAbilityInfo(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder().build())
                        .setWeaponAbilityInfo(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder().build())
                        .build());

        this.setData(builder.build().toByteArray());
    }
}
