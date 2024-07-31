package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.game.net.OutboundPacket;

public class PacketSceneForceUnlockNotify extends OutboundPacket {
    public PacketSceneForceUnlockNotify(Session session) {
        super(PacketIds.SceneForceUnlockNotify, session);
    }
}
