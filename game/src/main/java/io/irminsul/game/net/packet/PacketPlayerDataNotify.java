package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.PlayerDataNotifyOuterClass;
import io.irminsul.common.proto.PropValueOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketPlayerDataNotify extends OutboundPacket {
    public PacketPlayerDataNotify(Session session) {
        super(PacketIds.PlayerDataNotify, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        PlayerDataNotifyOuterClass.PlayerDataNotify.Builder playerDataNotifyBuilder =
            PlayerDataNotifyOuterClass.PlayerDataNotify.newBuilder()
                .setNickName(session.getPlayer().getNickname())
                .setServerTime(System.currentTimeMillis())
                .setRegionId(1) // todo temp
                .setIsFirstLoginToday(true); // todo: what does this affect?

        session.getPlayer().getProperties().forEach((k, v) -> {
            PropValueOuterClass.PropValue propValue = PropValueOuterClass.PropValue.newBuilder()
                .setType(k)
                .setVal(v)
                .setIval(v)
                .build();

            playerDataNotifyBuilder.putPropMap(k, propValue);
        });

        this.setData(playerDataNotifyBuilder.build().toByteArray());
    }
}
