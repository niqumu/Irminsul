package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SetNameCardRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketSetNameCardRsp extends OutboundPacket {
    public PacketSetNameCardRsp(Session session) {
        super(PacketIds.SetNameCardRsp, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        SetNameCardRspOuterClass.SetNameCardRsp response =
            SetNameCardRspOuterClass.SetNameCardRsp.newBuilder()
                .setNameCardId(session.getPlayer().getNameCard())
                .build();

        this.setData(response.toByteArray());
    }
}
