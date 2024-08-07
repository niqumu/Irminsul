package io.irminsul.game.net.handler;

import io.irminsul.common.game.item.Item;
import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.SetEquipLockStateReqOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketSetEquipLockStateRsp;

public class HandlerSetEquipLockStateReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.SetEquipLockStateReq;
    }

    /**
     * Handle an incoming packet
     *
     * @param packet  The packet being sent
     * @param session The session that sent the packet
     */
    @Override
    public void handle(InboundPacket packet, Session session) throws Exception {
        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to handle packet {} in a bad state: player cannot be null!", this);
            return;
        }

        SetEquipLockStateReqOuterClass.SetEquipLockStateReq request =
            SetEquipLockStateReqOuterClass.SetEquipLockStateReq.parseFrom(packet.getData());

        for (Item item : session.getPlayer().getInventory().getItems()) {
            if (item.getGuid() == request.getTargetEquipGuid()) {
                item.setLocked(request.getIsLocked());
                new PacketSetEquipLockStateRsp(session, item.getGuid(), item.isLocked()).send();
                return;
            }
        }

        // item couldn't be found
    }
}
