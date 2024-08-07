package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.PlayerQuitDungeonRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketPlayerQuitDungeonRsp extends OutboundPacket {
    public PacketPlayerQuitDungeonRsp(Session session, int point) {
        super(PacketIds.PlayerQuitDungeonRsp, session);

        PlayerQuitDungeonRspOuterClass.PlayerQuitDungeonRsp response =
            PlayerQuitDungeonRspOuterClass.PlayerQuitDungeonRsp.newBuilder()
                .setPointId(point)
                .build();

        this.setData(response.toByteArray());
    }
}
