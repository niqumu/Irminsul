package io.irminsul.game;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.Session;
import io.irminsul.common.game.player.PlayerProfile;
import io.irminsul.common.game.world.World;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.util.CryptoUtil;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.MalformedPacketException;
import io.irminsul.game.net.PacketManager;
import io.irminsul.game.shop.ShopManager;
import io.netty.buffer.Unpooled;
import kcp.highway.ChannelConfig;
import kcp.highway.KcpServer;
import kcp.highway.Ukcp;
import lombok.Getter;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Getter
public class IrminsulGameServer extends KcpServer implements GameServer {

    /**
     * This server's logger
     */
    private final Logger logger = LoggerFactory.getLogger("Game Server");

    /**
     * The port this server is running on
     */
    private final int port;

    /**
     * A list of {@link World}s on the server
     */
    private final List<World> worlds = new ArrayList<>();

    /**
     * Whether this server is running in sandbox mode, as opposed to realistic mode
     */
    private final boolean sandbox;

    /**
     * A map of {@link IrminsulSession}s connected to the server
     */
    private final HashMap<Ukcp, Session> sessions = new HashMap<>();

    /**
     * Managers
     */
    private final PacketManager packetManager = new PacketManager(this);
    private final ShopManager shopManager = new ShopManager(this);

    /**
     * Create a new game server on the provided port
     * @param port The port to expose the server to
     */
    public IrminsulGameServer(int port, boolean sandbox) {
        this.logger.info("Starting game server!");
        this.port = port;
        this.sandbox = sandbox;

        // Init KCP server
        ChannelConfig channelConfig = new ChannelConfig();
        channelConfig.nodelay(true, 20, 2, true);
        channelConfig.setMtu(1400);
        channelConfig.setSndwnd(256);
        channelConfig.setRcvwnd(256);
        channelConfig.setTimeoutMillis(30 * 1000);
        channelConfig.setUseConvChannel(true);
        channelConfig.setAckNoDelay(false);
        this.init(new GameServerListener(this), channelConfig, new InetSocketAddress(this.port));

        // Done
        this.logger.info("Game server started on port {} in {} mode!", this.port, this.sandbox ? "sandbox" : "realism");
    }

    /**
     * Attempt to fetch the social profile data of the player with the provided UID
     *
     * @param uid The UID of the player to fetch social data for
     * @return The provided player's social profile, or null, if the player doesn't exist
     */
    @Override
    public @Nullable PlayerProfile lookupPlayerProfile(int uid) {

        // TODO DATABASE
        // until we have a database, just lookup currently online players
        for (Session session : this.sessions.values()) {
            if (session.getUid() == uid && session.getPlayer() != null) {
                return session.getPlayer().getProfile();
            }
        }

        return null;
    }

    /**
     * Handles a packet
     * @param raw The raw bytes of the packet
     * @param session The session that sent the packet
     * @param key The key used to decrypt the packet
     */
    @Override
    public void handlePacket(byte[] raw, Session session, byte[] key) {

        // Decrypt the packet
        CryptoUtil.xor(raw, key);

        // Decode the packet
        InboundPacket packet;
        try {
            packet = new InboundPacket(Unpooled.wrappedBuffer(raw), session);
        } catch (MalformedPacketException e) {
            this.logger.error("Failed to decode packet: {}, bytes: {}", e, Arrays.toString(raw));
            return;
        }

        // Handle the packet with the packet manager, calling the registered handler
        this.packetManager.handle(packet, session);
    }
}
