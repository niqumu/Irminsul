package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.game.item.Item;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.StoreItemChangeNotifyOuterClass;
import io.irminsul.common.proto.StoreTypeOuterClass;
import io.irminsul.game.net.OutboundPacket;

import java.util.List;

public class PacketStoreItemChangeNotify extends OutboundPacket {
    public PacketStoreItemChangeNotify(Session session, List<Item> items) {
        super(PacketIds.StoreItemChangeNotify, session);

        StoreItemChangeNotifyOuterClass.StoreItemChangeNotify notify =
            StoreItemChangeNotifyOuterClass.StoreItemChangeNotify.newBuilder()
                .setStoreType(StoreTypeOuterClass.StoreType.STORE_TYPE_PACK)
                .addAllItemList(items.stream().map(Item::asItem).toList())
                .build();

        this.setData(notify.toByteArray());
    }
}
