package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.BirthdayOuterClass;
import io.irminsul.common.proto.SetPlayerBirthdayRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketSetPlayerBirthdayRsp extends OutboundPacket {
    public PacketSetPlayerBirthdayRsp(Session session, int month, int day) {
        super(PacketIds.SetPlayerBirthdayRsp, session);

        SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp response =
            SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp.newBuilder()
                .setBirthday(BirthdayOuterClass.Birthday.newBuilder().setMonth(month).setDay(day).build())
                .build();

        this.setData(response.toByteArray());
    }
}
