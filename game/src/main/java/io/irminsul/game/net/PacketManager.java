package io.irminsul.game.net;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.game.ServerSystem;
import io.irminsul.game.net.handler.*;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;

public class PacketManager implements ServerSystem {

    /**
     * Whether incoming and outgoing packets should be logged by the server
     */
    public static final boolean PACKET_LOGGING = false;

    /**
     * Whether warnings about incoming packets without a handler should be raised by the server
     */
    public static final boolean MISSING_HANDLER_LOGGING = false;

    /**
     * Packets that are excluded from logging (too much spam)
     */
    public static final List<Integer> NO_LOG_PACKETS = List.of(
        PacketIds.HJBAIOKEHPA,
        PacketIds.UnionCmdNotify,
        PacketIds.PingReq,
        PacketIds.PingRsp,
        PacketIds.PathfindingEnterSceneReq,
        PacketIds.ToTheMoonEnterSceneReq
    );

    /**
     * This packet manager's logger
     */
    private final Logger logger = LoggerFactory.getLogger("Packet Manager");

    /**
     * A map of {@link PacketHandler}s, keyed by packet IDs
     */
    private final HashMap<Integer, PacketHandler> handlers = new HashMap<>();

    /**
     * The server that this packet manager belongs to
     */
    @Getter
    private final GameServer server;

    public PacketManager(GameServer server) {
        this.server = server;

        this.registerHandler(new HandlerChangeAvatarReq());
        this.registerHandler(new HandlerDungeonEntryInfoReq());
        this.registerHandler(new HandlerEnterSceneDoneReq());
        this.registerHandler(new HandlerEnterSceneReadyReq());
        this.registerHandler(new HandlerEvtAvatarLockChairReq());
        this.registerHandler(new HandlerEvtAvatarSitDownNotify());
        this.registerHandler(new HandlerEvtAvatarStandUpNotify());
        this.registerHandler(new HandlerGetAllUnlockNameCardReq());
        this.registerHandler(new HandlerGetChatEmojiCollectionReq());
        this.registerHandler(new HandlerGetPlayerBlacklistReq());
        this.registerHandler(new HandlerGetPlayerFriendListReq());
        this.registerHandler(new HandlerGetPlayerSocialDetailReq());
        this.registerHandler(new HandlerGetPlayerTokenReq());
        this.registerHandler(new HandlerGetSceneAreaReq());
        this.registerHandler(new HandlerGetScenePointReq());
        this.registerHandler(new HandlerGetShopReq());
        this.registerHandler(new HandlerMarkMapReq());
        this.registerHandler(new HandlerNpcTalkReq());
        this.registerHandler(new HandlerPingReq());
        this.registerHandler(new HandlerPlayerEnterDungeonReq());
        this.registerHandler(new HandlerPlayerLoginReq());
        this.registerHandler(new HandlerPlayerSetPauseReq());
        this.registerHandler(new HandlerPlayerQuitDungeonReq());
        this.registerHandler(new HandlerPostEnterSceneReq());
        this.registerHandler(new HandlerSceneInitFinishReq());
        this.registerHandler(new HandlerSceneTransToPointReq());
        this.registerHandler(new HandlerSetEquipLockStateReq());
        this.registerHandler(new HandlerSetNameCardReq());
        this.registerHandler(new HandlerSetPlayerBirthdayReq());
        this.registerHandler(new HandlerSetPlayerNameReq());
        this.registerHandler(new HandlerSetPlayerSignatureReq());
        this.registerHandler(new HandlerUnionCmdNotify());
        this.registerHandler(new HandlerUnlockTransPointReq());
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

        // Ensure that the packet has a handler
        if (!this.handlers.containsKey(packet.getId())) {

            // If not, log it if enabled
            if (MISSING_HANDLER_LOGGING && !NO_LOG_PACKETS.contains(packet.getId())) {
                this.logger.warn("Packet ID {} ({}) was received but doesn't have a handler!",
                    packet.getId(), PacketIds.getNameById(packet.getId()));
            }
            return;
        }

        // Log the packet, if enabled
        if (PACKET_LOGGING && !NO_LOG_PACKETS.contains(packet.getId())) {
            System.out.printf("\033[94m(S <- %d) INCOMING: %s\033[39m\n",
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
