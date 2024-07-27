package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.proto.PacketIds;
import io.irminsul.game.net.OutboundPacket;

public class PacketGetPlayerTokenRsp extends OutboundPacket {
    public PacketGetPlayerTokenRsp(Session session) {
        super(PacketIds.GetPlayerTokenRsp, session);
    }
}
