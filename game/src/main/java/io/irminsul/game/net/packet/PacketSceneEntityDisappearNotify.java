package io.irminsul.game.net.packet;

import io.irminsul.common.game.Entity;
import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SceneEntityDisappearNotifyOuterClass;
import io.irminsul.common.proto.VisionTypeOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketSceneEntityDisappearNotify extends OutboundPacket {
    public PacketSceneEntityDisappearNotify(Session session, Entity entity, VisionTypeOuterClass.VisionType visionType) {
        super(PacketIds.SceneEntityDisappearNotify, session);

        SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify notify =
            SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify.newBuilder()
                .addEntityList(entity.getEntityId())
                .setDisappearType(visionType)
                .build();

        this.setData(notify.toByteArray());
    }
}
