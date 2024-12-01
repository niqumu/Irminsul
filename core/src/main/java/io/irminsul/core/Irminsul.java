package io.irminsul.core;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.irminsul.common.config.GameServerConfig;
import io.irminsul.common.config.GlobalConfig;
import io.irminsul.common.config.HttpServerConfig;
import io.irminsul.common.config.game.ServerAccountConfig;
import io.irminsul.common.config.game.WelcomeMailConfig;
import io.irminsul.common.game.GameServer;
import io.irminsul.common.http.DispatchRegion;
import io.irminsul.common.http.HttpServer;
import io.irminsul.common.util.i18n.I18n;
import io.irminsul.game.IrminsulGameServer;
import io.irminsul.http.IrminsulHttpServer;
import lombok.Getter;
import org.hjson.JsonValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

@Getter
public class Irminsul {

    /**
     * The release version of Irminsul
     */
    public static final String SERVER_VERSION = "1.0.0";

    /**
     * The configuration file version this version of Irminsul understands and uses
     */
    private static final int CONFIGURATION_VERSION = 5;

    /**
     * SLF4J logger associated with this Irminsul instance
     */
    private final Logger logger = LoggerFactory.getLogger("Irminsul Core");

    /**
     * Configuration containers for services
     */
    private GlobalConfig config;
    private HttpServerConfig httpServerConfig;
    private final List<GameServerConfig> gameServerConfigs = new ArrayList<>();

    /**
     * The {@link HttpServer} service of this instance. This will be null if the HTTP server is disabled.
     */
    private HttpServer httpServer;

    /**
     * List of {@link GameServer} services under this instance. This will be empty if no game servers are enabled.
     */
    private final List<GameServer> gameServers = new ArrayList<>();

    /**
     * Whether this Irminsul instance is currently in the shutdown process
     */
    private final AtomicBoolean isShuttingDown = new AtomicBoolean(false);

    /**
     * Ignite this Irminsul instance
     */
    public void startup() {
        long startTime = System.currentTimeMillis();
        this.logger.info(I18n.translate("core.info.start"));
        this.logger.info(I18n.translate("core.info.server_version"), SERVER_VERSION);

        // Parse the configuration file
        this.loadAndVerifyConfig();
        this.logger.info(I18n.translate("core.info.game_version"), this.config.getTargetVersion());

        // Ignite the HTTP server if enabled
        if (this.httpServerConfig.isEnabled()) {
            this.httpServer = new IrminsulHttpServer(this.httpServerConfig);
        } else {
            this.logger.info(I18n.translate("core.info.http_skipped"));
        }

        // Ignite the configured game servers
        for (int i = 0; i < this.gameServerConfigs.size(); i++) {
            GameServerConfig gameServerConfig = this.gameServerConfigs.get(i);
            this.gameServers.add(new IrminsulGameServer(gameServerConfig, i));
        }
        if (this.gameServers.isEmpty()) {
            this.logger.info(I18n.translate("core.info.game_skipped"));
        }

        // Register shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(this::onShutdown));

        // Done
        double bootTime = (System.currentTimeMillis() - startTime) / 1000D;
        this.logger.info(I18n.translate("core.info.done"), bootTime);
    }

    /**
     * Shut down this Irminsul instance
     */
    public void shutdown() {
        System.exit(0);
    }

    /**
     * Called by the JVM when it shuts down
     */
    private void onShutdown() {
        if (this.isShuttingDown.get()) {
            return;
        }

        this.isShuttingDown.set(true);
        this.logger.info(I18n.translate("core.info.stop"));

        // Stop the HTTP server if it exists
        if (this.httpServer != null) {
            this.httpServer.shutdown();
        }

        // Stop all game servers
        this.gameServers.forEach(GameServer::shutdown);
    }

    /**
     * Load the configuration file into memory, parse it, and verify its contents.
     */
    private void loadAndVerifyConfig() {
        try {
            File configFile = new File("config.hjson");

            // If the config file doesn't exit, create a copy of the default one stored internally
            if (!configFile.exists()) {
                this.logger.warn(I18n.translate("core.warn.config_cloned"));

                InputStream defaultConfig = Objects.requireNonNull(Irminsul.class.getResourceAsStream("/default.hjson"));
                Files.write(configFile.toPath(), defaultConfig.readAllBytes());
            }

            // Read the config file
            String configContents = String.join("\n", Files.readAllLines(configFile.toPath()));

            // Convert from HJson to JSON
            String rawJsonContents = JsonValue.readHjson(configContents).toString();
            JsonObject jsonContents = JsonParser.parseString(rawJsonContents).getAsJsonObject();

            // Read config version
            int configVersion = jsonContents.get("version").getAsInt();

            // Compare the detected config revision to the revision this Irminsul version uses
            if (configVersion < CONFIGURATION_VERSION) {
                int revisionsBehind = CONFIGURATION_VERSION - configVersion;
                this.logger.warn(I18n.translate("core.warn.too_old_config"), revisionsBehind);
            } else if (configVersion > CONFIGURATION_VERSION) {
                int revisionsAhead = configVersion - CONFIGURATION_VERSION;
                this.logger.warn(I18n.translate("core.warn.too_new_config"), revisionsAhead);
            }

            // Read global config
            JsonObject globalObject = jsonContents.getAsJsonObject("global");
            this.config = new GlobalConfig(
                globalObject.get("target_version").getAsString(),
                globalObject.get("language").getAsString(),
                globalObject.get("hide_addresses").getAsBoolean()
            );

            // Set language
            I18n.language = this.config.getLanguage();

            // Read HTTP server config
            JsonObject httpObject = jsonContents.getAsJsonObject("http");

            // Create run directory if needed
            File httpRunDirectory = new File(httpObject.get("run_directory").getAsString());
            httpRunDirectory.mkdirs();

            this.httpServerConfig = new HttpServerConfig(
                this.config,
                httpObject.get("enabled").getAsBoolean(),
                httpObject.get("port").getAsInt(),
                httpObject.get("ssl").getAsBoolean(),
                httpObject.get("client_debugging").getAsBoolean(),
                httpRunDirectory
            );
            for (JsonElement element : httpObject.getAsJsonArray("targets")) {
                JsonObject target = element.getAsJsonObject();
                this.httpServerConfig.getRegions().add(new DispatchRegion(
                   target.get("name").getAsString(),
                   target.get("title").getAsString(),
                   target.get("ip").getAsString(),
                   target.get("port").getAsInt()
                ));
            }

            // Read game server configs
            JsonArray gameServersArray = jsonContents.getAsJsonArray("game_servers");
            for (JsonElement element : gameServersArray) {
                JsonObject server = element.getAsJsonObject();
                JsonObject serverAccount = server.getAsJsonObject("server_account");
                JsonObject welcomeMail = server.getAsJsonObject("welcome_mail");

                // Create run directory if needed
                File gameRunDirectory = new File(server.get("run_directory").getAsString());
                gameRunDirectory.mkdirs();

                this.gameServerConfigs.add(new GameServerConfig(
                    this.config,
                    server.get("port").getAsInt(),
                    server.get("sandbox").getAsBoolean(),
                    gameRunDirectory,
                    new ServerAccountConfig(
                        serverAccount.get("enabled").getAsBoolean(),
                        serverAccount.get("account_nickname").getAsString(),
                        serverAccount.get("account_signature").getAsString(),
                        serverAccount.get("welcome_message").getAsString(),
                        serverAccount.get("welcome_emote").getAsInt(),
                        serverAccount.get("commands_enabled").getAsBoolean()
                    ),
                    new WelcomeMailConfig(
                        welcomeMail.get("enabled").getAsBoolean(),
                        welcomeMail.get("file").getAsString(),
                        welcomeMail.get("subject").getAsString(),
                        welcomeMail.get("sender").getAsString()
                    )
                ));
            }

            this.logger.info(I18n.translate("core.info.config_loaded"));
        } catch (Exception e) {
            this.logger.error(I18n.translate("core.error.config_load_failed"), e);
            this.shutdown();
        }

        // Make sure the game version is set
        if (this.config.getTargetVersion().equals("not set")) {
            this.logger.error(I18n.translate("core.error.game_version_missing"));
            this.shutdown();
        }
    }
}
