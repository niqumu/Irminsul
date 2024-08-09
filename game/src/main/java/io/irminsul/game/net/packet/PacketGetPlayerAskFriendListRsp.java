package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetPlayerAskFriendListRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketGetPlayerAskFriendListRsp extends OutboundPacket {
    public PacketGetPlayerAskFriendListRsp(Session session) {
        super(PacketIds.GetPlayerAskFriendListRsp, session);

        GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp response =
            GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp.newBuilder().build();

        this.setData(response.toByteArray());
    }
}
