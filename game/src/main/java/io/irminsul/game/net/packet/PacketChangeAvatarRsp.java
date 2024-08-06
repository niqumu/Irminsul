package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.ChangeAvatarRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketChangeAvatarRsp extends OutboundPacket {
    public PacketChangeAvatarRsp(Session session, long guid) {
        super(PacketIds.ChangeAvatarRsp, session);

        ChangeAvatarRspOuterClass.ChangeAvatarRsp response =
            ChangeAvatarRspOuterClass.ChangeAvatarRsp.newBuilder()
                .setCurGuid(guid)
                .build();

        this.setData(response.toByteArray());
    }
}
