package io.irminsul.game.net.handler;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketPlayerEnterSceneInfoNotify;
import io.irminsul.game.net.packet.PacketSceneForceUnlockNotify;
import io.irminsul.game.net.packet.PacketSceneInitFinishRsp;
import io.irminsul.game.net.packet.PacketWorldDataNotify;

public class HandlerSceneInitFinishReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.SceneInitFinishReq;
    }

    /**
     * Handle an incoming packet
     *
     * @param packet  The packet being sent
     * @param session The session that sent the packet
     */
    @Override
    public void handle(InboundPacket packet, Session session) throws Exception {

        // World
        new PacketWorldDataNotify(session).send();

        // Scene
        new PacketSceneForceUnlockNotify(session).send();
        new PacketPlayerEnterSceneInfoNotify(session).send();

        // Finish
        new PacketSceneInitFinishRsp(session).send();
    }
}
