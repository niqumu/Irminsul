package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.PlayerEnterDungeonRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketPlayerEnterDungeonRsp extends OutboundPacket {
    public PacketPlayerEnterDungeonRsp(Session session, int point, int dungeon) {
        super(PacketIds.PlayerEnterDungeonRsp, session);

        PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp response =
            PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp.newBuilder()
                .setPointId(point)
                .setDungeonId(dungeon)
                .build();

        this.setData(response.toByteArray());
    }
}
