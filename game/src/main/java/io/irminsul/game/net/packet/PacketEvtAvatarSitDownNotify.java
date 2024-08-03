package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.EvtAvatarSitDownNotifyOuterClass;
import io.irminsul.common.proto.VectorOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketEvtAvatarSitDownNotify extends OutboundPacket {
    public PacketEvtAvatarSitDownNotify(Session session, long chairId, VectorOuterClass.Vector position,
                                        int direction, int entityId) {
        super(PacketIds.EvtAvatarSitDownNotify, session);

        EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify notify =
            EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify.newBuilder()
                .setChairId(chairId)
                .setPosition(position)
                .setDirection(direction)
                .setEntityId(entityId)
                .build();

        this.setData(notify.toByteArray());
    }
}
