package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.PropValueOuterClass;
import io.irminsul.common.proto.WorldDataNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketWorldDataNotify extends OutboundPacket {
    public PacketWorldDataNotify(Session session) {
        super(PacketIds.WorldDataNotify, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        int worldLevel = session.getPlayer().getWorld().getWorldLevel();
        boolean multiplayer = session.getPlayer().getWorld().isMultiplayer();
        int multiplayerValue = multiplayer ? 1 : 0;

        WorldDataNotifyOuterClass.WorldDataNotify worldDataNotify =
            WorldDataNotifyOuterClass.WorldDataNotify.newBuilder()
                .putWorldPropMap(1, PropValueOuterClass.PropValue.newBuilder()
                    .setType(1).setIval(worldLevel).setVal(worldLevel).build())
                .putWorldPropMap(2, PropValueOuterClass.PropValue.newBuilder()
                    .setType(2).setIval(multiplayerValue).setVal(multiplayerValue).build())
                .build();

        this.setData(worldDataNotify.toByteArray());
    }
}
