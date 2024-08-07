package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.PlayerGameTimeNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketPlayerGameTimeNotify extends OutboundPacket {
    public PacketPlayerGameTimeNotify(Session session, int gameTime) {
        super(PacketIds.PlayerGameTimeNotify, session);

        PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify notify =
            PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify.newBuilder()
                .setUid(session.getUid())
                .setGameTime(gameTime)
                .build();

        this.setData(notify.toByteArray());
    }
}
