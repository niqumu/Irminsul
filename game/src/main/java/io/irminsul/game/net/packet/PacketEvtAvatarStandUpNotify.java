package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.EvtAvatarStandUpNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketEvtAvatarStandUpNotify extends OutboundPacket {
    public PacketEvtAvatarStandUpNotify(Session session, long chairId, int performId, int direction, int entityId) {
        super(PacketIds.EvtAvatarSitDownNotify, session);

        EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify notify =
            EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify.newBuilder()
                .setChairId(chairId)
                .setDirection(direction)
                .setPerformId(performId)
                .setEntityId(entityId)
                .build();

        this.setData(notify.toByteArray());
    }
}
