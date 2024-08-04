package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.game.data.scene.DungeonEntryPoint;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.DungeonEntryInfoOuterClass;
import io.irminsul.common.proto.DungeonEntryInfoRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketDungeonEntryInfoRsp extends OutboundPacket {
    public PacketDungeonEntryInfoRsp(Session session, int pointId, DungeonEntryPoint point) {
        super(PacketIds.DungeonEntryInfoRsp, session);

        DungeonEntryInfoRspOuterClass.DungeonEntryInfoRsp.Builder builder =
            DungeonEntryInfoRspOuterClass.DungeonEntryInfoRsp.newBuilder()
                .setPointId(pointId);

        // Add all dungeons that this entry point contains
        point.getDungeonIds().forEach(dungeon -> builder.addDungeonEntryList(
            DungeonEntryInfoOuterClass.DungeonEntryInfo.newBuilder().setDungeonId(dungeon).build()));

        this.setData(builder.build().toByteArray());
    }
}
