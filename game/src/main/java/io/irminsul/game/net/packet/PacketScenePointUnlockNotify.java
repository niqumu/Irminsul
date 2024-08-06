package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.ScenePointUnlockNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

import java.util.List;

public class PacketScenePointUnlockNotify extends OutboundPacket {
    public PacketScenePointUnlockNotify(Session session, int scene, List<Integer> points) {
        super(PacketIds.ScenePointUnlockNotify, session);

        ScenePointUnlockNotifyOuterClass.ScenePointUnlockNotify scenePointUnlockNotify =
            ScenePointUnlockNotifyOuterClass.ScenePointUnlockNotify.newBuilder()
                .setSceneId(scene)
                .addAllPointList(points)
                .build();

        this.setData(scenePointUnlockNotify.toByteArray());
    }
}
