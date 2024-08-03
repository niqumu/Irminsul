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
import java.util.List;

public class PacketManager implements ServerManager {

    public static final boolean PACKET_LOGGING = false;
    public static final boolean MISSING_HANDLER_LOGGING = true;

    private static final List<Integer> BLACKLISTED_PACKETS = List.of(
        PacketIds.HJBAIOKEHPA
    );

    private final Logger logger = LoggerFactory.getLogger("Packet Manager");

    private final HashMap<Integer, PacketHandler> handlers = new HashMap<>();

    @Getter
    private final GameServer server;

    public PacketManager(GameServer server) {
        this.server = server;

        this.registerHandler(new HandlerEnterSceneDoneReq());
        this.registerHandler(new HandlerEnterSceneReadyReq());
        this.registerHandler(new HandlerEvtAvatarLockChairReq());
        this.registerHandler(new HandlerEvtAvatarSitDownNotify());
        this.registerHandler(new HandlerEvtAvatarStandUpNotify());
        this.registerHandler(new HandlerGetAllUnlockNameCardReq());
        this.registerHandler(new HandlerGetChatEmojiCollectionReq());
        this.registerHandler(new HandlerGetPlayerBlacklistReq());
        this.registerHandler(new HandlerGetPlayerTokenReq());
        this.registerHandler(new HandlerGetSceneAreaReq());
        this.registerHandler(new HandlerGetScenePointReq());
        this.registerHandler(new HandlerGetPlayerFriendListReq());
        this.registerHandler(new HandlerGetShopReq());
        this.registerHandler(new HandlerMarkMapReq());
        this.registerHandler(new HandlerNpcTalkReq());
        this.registerHandler(new HandlerPingReq());
        this.registerHandler(new HandlerPlayerLoginReq());
        this.registerHandler(new HandlerPostEnterSceneReq());
        this.registerHandler(new HandlerSceneInitFinishReq());
        this.registerHandler(new HandlerSetNameCardReq());
        this.registerHandler(new HandlerUnionCmdNotify());
    }

    private void registerHandler(PacketHandler handler) {
        this.handlers.put(handler.getTargetID(), handler);
    }

    /**
     * Handle an incoming packet
     * @param packet The packet that was received
     * @param session The session that sent the packet
     */
    public void handle(InboundPacket packet, Session session) {

        // Drop blacklisted packets
        if (BLACKLISTED_PACKETS.contains(packet.getId())) {
            return;
        }

        // Ensure that the packet has a handler
        if (!this.handlers.containsKey(packet.getId())) {

            // If not, log it if enabled
            if (MISSING_HANDLER_LOGGING) {
                this.logger.warn("Packet ID {} ({}) was received but doesn't have a handler!",
                    packet.getId(), PacketIds.getNameById(packet.getId()));
            }
            return;
        }

        // Log the packet, if enabled
        if (PACKET_LOGGING && packet.getId() != PacketIds.PingReq) {
            System.out.printf("\033[94m(S <- %d) INCOMING: %s\033[39m",
                session.getUid(), PacketIds.getNameById(packet.getId()));
        }

        try {
            // Give the packet to its respective handler
            this.handlers.get(packet.getId()).handle(packet, session);
        } catch (Exception e) {
            this.logger.warn("Failed to handle packet: {}", packet, e);
        }
    }
}
