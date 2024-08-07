package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.game.world.Scene;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SceneTimeNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketSceneTimeNotify extends OutboundPacket {
    public PacketSceneTimeNotify(Session session, Scene scene) {
        super(PacketIds.SceneTimeNotify, session);

        SceneTimeNotifyOuterClass.SceneTimeNotify notify =
            SceneTimeNotifyOuterClass.SceneTimeNotify.newBuilder()
                .setSceneId(scene.getId())
                .setIsPaused(scene.getWorld().isPaused())
                .setSceneTime(scene.getSceneTime())
                .build();

        this.setData(notify.toByteArray());
    }
}
