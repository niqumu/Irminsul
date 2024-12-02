package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SkipPlayerGameTimeRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketSkipPlayerGameTimeRsp extends OutboundPacket {
    public PacketSkipPlayerGameTimeRsp(Session session, int clientGameTime, int gameTime) {
        super(PacketIds.SkipPlayerGameTimeRsp, session);

        SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp response =
            SkipPlayerGameTimeRspOuterClass.SkipPlayerGameTimeRsp.newBuilder()
                .setClientGameTime(clientGameTime)
                .setGameTime(gameTime)
                .build();

        this.setData(response.toByteArray());
    }
}
