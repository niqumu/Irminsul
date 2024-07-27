package io.irminsul.core;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.http.HttpServer;
import io.irminsul.core.config.ConfigEntry;
import io.irminsul.core.config.IrminsulConfig;
import io.irminsul.game.IrminsulGameServer;
import io.irminsul.http.IrminsulHttpServer;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@Getter
public class Irminsul {

    public static final String GAME_VERSION = "4.0.0";
    public static final String SERVER_VERSION = "1.0.0";

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
        this.logger.info("Starting Irminsul...");
        this.logger.info("This server is of version {}, targeting game version {}", SERVER_VERSION, GAME_VERSION);

        this.loadConfig();

        this.startHttpServer();
        this.startGameServer();

        Runtime.getRuntime().addShutdownHook(new Thread(this::shutdown));
    }

    /**
     * Shut down this Irminsul instance
     */
    public void shutdown() {
        this.logger.info("Stopping Irminsul!");
        this.httpServer.getSpark().stop();
//        this.saveConfig();
    }

    /**
     * Load the configuration file into memory
     * @see IrminsulConfig
     */
    private void loadConfig() {
        try {
            this.config = new IrminsulConfig();
            this.config.load();
            this.logger.info("Loaded server configuration");
        } catch (IOException e) {
            this.logger.error("Failed to load config file! It's possible that your config file is corrupted. " +
                "Try resetting your config file by deleting it and re-launching Irminsul.");
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
     * Ignite the HTTP server
     * @see HttpServer
     */
    private void startHttpServer() {
        this.httpServer = new IrminsulHttpServer((Integer) this.config.getValue(ConfigEntry.HTTP_PORT));
    }

    /**
     * Ignite the game server
     * @see GameServer
     */
    private void startGameServer() {
        this.gameServer = new IrminsulGameServer((Integer) this.config.getValue(ConfigEntry.GAME_PORT));
    }
}
