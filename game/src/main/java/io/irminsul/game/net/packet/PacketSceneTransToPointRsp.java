package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SceneTransToPointRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketSceneTransToPointRsp extends OutboundPacket {
    public PacketSceneTransToPointRsp(Session session, int scene, int point) {
        super(PacketIds.SceneTransToPointRsp, session);

        SceneTransToPointRspOuterClass.SceneTransToPointRsp response =
            SceneTransToPointRspOuterClass.SceneTransToPointRsp.newBuilder()
                .setSceneId(scene)
                .setPointId(point)
                .build();

        this.setData(response.toByteArray());
    }
}
