package io.irminsul.game.net.packet;

import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.AvatarAddNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketAvatarAddNotify extends OutboundPacket {
    public PacketAvatarAddNotify(Session session, Avatar avatar) {
        super(PacketIds.AvatarAddNotify, session);

        AvatarAddNotifyOuterClass.AvatarAddNotify notify =
            AvatarAddNotifyOuterClass.AvatarAddNotify.newBuilder()
                .setAvatar(avatar.buildAvatarInfo())
                .build();

        this.setData(notify.toByteArray());
    }
}
