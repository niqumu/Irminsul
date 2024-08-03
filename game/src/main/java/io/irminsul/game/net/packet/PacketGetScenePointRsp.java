package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetScenePointRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketGetScenePointRsp extends OutboundPacket {
    public PacketGetScenePointRsp(Session session, int sceneId) {
        super(PacketIds.GetScenePointRsp, session);

        GetScenePointRspOuterClass.GetScenePointRsp.Builder builder =
            GetScenePointRspOuterClass.GetScenePointRsp.newBuilder()
                .setSceneId(sceneId);

        this.setData(builder.build().toByteArray());
    }
}
