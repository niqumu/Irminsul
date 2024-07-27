package io.irminsul.game.net;

import io.irminsul.common.game.Session;
import io.irminsul.game.net.handler.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class PacketManager {

    private final Logger logger = LoggerFactory.getLogger("Packet Manager");

    private final HashMap<Integer, PacketHandler> handlers = new HashMap<>();

    public PacketManager() {
        this.registerHandler(new HandlerGetPlayerTokenReq());
        this.registerHandler(new HandlerGetPlayerFriendListReq());
        this.registerHandler(new HandlerPingReq());
        this.registerHandler(new HandlerPlayerLoginReq());
    }

    private void registerHandler(PacketHandler handler) {
        this.handlers.put(handler.getTargetID(), handler);
    }

    public void handle(InboundPacket packet, Session session) {
        if (!this.handlers.containsKey(packet.getId())) {
            this.logger.warn("Packet ID {} was received but doesn't have a handler!", packet.getId());
            return;
        }

        try {
            this.handlers.get(packet.getId()).handle(packet, session);
        } catch (Exception e) {
            this.logger.warn("Failed to handle packet: {}", packet, e);
        }
    }
}
