package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.game.world.Position;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.EnterTypeOuterClass;
import io.irminsul.common.proto.PlayerEnterSceneNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketPlayerEnterSceneNotify extends OutboundPacket {
    public PacketPlayerEnterSceneNotify(Session session, int scene, Position position) {
        super(PacketIds.PlayerEnterSceneNotify, session);

        PlayerEnterSceneNotifyOuterClass.PlayerEnterSceneNotify enterSceneNotify =
            PlayerEnterSceneNotifyOuterClass.PlayerEnterSceneNotify.newBuilder()
                .setSceneId(scene)
                .setSceneBeginTime(System.currentTimeMillis())
                .setPos(position.asVector())
                .setType(EnterTypeOuterClass.EnterType.ENTER_TYPE_SELF)
                .setTargetUid(1)
                .setWorldLevel(1)
                .setWorldType(1)
                .setIsFirstLoginEnterScene(true)
                .setSceneTransaction("3-1-" + (int) (System.currentTimeMillis() / 1000d) + "-18402") // todo: what?
                .build();

        this.setData(enterSceneNotify.toByteArray());
    }
}
