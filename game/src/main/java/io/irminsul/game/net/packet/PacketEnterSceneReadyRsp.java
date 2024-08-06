package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.EnterSceneReadyRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketEnterSceneReadyRsp extends OutboundPacket {
    public PacketEnterSceneReadyRsp(Session session) {
        super(PacketIds.EnterSceneReadyRsp, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        EnterSceneReadyRspOuterClass.EnterSceneReadyRsp response =
            EnterSceneReadyRspOuterClass.EnterSceneReadyRsp.newBuilder()
                .setEnterSceneToken(session.getPlayer().getEnterSceneToken())
                .build();

        this.setData(response.toByteArray());
    }
}
