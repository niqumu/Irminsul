package io.irminsul.game.net;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.game.ServerManager;
import io.irminsul.game.net.handler.*;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class PacketManager implements ServerManager {

    public static final boolean PACKET_LOGGING = false;

    private final Logger logger = LoggerFactory.getLogger("Packet Manager");

    private final HashMap<Integer, PacketHandler> handlers = new HashMap<>();

    @Getter
    private final GameServer server;

    public PacketManager(GameServer server) {
        this.server = server;

        this.registerHandler(new HandlerEnterSceneDoneReq());
        this.registerHandler(new HandlerEnterSceneReadyReq());
        this.registerHandler(new HandlerGetChatEmojiCollectionReq());
        this.registerHandler(new HandlerGetPlayerBlacklistReq());
        this.registerHandler(new HandlerGetPlayerTokenReq());
        this.registerHandler(new HandlerGetSceneAreaReq());
        this.registerHandler(new HandlerGetScenePointReq());
        this.registerHandler(new HandlerGetPlayerFriendListReq());
        this.registerHandler(new HandlerGetShopReq());
        this.registerHandler(new HandlerPingReq());
        this.registerHandler(new HandlerPlayerLoginReq());
        this.registerHandler(new HandlerPostEnterSceneReq());
        this.registerHandler(new HandlerSceneInitFinishReq());
    }

    private void registerHandler(PacketHandler handler) {
        this.handlers.put(handler.getTargetID(), handler);
    }

    public void handle(InboundPacket packet, Session session) {
        if (!this.handlers.containsKey(packet.getId())) {
            this.logger.warn("Packet ID {} ({}) was received but doesn't have a handler!",
                packet.getId(), PacketIds.getNameById(packet.getId()));
            return;
        }

        try {
            this.handlers.get(packet.getId()).handle(packet, session);
        } catch (Exception e) {
            this.logger.warn("Failed to handle packet: {}", packet, e);
        }
    }
}
