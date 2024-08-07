package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SetEquipLockStateRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketSetEquipLockStateRsp extends OutboundPacket {
    public PacketSetEquipLockStateRsp(Session session, long guid, boolean locked) {
        super(PacketIds.SetEquipLockStateRsp, session);

        SetEquipLockStateRspOuterClass.SetEquipLockStateRsp response =
            SetEquipLockStateRspOuterClass.SetEquipLockStateRsp.newBuilder()
                .setTargetEquipGuid(guid)
                .setIsLocked(locked)
                .build();

        this.setData(response.toByteArray());
    }
}
