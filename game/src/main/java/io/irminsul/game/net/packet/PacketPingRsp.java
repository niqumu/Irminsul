package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.PingRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketPingRsp extends OutboundPacket {
    public PacketPingRsp(Session session, int clientTime) {
        super(PacketIds.PingRsp, session);

        PingRspOuterClass.PingRsp pingRsp = PingRspOuterClass.PingRsp.newBuilder().setClientTime(clientTime).build();
        this.setData(pingRsp.toByteArray());
    }
}
