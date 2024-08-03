package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetSceneAreaRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketGetSceneAreaRsp extends OutboundPacket {
    public PacketGetSceneAreaRsp(Session session, int sceneId) {
        super(PacketIds.GetSceneAreaRsp, session);

        GetSceneAreaRspOuterClass.GetSceneAreaRsp.Builder builder =
            GetSceneAreaRspOuterClass.GetSceneAreaRsp.newBuilder()
                .setSceneId(sceneId);

        this.setData(builder.build().toByteArray());
    }
}
