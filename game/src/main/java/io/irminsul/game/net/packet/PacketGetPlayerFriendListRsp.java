package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetPlayerFriendListRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketGetPlayerFriendListRsp extends OutboundPacket {
    public PacketGetPlayerFriendListRsp(Session session) {
        super(PacketIds.GetPlayerFriendListRsp, session);

        GetPlayerFriendListRspOuterClass.GetPlayerFriendListRsp getPlayerFriendListReq =
            GetPlayerFriendListRspOuterClass.GetPlayerFriendListRsp.newBuilder()
//                .addAllFriendList() // todo add session owner's friends
                .build();

        this.setData(getPlayerFriendListReq.toByteArray());
    }
}
