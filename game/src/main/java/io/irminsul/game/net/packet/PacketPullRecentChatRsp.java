package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.ChatInfoOuterClass;
import io.irminsul.common.proto.PullRecentChatRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

import java.util.List;

public class PacketPullRecentChatRsp extends OutboundPacket {
    public PacketPullRecentChatRsp(Session session, List<ChatInfoOuterClass.ChatInfo> messages) {
        super(PacketIds.PullRecentChatRsp, session);

        PullRecentChatRspOuterClass.PullRecentChatRsp response =
            PullRecentChatRspOuterClass.PullRecentChatRsp.newBuilder()
                .addAllChatInfo(messages)
                .build();

        this.setData(response.toByteArray());
    }
}
