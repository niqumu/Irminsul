package io.irminsul.game;

import io.irminsul.common.config.GameServerConfig;
import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.command.CommandManager;
import io.irminsul.common.game.dungeon.DungeonManager;
import io.irminsul.common.game.event.EventBus;
import io.irminsul.common.game.net.Session;
import io.irminsul.common.game.player.PlayerProfile;
import io.irminsul.common.game.world.World;
import io.irminsul.common.util.CryptoUtil;
import io.irminsul.common.util.i18n.I18n;
import io.irminsul.game.command.IrminsulCommandManager;
import io.irminsul.game.dungeon.IrminsulDungeonManager;
import io.irminsul.game.event.SimpleEventBus;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.IrminsulSession;
import io.irminsul.game.net.MalformedPacketException;
import io.irminsul.game.net.PacketManager;
import io.irminsul.game.shop.ShopManager;
import io.netty.buffer.Unpooled;
import kcp.highway.ChannelConfig;
import kcp.highway.KcpServer;
import kcp.highway.Ukcp;
import lombok.Getter;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Getter
public class IrminsulGameServer extends KcpServer implements GameServer {

    /**
     * This server's logger
     */
    private final Logger logger;

    /**
     * This GameServer's {@link GameServerConfig}
     */
    private final GameServerConfig config;

    /**
     * This server's {@link EventBus}
     */
    private final EventBus eventBus = new SimpleEventBus();

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
    private final Map<Ukcp, Session> sessions = new HashMap<>();

    /**
     * Managers
     */
    private final PacketManager packetManager = new PacketManager(this);
    private final ShopManager shopManager = new ShopManager(this);
    private final DungeonManager dungeonManager = new IrminsulDungeonManager(this);
    private final CommandManager commandManager = new IrminsulCommandManager(this);

    /**
     * Executor service used to run server ticks
     */
    private final ScheduledExecutorService tickService = Executors.newSingleThreadScheduledExecutor();

    /**
     * Thread pool used to asynchronously tick different worlds
     */
    private final ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();

    /**
     * Create a new game server using the provided configuration
     * @param config The {@link GameServerConfig} to use
     * @param name The display name of this game server, used in logging
     */
    public IrminsulGameServer(@NonNull GameServerConfig config, @NonNull String name) {
        this.config = config;
        this.port = this.config.getPort();
        this.sandbox = this.config.isSandbox();

        this.logger = LoggerFactory.getLogger(name);
        this.logger.info(I18n.translate("game.info.start", this.config));

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

        // Start ticking worlds asynchronously, once per second
        this.tickService.scheduleAtFixedRate(() ->
            worlds.forEach(world -> executor.submit(world::tick)), 1, 1, TimeUnit.SECONDS);

        // Done
        this.logger.info(I18n.translate("game.info.done_" + (this.sandbox ? "sandbox" : "realism"), this.config), this.port);
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
            this.logger.error(I18n.translate("game.error.packet_decode_failed", this.config), e, Arrays.toString(raw));
            return;
        }

        // Handle the packet with the packet manager, calling the registered handler
        this.packetManager.handle(packet, session);
    }
}
