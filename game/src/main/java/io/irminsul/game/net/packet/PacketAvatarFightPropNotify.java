package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.AvatarFightPropNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketAvatarFightPropNotify extends OutboundPacket {
    public PacketAvatarFightPropNotify(Session session, Avatar avatar) {
        super(PacketIds.AvatarFightPropNotify, session);

        AvatarFightPropNotifyOuterClass.AvatarFightPropNotify notify =
            AvatarFightPropNotifyOuterClass.AvatarFightPropNotify.newBuilder()
                .putAllFightPropMap(avatar.getFightProperties())
                .setAvatarGuid(avatar.getGuid())
                .build();

        this.setData(notify.toByteArray());
    }
}
