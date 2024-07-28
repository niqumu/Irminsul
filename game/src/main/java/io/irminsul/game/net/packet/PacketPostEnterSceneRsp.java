package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.EnterSceneDoneRspOuterClass;
import io.irminsul.common.proto.PostEnterSceneRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketPostEnterSceneRsp extends OutboundPacket {
    public PacketPostEnterSceneRsp(Session session) {
        super(PacketIds.PostEnterSceneRsp, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        PostEnterSceneRspOuterClass.PostEnterSceneRsp response =
            PostEnterSceneRspOuterClass.PostEnterSceneRsp.newBuilder()
                .setEnterSceneToken(session.getPlayer().getEnterSceneToken())
                .build();

        this.setData(response.toByteArray());
    }
}
