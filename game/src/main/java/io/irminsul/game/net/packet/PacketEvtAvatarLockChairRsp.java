package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.EvtAvatarLockChairRspOuterClass;
import io.irminsul.common.proto.VectorOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketEvtAvatarLockChairRsp extends OutboundPacket {
    public PacketEvtAvatarLockChairRsp(Session session, long chairId, VectorOuterClass.Vector position) {
        super(PacketIds.EvtAvatarLockChairRsp, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp response =
            EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp.newBuilder()
                .setChairId(chairId)
                .setPosition(position)
                .setEntityId(session.getPlayer().getTeamManager().getActiveAvatar().getEntityId())
                .build();

        this.setData(response.toByteArray());
    }
}
