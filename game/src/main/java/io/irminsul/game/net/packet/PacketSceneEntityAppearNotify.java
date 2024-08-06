package io.irminsul.game.net.packet;

import io.irminsul.common.game.world.Entity;
import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SceneEntityAppearNotifyOuterClass;
import io.irminsul.common.proto.VisionTypeOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketSceneEntityAppearNotify extends OutboundPacket {
    public PacketSceneEntityAppearNotify(Session session, Entity entity, VisionTypeOuterClass.VisionType visionType) {
        super(PacketIds.SceneEntityAppearNotify, session);

        SceneEntityAppearNotifyOuterClass.SceneEntityAppearNotify sceneEntityAppearNotify =
            SceneEntityAppearNotifyOuterClass.SceneEntityAppearNotify.newBuilder()
                .addEntityList(entity.buildSceneEntityInfo())
                .setAppearType(visionType)
                .build();

        this.setData(sceneEntityAppearNotify.toByteArray());
    }
}
