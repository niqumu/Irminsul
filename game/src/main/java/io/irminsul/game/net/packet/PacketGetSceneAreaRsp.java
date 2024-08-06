package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetSceneAreaRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketGetSceneAreaRsp extends OutboundPacket {
    public PacketGetSceneAreaRsp(Session session, int sceneId) {
        super(PacketIds.GetSceneAreaRsp, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        GetSceneAreaRspOuterClass.GetSceneAreaRsp.Builder builder =
            GetSceneAreaRspOuterClass.GetSceneAreaRsp.newBuilder()
                .setSceneId(sceneId);

        // Add the player's unlocked scene areas
        builder.addAllAreaIdList(session.getPlayer().getProgress().getUnlockedSceneAreas(sceneId));

        this.setData(builder.build().toByteArray());
    }
}
