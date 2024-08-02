package io.irminsul.game.net.packet;

import io.irminsul.common.game.Entity;
import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SceneEntityAppearNotifyOuterClass;
import io.irminsul.common.proto.VisionTypeOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketSceneEntityAppearNotify extends OutboundPacket {
    public PacketSceneEntityAppearNotify(Session session, Entity entity) {
        super(PacketIds.SceneEntityAppearNotify, session);

        SceneEntityAppearNotifyOuterClass.SceneEntityAppearNotify sceneEntityAppearNotify =
            SceneEntityAppearNotifyOuterClass.SceneEntityAppearNotify.newBuilder()
                .addEntityList(entity.getSceneEntityInfo())
                .setAppearType(VisionTypeOuterClass.VisionType.VISION_TYPE_BORN)
                .build();
        
        this.setData(sceneEntityAppearNotify.toByteArray());
    }
}
