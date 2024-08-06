package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SceneInitFinishRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketSceneInitFinishRsp extends OutboundPacket {
    public PacketSceneInitFinishRsp(Session session) {
        super(PacketIds.SceneInitFinishRsp, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        SceneInitFinishRspOuterClass.SceneInitFinishRsp response =
            SceneInitFinishRspOuterClass.SceneInitFinishRsp.newBuilder()
                .setEnterSceneToken(session.getPlayer().getEnterSceneToken())
                .build();

        this.setData(response.toByteArray());
    }
}
