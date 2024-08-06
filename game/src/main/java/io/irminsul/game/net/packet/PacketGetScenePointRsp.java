package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetScenePointRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketGetScenePointRsp extends OutboundPacket {
    public PacketGetScenePointRsp(Session session, int sceneId) {
        super(PacketIds.GetScenePointRsp, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        GetScenePointRspOuterClass.GetScenePointRsp.Builder builder =
            GetScenePointRspOuterClass.GetScenePointRsp.newBuilder()
                .setSceneId(sceneId);

        // Add the player's unlocked scene points
        builder.addAllUnlockedPointList(session.getPlayer().getProgress().getUnlockedScenePoints(sceneId));

        this.setData(builder.build().toByteArray());
    }
}
