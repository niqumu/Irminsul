package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.game.item.Item;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.StoreItemChangeNotifyOuterClass;
import io.irminsul.common.proto.StoreTypeOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketStoreItemChangeNotify extends OutboundPacket {
    public PacketStoreItemChangeNotify(Session session, Item item) {
        super(PacketIds.StoreItemChangeNotify, session);

        StoreItemChangeNotifyOuterClass.StoreItemChangeNotify notify =
            StoreItemChangeNotifyOuterClass.StoreItemChangeNotify.newBuilder()
                .setStoreType(StoreTypeOuterClass.StoreType.STORE_TYPE_PACK)
                .addItemList(item.asItem())
                .build();

        this.setData(notify.toByteArray());
    }
}
