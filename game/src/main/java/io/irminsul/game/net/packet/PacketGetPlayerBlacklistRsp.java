package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetPlayerBlacklistRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketGetPlayerBlacklistRsp extends OutboundPacket {
    public PacketGetPlayerBlacklistRsp(Session session) {
        super(PacketIds.GetPlayerBlacklistRsp, session);

        GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp getPlayerBlacklistRsp =
            GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp.newBuilder()
//                .addAllBlacklist() // todo add session owner's blocked list
                .build();

        this.setData(getPlayerBlacklistRsp.toByteArray());
    }
}
