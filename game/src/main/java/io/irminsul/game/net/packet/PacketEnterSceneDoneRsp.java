package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.EnterSceneDoneRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketEnterSceneDoneRsp extends OutboundPacket {
    public PacketEnterSceneDoneRsp(Session session) {
        super(PacketIds.EnterSceneDoneRsp, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        EnterSceneDoneRspOuterClass.EnterSceneDoneRsp response =
            EnterSceneDoneRspOuterClass.EnterSceneDoneRsp.newBuilder()
                .setEnterSceneToken(session.getPlayer().getEnterSceneToken())
                .build();

        this.setData(response.toByteArray());
    }
}
