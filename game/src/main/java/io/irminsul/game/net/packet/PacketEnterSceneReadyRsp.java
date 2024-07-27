package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.EnterSceneReadyRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketEnterSceneReadyRsp extends OutboundPacket {
    public PacketEnterSceneReadyRsp(Session session, int enterSceneToken) {
        super(PacketIds.EnterSceneReadyRsp, session);

        EnterSceneReadyRspOuterClass.EnterSceneReadyRsp response =
            EnterSceneReadyRspOuterClass.EnterSceneReadyRsp.newBuilder()
                .setEnterSceneToken(enterSceneToken)
                .build();

        this.setData(response.toByteArray());
    }
}
