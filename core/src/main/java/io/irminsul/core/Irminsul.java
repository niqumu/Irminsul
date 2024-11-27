package io.irminsul.core;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.http.HttpServer;
import io.irminsul.common.config.ConfigEntry;
import io.irminsul.core.config.IrminsulConfig;
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
        this.logger.info("Starting Irminsul...");
        this.logger.info("This server is of version {}!", SERVER_VERSION);

        // Parse the configuration file
        this.loadAndVerifyConfig();

        // Ignite enabled sub-services
        this.logger.info("This server is targeting game version {}!", this.config.getValue(ConfigEntry.TARGET_VERSION));
        this.startHttpServer();
        this.startGameServer();

        // Register shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(this::shutdown));

        // Done
        this.logger.info("Done! Started Irminsul in {} seconds!", (System.currentTimeMillis() - startTime) / 1000D);
    }

    /**
     * Shut down this Irminsul instance
     */
    public void shutdown() {
        this.logger.info("Stopping Irminsul!");
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
            this.logger.info("Loaded server configuration");
        } catch (IOException e) {
            this.logger.error("Failed to load config file! It's possible that your config file is corrupted. " +
                "Try resetting your config file by deleting it and re-launching Irminsul.");
            this.shutdown();
        }

        // Make sure the game version is set
        if (this.config.getValue(ConfigEntry.TARGET_VERSION).equals("not set")) {
            this.logger.error("You must specify a game version in the configuration file! Halting.");
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
            this.logger.info("Saved server configuration");
        } catch (IOException e) {
            this.logger.error("Failed to save config file! It's possible that your config file is corrupted. " +
                "Try resetting your config file by deleting it and re-launching Irminsul.");
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
            this.logger.info("Skipped ignition of HTTP server as it was not enabled in the configuration...");
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
            this.logger.info("Skipped ignition of game server as it was not enabled in the configuration...");
        }
    }
}
