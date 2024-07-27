package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.EnterScenePeerNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketEnterScenePeerNotify extends OutboundPacket {
    public PacketEnterScenePeerNotify(Session session, int enterSceneToken) {
        super(PacketIds.EnterScenePeerNotify, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        EnterScenePeerNotifyOuterClass.EnterScenePeerNotify enterScenePeerNotify =
            EnterScenePeerNotifyOuterClass.EnterScenePeerNotify.newBuilder()
                .setDestSceneId(session.getPlayer().getSceneID())
                .setEnterSceneToken(enterSceneToken)
                .build();

        this.setData(enterScenePeerNotify.toByteArray());
    }
}
