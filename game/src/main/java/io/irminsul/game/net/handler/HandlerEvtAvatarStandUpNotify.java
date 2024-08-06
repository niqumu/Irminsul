package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.EvtAvatarStandUpNotifyOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketEvtAvatarStandUpNotify;

public class HandlerEvtAvatarStandUpNotify implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.EvtAvatarStandUpNotify;
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

        EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify notify =
            EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify.parseFrom(packet.getData());

        new PacketEvtAvatarStandUpNotify(null, notify.getChairId(), notify.getPerformId(),
            notify.getDirection(), notify.getEntityId()).broadcast(session.getPlayer().getScene().getPlayers());
    }
}
