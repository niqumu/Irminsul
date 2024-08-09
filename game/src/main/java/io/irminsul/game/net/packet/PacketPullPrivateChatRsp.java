package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.ChatInfoOuterClass;
import io.irminsul.common.proto.PullPrivateChatRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

import java.util.List;

public class PacketPullPrivateChatRsp extends OutboundPacket {
    public PacketPullPrivateChatRsp(Session session, List<ChatInfoOuterClass.ChatInfo> messages) {
        super(PacketIds.PullRecentChatRsp, session);

        PullPrivateChatRspOuterClass.PullPrivateChatRsp response =
            PullPrivateChatRspOuterClass.PullPrivateChatRsp.newBuilder()
                .addAllChatInfo(messages)
                .build();

        this.setData(response.toByteArray());
    }
}
