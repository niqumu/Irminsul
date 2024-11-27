package io.irminsul.core;

import io.irminsul.common.config.Config;
import io.irminsul.common.game.GameServer;
import io.irminsul.common.http.HttpServer;
import io.irminsul.common.config.ConfigEntry;
import io.irminsul.common.util.i18n.I18n;
import io.irminsul.game.IrminsulGameServer;
import io.irminsul.http.IrminsulHttpServer;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

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
     * The {@link IrminsulConfig} configuration of this instance
     */
    private IrminsulConfig config;

    /**
     * The {@link HttpServer} service of this instance
     */
    private HttpServer httpServer;

    /**
     * The {@link GameServer} service of this instance
     */
    private GameServer gameServer;

    /**
     * Ignite this Irminsul instance
     */
    public void startup() {
        long startTime = System.currentTimeMillis();
        this.logger.info(I18n.translate("core.info.start", null));
        this.logger.info(I18n.translate("core.info.server_version", null), SERVER_VERSION);

        // Parse the configuration file
        this.loadAndVerifyConfig();

        // Ignite enabled sub-services
        this.logger.info(I18n.translate("core.info.game_version", this.config),
            this.config.getValue(ConfigEntry.TARGET_VERSION));
        this.startHttpServer();
        this.startGameServer();

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
        this.httpServer.getSpark().stop();
        this.saveConfig();
        Runtime.getRuntime().exit(0);
    }

    /**
     * Load the configuration file into memory and verify its contents.
     * @see IrminsulConfig
     */
    private void loadAndVerifyConfig() {
        try {
            this.config = new IrminsulConfig();
            this.config.load();
            this.logger.info(I18n.translate("core.info.config_loaded", this.config));
        } catch (IOException e) {
            this.logger.error(I18n.translate("core.error.config_load_failed", null)); // can't use the config
            this.shutdown();
        }

        // Make sure the game version is set
        if (this.config.getValue(ConfigEntry.TARGET_VERSION).equals("not set")) {
            this.logger.error(I18n.translate("core.error.game_version_missing", this.config));
            this.shutdown();
        }
    }

    /**
     * Save the configuration file to disk
     * @see IrminsulConfig
     */
    private void saveConfig() {
        try {
            this.config.save();
            this.logger.info(I18n.translate("core.info.config_saved", this.config));
        } catch (IOException e) {
            this.logger.error(I18n.translate("core.error.config_save_failed", this.config));
        }
    }

    /**
     * Ignite the HTTP server, if enabled in the loaded configuration file
     * @see HttpServer
     */
    private void startHttpServer() {
        if (Boolean.parseBoolean(this.config.getValue(ConfigEntry.HTTP_ENABLED))) {
            this.httpServer = new IrminsulHttpServer(this.config);
        } else {
            this.logger.info(I18n.translate("core.info.http_skipped", this.config));
        }
    }

    /**
     * Ignite the game server, if enabled in the loaded configuration file
     * @see GameServer
     */
    private void startGameServer() {
        if (Boolean.parseBoolean(this.config.getValue(ConfigEntry.GAME_ENABLED))) {
            this.gameServer = new IrminsulGameServer(this.config);
        } else {
            this.logger.info(I18n.translate("core.info.game_skipped", this.config));
        }
    }
}
