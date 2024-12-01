package io.irminsul.game;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.irminsul.common.config.ConfigLoader;
import io.irminsul.common.config.GameServerConfig;
import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.command.CommandManager;
import io.irminsul.common.game.dungeon.DungeonManager;
import io.irminsul.common.event.EventBus;
import io.irminsul.common.game.mail.MailManager;
import io.irminsul.common.game.net.Session;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.player.PlayerProfile;
import io.irminsul.common.game.world.World;
import io.irminsul.common.plugin.GamePlugin;
import io.irminsul.common.plugin.PluginInfo;
import io.irminsul.common.plugin.PluginReloadChanges;
import io.irminsul.common.util.CryptoUtil;
import io.irminsul.common.util.i18n.I18n;
import io.irminsul.game.command.IrminsulCommandManager;
import io.irminsul.game.dungeon.IrminsulDungeonManager;
import io.irminsul.game.event.SimpleEventBus;
import io.irminsul.game.mail.IrminsulMailManager;
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
import org.hjson.JsonValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.InetSocketAddress;
import java.nio.file.Files;
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
     * The ID of this game server, used in logging and configuration
     */
    private final int id;

    /**
     * This GameServer's {@link GameServerConfig}
     */
    private GameServerConfig config;

    /**
     * This server's {@link EventBus}
     */
    private final EventBus eventBus = new SimpleEventBus(this);

    /**
     * The port this server is running on
     */
    private final int port;

    /**
     * A list of {@link World}s on the server
     */
    private final List<World> worlds = new ArrayList<>();

    /**
     * A map of {@link IrminsulSession}s connected to the server
     */
    private final Map<Ukcp, Session> sessions = new HashMap<>();

    /**
     * A map of connected {@link Player}s, keyed by player UID
     */
    private final Map<Integer, Player> onlinePlayers = new HashMap<>();

    /**
     * Managers
     */
    private final PacketManager packetManager;
    private final CommandManager commandManager;
    private final PluginManager pluginManager;
    private final ShopManager shopManager;
    private final DungeonManager dungeonManager;
    private final MailManager mailManager;

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
     * @param serverId The ID of this game server, used in logging and configuration
     */
    public IrminsulGameServer(@NonNull GameServerConfig config, int serverId) {
        this.config = config;
        this.id = serverId;
        this.port = this.config.getPort();

        this.logger = LoggerFactory.getLogger("Game Server #" + (serverId + 1));
        this.logger.info(I18n.translate("game.info.start"));

        // Create managers
        this.packetManager = new PacketManager(this);
        this.commandManager = new IrminsulCommandManager(this);
        this.pluginManager = new PluginManager(this);
        this.shopManager = new ShopManager(this);
        this.dungeonManager = new IrminsulDungeonManager(this);
        this.mailManager = new IrminsulMailManager(this);

        // Load and enable plugins
        this.pluginManager.loadPlugins();
        this.pluginManager.enablePlugins();

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
        String key = this.config.isSandbox() ? "game.info.done_sandbox" : "game.info.done_realism";
        this.logger.info(I18n.translate(key), this.port);
    }

    /**
     * Shuts down this game server, saving all player data and closing all connections
     */
    @Override
    public void shutdown() {
        this.logger.info(I18n.translate("game.info.stop"));

        // Disconnect all players
        this.onlinePlayers.values().forEach(Player::logout);

        // Stop ticking
        this.tickService.shutdown();

        // Disable all plugins
        this.pluginManager.disablePlugins();

        // Stop KCP server
        this.stop();
    }

    /**
     * Reloads this server and its plugins. This is relatively equivalent to restarting the server.
     * @return The {@link PluginReloadChanges} that resulted from reloading the server
     */
    @Override
    public @NotNull PluginReloadChanges reload() {
        this.logger.info(I18n.translate("game.info.reload"));
        this.logger.warn("================================================================");
        this.logger.warn(I18n.translate("game.warn.reload"));
        this.logger.warn("================================================================");

        // Re-read server configuration
        this.config = ConfigLoader.readGameServerConfig(this.id, this.logger, this.config.getGlobalConfig());

        // Reload plugins
        return this.pluginManager.reloadPlugins();
    }

    /**
     * @return A list of loaded and enabled plugins on the server
     */
    @Override
    public @NotNull List<PluginInfo> getPlugins() {
        List<PluginInfo> plugins = new ArrayList<>();

        for (GamePlugin plugin : this.pluginManager.getLoadedPlugins().values()) {
            plugins.add(plugin.getPluginInfo());
        }

        return plugins;
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
            this.logger.error(I18n.translate("game.error.packet_decode_failed"), e, Arrays.toString(raw));
            return;
        }

        // Handle the packet with the packet manager, calling the registered handler
        this.packetManager.handle(packet, session);
    }
}
