package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.game.net.OutboundPacket;

public class PacketUnlockTransPointRsp extends OutboundPacket {
    public PacketUnlockTransPointRsp(Session session) {
        super(PacketIds.UnlockTransPointRsp, session);
    }
}
