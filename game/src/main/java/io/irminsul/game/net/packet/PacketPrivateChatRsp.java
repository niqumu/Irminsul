package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.PrivateChatRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketPrivateChatRsp extends OutboundPacket {
    public PacketPrivateChatRsp(Session session) {
        super(PacketIds.PrivateChatRsp, session);

        PrivateChatRspOuterClass.PrivateChatRsp response =
            PrivateChatRspOuterClass.PrivateChatRsp.newBuilder()
                .build();

        this.setData(response.toByteArray());
    }
}
