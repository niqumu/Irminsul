package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.ChatInfoOuterClass;
import io.irminsul.common.proto.PrivateChatNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketPrivateChatNotify extends OutboundPacket {
    public PacketPrivateChatNotify(Session session, ChatInfoOuterClass.ChatInfo message) {
        super(PacketIds.PrivateChatNotify, session);

        PrivateChatNotifyOuterClass.PrivateChatNotify notify =
            PrivateChatNotifyOuterClass.PrivateChatNotify.newBuilder()
                .setChatInfo(message)
                .build();

        this.setData(notify.toByteArray());
    }
}
