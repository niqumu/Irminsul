package io.irminsul.game.net;

import io.irminsul.common.game.Session;
import io.irminsul.game.net.handler.HandlerGetPlayerTokenReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class PacketManager {

    private final Logger logger = LoggerFactory.getLogger("Packet Manager");

    private final HashMap<Integer, PacketHandler> handlers = new HashMap<>();

    public PacketManager() {
        this.registerHandler(new HandlerGetPlayerTokenReq());
    }

    private void registerHandler(PacketHandler handler) {
        this.handlers.put(handler.getTargetID(), handler);
    }

    public void handle(GenericPacket packet, Session session) {
        if (!this.handlers.containsKey(packet.getId())) {
            this.logger.warn("Packet ID {} was received but doesn't have a handler!", packet.getId());
            return;
        }

        this.handlers.get(packet.getId()).handle(packet, session);
    }
}
