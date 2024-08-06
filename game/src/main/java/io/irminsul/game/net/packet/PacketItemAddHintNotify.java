package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.ItemAddHintNotifyOuterClass;
import io.irminsul.common.proto.ItemHintOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketItemAddHintNotify extends OutboundPacket {
    public PacketItemAddHintNotify(Session session, ItemHintOuterClass.ItemHint itemHint, int reason) {
        super(PacketIds.ItemAddHintNotify, session);

        ItemAddHintNotifyOuterClass.ItemAddHintNotify notify =
            ItemAddHintNotifyOuterClass.ItemAddHintNotify.newBuilder()
                .addItemList(itemHint)
                .setReason(reason)
                .build();

        this.setData(notify.toByteArray());
    }
}
