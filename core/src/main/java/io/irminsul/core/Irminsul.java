package io.irminsul.core;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.irminsul.common.config.GameServerConfig;
import io.irminsul.common.config.GlobalConfig;
import io.irminsul.common.config.HttpServerConfig;
import io.irminsul.common.game.GameServer;
import io.irminsul.common.http.DispatchRegion;
import io.irminsul.common.http.HttpServer;
import io.irminsul.common.util.i18n.I18n;
import io.irminsul.game.IrminsulGameServer;
import io.irminsul.http.IrminsulHttpServer;
import lombok.Getter;
import lombok.NonNull;
import org.hjson.JsonValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Getter
public class Irminsul {

    /**
     * The release version of Irminsul
     */
    public static final String SERVER_VERSION = "1.0.0";

    /**
     * SLF4J logger associated with this Irminsul instance
     */
    private final Logger logger = LoggerFactory.getLogger("Irminsul");

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
     * Ignite this Irminsul instance
     */
    public void startup() {
        long startTime = System.currentTimeMillis();
        this.logger.info(I18n.translate("core.info.start", null));
        this.logger.info(I18n.translate("core.info.server_version", null), SERVER_VERSION);

        // Parse the configuration file
        this.loadAndVerifyConfig();
        this.logger.info(I18n.translate("core.info.game_version", this.config), this.config.getTargetVersion());

        // Ignite the HTTP server if enabled
        if (this.httpServerConfig.isEnabled()) {
            this.httpServer = new IrminsulHttpServer(this.httpServerConfig);
        } else {
            this.logger.info(I18n.translate("core.info.http_skipped", this.config));
        }

        // Ignite the configured game servers
        this.gameServerConfigs.forEach(config -> this.gameServers.add(new IrminsulGameServer(config)));
        if (this.gameServers.isEmpty()) {
            this.logger.info(I18n.translate("core.info.game_skipped", this.config));
        }

        // Register shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(this::shutdown));

        // Done
        double bootTime = (System.currentTimeMillis() - startTime) / 1000D;
        this.logger.info(I18n.translate("core.info.done", this.config), bootTime);
    }

    /**
     * Shut down this Irminsul instance
     */
    public void shutdown() {
        this.logger.info(I18n.translate("core.info.stop", this.config));

        // Stop the HTTP server if it exists
        if (this.httpServer != null) {
            this.httpServer.getSpark().stop();
        }

        Runtime.getRuntime().exit(0);
    }

    /**
     * Load the configuration file into memory, parse it, and verify its contents.
     */
    private void loadAndVerifyConfig() {
        try {
            File configFile = new File("config.hjson");

            // If the config file doesn't exit, create a copy of the default one stored internally
            if (!configFile.exists()) {
                this.logger.warn(I18n.translate("core.warn.config_cloned", this.config));

                InputStream defaultConfig = Objects.requireNonNull(Irminsul.class.getResourceAsStream("/default.hjson"));
                Files.write(configFile.toPath(), defaultConfig.readAllBytes());
            }

            // Read the config file
            String configContents = String.join("\n", Files.readAllLines(configFile.toPath()));

            // Convert from HJson to JSON
            String rawJsonContents = JsonValue.readHjson(configContents).toString();
            JsonObject jsonContents = JsonParser.parseString(rawJsonContents).getAsJsonObject();

            // Read global config first
            JsonObject globalObject = jsonContents.getAsJsonObject("global");
            this.config = new GlobalConfig(
                globalObject.get("target_version").getAsString(),
                globalObject.get("language").getAsString()
            );

            // Read HTTP server config
            JsonObject httpObject = jsonContents.getAsJsonObject("http");
            this.httpServerConfig = new HttpServerConfig(
                this.config,
                httpObject.get("enabled").getAsBoolean(),
                httpObject.get("port").getAsInt(),
                httpObject.get("ssl").getAsBoolean()
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
                this.gameServerConfigs.add(new GameServerConfig(
                    this.config,
                    server.get("port").getAsInt(),
                    server.get("sandbox").getAsBoolean(),
                    server.get("commands").getAsBoolean()
                ));
            }

            this.logger.info(I18n.translate("core.info.config_loaded", this.config));
        } catch (Exception e) {
            this.logger.error(I18n.translate("core.error.config_load_failed", null), e);
            this.shutdown();
        }

        // Make sure the game version is set
        if (this.config.getTargetVersion().equals("not set")) {
            this.logger.error(I18n.translate("core.error.game_version_missing", this.config));
            this.shutdown();
        }
    }
}
