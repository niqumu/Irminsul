package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.UnionCmdNotifyOuterClass;
import io.irminsul.common.proto.UnionCmdOuterClass;
import io.irminsul.game.IrminsulGameServer;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.PacketManager;

// Weird multiple-packets-in-one thing.
public class HandlerUnionCmdNotify implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.UnionCmdNotify;
    }

    /**
     * Handle an incoming packet
     *
     * @param packet  The packet being sent
     * @param session The session that sent the packet
     */
    @Override
    public void handle(InboundPacket packet, Session session) throws Exception {

        UnionCmdNotifyOuterClass.UnionCmdNotify notify =
            UnionCmdNotifyOuterClass.UnionCmdNotify.parseFrom(packet.getData());

        // Capture the packet manager (not part of GameServer API)
        PacketManager packetManager = ((IrminsulGameServer) session.getServer()).getPacketManager();

        // Iterate over packets within the union
        for (UnionCmdOuterClass.UnionCmd unionCmd : notify.getCmdListList()) {
            InboundPacket inboundPacket = new InboundPacket(unionCmd.getMessageId(), session, new byte[]{},
                unionCmd.getBody().toByteArray());

            // Log
            if (PacketManager.PACKET_LOGGING && !PacketManager.NO_LOG_PACKETS.contains(inboundPacket.getId())) {
                System.out.printf("\033[94m | (S <- %d) INCOMING (UNION): %s\033[39m\n",
                    session.getUid(), PacketIds.getNameById(inboundPacket.getId()));
            }

            // Handle
            packetManager.getHandlers().get(unionCmd.getMessageId()).handle(inboundPacket, session);
        }
    }
}
