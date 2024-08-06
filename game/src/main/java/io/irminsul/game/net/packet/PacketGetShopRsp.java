package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetShopRspOuterClass;
import io.irminsul.common.proto.ShopOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketGetShopRsp extends OutboundPacket {
    public PacketGetShopRsp(Session session, int shopType) {
        super(PacketIds.GetShopRsp, session);

        ShopOuterClass.Shop shop = ShopOuterClass.Shop.newBuilder()
            .setShopType(shopType)
            .setCityId(1)
            .setCityReputationLevel(10)
            .build();

        // todo add items to shop from the server's shop manager

        GetShopRspOuterClass.GetShopRsp response = GetShopRspOuterClass.GetShopRsp.newBuilder()
            .setShop(shop)
            .build();

        this.setData(response.toByteArray());
    }
}
