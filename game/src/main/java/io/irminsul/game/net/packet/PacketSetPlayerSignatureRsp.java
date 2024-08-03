package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SetPlayerSignatureRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketSetPlayerSignatureRsp extends OutboundPacket {
    public PacketSetPlayerSignatureRsp(Session session, String signature) {
        super(PacketIds.SetPlayerSignatureRsp, session);

        SetPlayerSignatureRspOuterClass.SetPlayerSignatureRsp response =
            SetPlayerSignatureRspOuterClass.SetPlayerSignatureRsp.newBuilder()
                .setSignature(signature)
                .build();

        this.setData(response.toByteArray());
    }
}
