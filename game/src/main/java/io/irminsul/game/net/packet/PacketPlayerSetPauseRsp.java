package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.game.net.OutboundPacket;

public class PacketPlayerSetPauseRsp extends OutboundPacket {
    public PacketPlayerSetPauseRsp(Session session) {
        super(PacketIds.PlayerSetPauseRsp, session);
    }
}
