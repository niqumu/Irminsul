package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.NpcTalkRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketNpcTalkRsp extends OutboundPacket {
    public PacketNpcTalkRsp(Session session, int npcEntityId, int curTalkId, int entityId) {
        super(PacketIds.NpcTalkRsp, session);

        NpcTalkRspOuterClass.NpcTalkRsp response =
            NpcTalkRspOuterClass.NpcTalkRsp.newBuilder()
                .setNpcEntityId(npcEntityId)
                .setCurTalkId(curTalkId)
                .setEntityId(entityId)
                .build();

        this.setData(response.toByteArray());
    }
}
