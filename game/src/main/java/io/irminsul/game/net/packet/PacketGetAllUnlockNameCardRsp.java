package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetAllUnlockNameCardRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketGetAllUnlockNameCardRsp extends OutboundPacket {
    public PacketGetAllUnlockNameCardRsp(Session session) {
        super(PacketIds.GetAllUnlockNameCardRsp, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp response =
            GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp.newBuilder()
                .addAllNameCardList(session.getPlayer().getOwnedNameCards())
                .build();

        this.setData(response.toByteArray());
    }
}
