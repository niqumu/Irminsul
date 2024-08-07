package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.game.world.Position;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.EnterTypeOuterClass;
import io.irminsul.common.proto.PlayerEnterSceneNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketPlayerEnterSceneNotify extends OutboundPacket {
    public PacketPlayerEnterSceneNotify(Session session, int scene, Position position, int reason) {
        super(PacketIds.PlayerEnterSceneNotify, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        PlayerEnterSceneNotifyOuterClass.PlayerEnterSceneNotify enterSceneNotify =
            PlayerEnterSceneNotifyOuterClass.PlayerEnterSceneNotify.newBuilder()
                .setSceneId(scene)
                .setSceneBeginTime(System.currentTimeMillis())
                .setEnterSceneToken(session.getPlayer().getEnterSceneToken())
                .setPos(position.positionAsVector())
                .setType(EnterTypeOuterClass.EnterType.ENTER_TYPE_SELF)
                .setEnterReason(reason)
                .setTargetUid(session.getPlayer().getUid())
                .setWorldLevel(session.getPlayer().getWorld().getWorldLevel())
                .setWorldType(1)
                .setIsFirstLoginEnterScene(false)
                .setSceneTransaction(scene + "-" + session.getPlayer().getUid() + "-" +
                    (int) (System.currentTimeMillis() / 1000d) + "-18402") // todo: what's up with 18402?
                .build();

        this.setData(enterSceneNotify.toByteArray());
    }
}
