package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.ChatEmojiCollectionDataOuterClass;
import io.irminsul.common.proto.GetChatEmojiCollectionRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

import java.util.List;

public class PacketGetChatEmojiCollectionRsp extends OutboundPacket {
    public PacketGetChatEmojiCollectionRsp(Session session, List<Integer> emojis) {
        super(PacketIds.GetChatEmojiCollectionRsp, session);

        GetChatEmojiCollectionRspOuterClass.GetChatEmojiCollectionRsp response =
            GetChatEmojiCollectionRspOuterClass.GetChatEmojiCollectionRsp.newBuilder()
                .setChatEmojiCollectionData(
                    ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.newBuilder().addAllEmojiIdList(emojis))
                .build();

        this.setData(response.toByteArray());
    }
}
