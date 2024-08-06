package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SetPlayerNameRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketSetPlayerNameRsp extends OutboundPacket {
    public PacketSetPlayerNameRsp(Session session, String nickname) {
        super(PacketIds.SetPlayerNameRsp, session);

        SetPlayerNameRspOuterClass.SetPlayerNameRsp response =
            SetPlayerNameRspOuterClass.SetPlayerNameRsp.newBuilder()
                .setNickName(nickname)
                .build();

        this.setData(response.toByteArray());
    }
}
