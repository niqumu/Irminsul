package io.irminsul.game.net.packet;

import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.AddNoGachaAvatarCardNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketAddNoGachaAvatarCardNotify extends OutboundPacket {
    public PacketAddNoGachaAvatarCardNotify(Session session, Avatar avatar, int reason) {
        super(PacketIds.AddNoGachaAvatarCardNotify, session);

        AddNoGachaAvatarCardNotifyOuterClass.AddNoGachaAvatarCardNotify notify =
            AddNoGachaAvatarCardNotifyOuterClass.AddNoGachaAvatarCardNotify.newBuilder()
                .setAvatarId(avatar.getAvatarId())
                .setItemId(1000 + (avatar.getAvatarId() % 10000000))
                .setReason(reason)
                .setCBBMIOFHCIC(1)
                .setMGBKMNHIFOE(1)
                .build();

        this.setData(notify.toByteArray());
    }
}
