package io.irminsul.core;

import io.irminsul.core.config.ConfigEntry;
import io.irminsul.core.config.IrminsulConfig;
import io.irminsul.dispatch.DispatchServer;
import io.irminsul.http.HTTPServer;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@Getter
public class Irminsul {

    public static final String GAME_VERSION = "4.8.0";
    public static final String SERVER_VERSION = "1.0.0";

    private final Logger logger = LoggerFactory.getLogger("Irminsul");

    private IrminsulConfig config;

    private DispatchServer dispatchServer;

    private HTTPServer httpServer;

    public void startup() {
        this.logger.info("Starting Irminsul...");
        this.logger.info("This server is of version {}, targeting game version {}", SERVER_VERSION, GAME_VERSION);

        this.loadConfig();

        this.startHttpServer();
        this.startDispatchServer();

        Runtime.getRuntime().addShutdownHook(new Thread(this::shutdown));
    }

    public void shutdown() {
        this.logger.info("Stopping Irminsul!");
        this.httpServer.getSpark().stop();
//        this.saveConfig();
        System.exit(0);
    }

    private void loadConfig() {
        try {
            this.config = new IrminsulConfig();
            this.config.load();
            this.logger.info("Loaded server configuration");
        } catch (IOException e) {
            this.logger.error("Failed to load config file! It's possible that your config file is corrupted. " +
                "Try resetting your config file by deleting it and re-launching Irminsul");
            this.shutdown();
        }
    }

    private void saveConfig() {
        try {
            this.config.save();
            this.logger.info("Saved server configuration");
        } catch (IOException e) {
            this.logger.error("Failed to save config file! It's possible that your config file is corrupted. " +
                "Try resetting your config file by deleting it and re-launching Irminsul");
        }
    }

    private void startHttpServer() {
        this.httpServer = new HTTPServer((Integer) this.config.getValue(ConfigEntry.HTTP_PORT));
    }

    private void startDispatchServer() {
        this.dispatchServer = new DispatchServer((Integer) this.config.getValue(ConfigEntry.DISPATCH_PORT));
        this.dispatchServer.start();
    }
}
