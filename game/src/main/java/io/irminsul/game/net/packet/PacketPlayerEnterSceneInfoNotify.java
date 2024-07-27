package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.PlayerEnterSceneInfoNotifyOuterClass;
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
                .setEnterSceneToken(session.getPlayer().getEnterSceneToken());
//                .setTeamEnterInfo()
//                .setMpLevelEntityInfo();

        this.setData(builder.build().toByteArray());
    }
}
