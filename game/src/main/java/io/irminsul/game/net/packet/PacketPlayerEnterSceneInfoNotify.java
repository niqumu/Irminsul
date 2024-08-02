package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.*;
import io.irminsul.game.net.OutboundPacket;

public class PacketPlayerEnterSceneInfoNotify extends OutboundPacket {
    public PacketPlayerEnterSceneInfoNotify(Session session) {
        super(PacketIds.PlayerEnterSceneInfoNotify, session);

        Player player = session.getPlayer();

        if (player == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        PlayerEnterSceneInfoNotifyOuterClass.PlayerEnterSceneInfoNotify.Builder builder =
            PlayerEnterSceneInfoNotifyOuterClass.PlayerEnterSceneInfoNotify.newBuilder()
                .setEnterSceneToken(player.getEnterSceneToken())
                .setCurAvatarEntityId(player.getTeamManager().getActiveAvatar().getEntityId())
                .setTeamEnterInfo(
                    TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo.newBuilder()
                        .setTeamEntityId(player.getTeamManager().getActiveTeam().getEntityId())
                        .setTeamAbilityInfo(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder().build())
                        .setAbilityControlBlock(AbilityControlBlockOuterClass.AbilityControlBlock.newBuilder().build())
                        .build())
                .setMpLevelEntityInfo(
                    MPLevelEntityInfoOuterClass.MPLevelEntityInfo.newBuilder()
                        .setEntityId(player.getWorld().getEntityId())
                        .setAuthorityPeerId(player.getWorld().getHost().getPeerId())
                        .build())
                .addAvatarEnterInfo(
                    AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo.newBuilder()
                        .setAvatarGuid(player.getTeamManager().getActiveAvatar().getGuid())
                        .setAvatarEntityId(player.getTeamManager().getActiveAvatar().getEntityId())
                        .setWeaponGuid(player.getTeamManager().getActiveAvatar().getWeapon().getGuid())
                        .setWeaponEntityId(player.getTeamManager().getActiveAvatar().getWeapon().getEntityId())
                        .setAvatarAbilityInfo(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder().build())
                        .setWeaponAbilityInfo(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder().build())
                        .build());

        System.out.println("PacketPlayerEnterSceneInfoNotify: CurAvatarEntityId: " + builder.getCurAvatarEntityId());
        System.out.println("PacketPlayerEnterSceneInfoNotify: AvatarEnterInfo EntityId: " + builder.getAvatarEnterInfo(0).getAvatarEntityId());
        this.setData(builder.build().toByteArray());
    }
}
