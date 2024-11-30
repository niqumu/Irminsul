package io.irminsul.http;

import io.irminsul.common.config.HttpServerConfig;
import io.irminsul.common.http.HttpServer;
import io.irminsul.common.http.DispatchRegion;
import io.irminsul.common.util.i18n.I18n;
import io.irminsul.http.handler.*;
import lombok.Getter;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Service;
import spark.Spark;

import java.util.List;

@Getter
public class IrminsulHttpServer implements HttpServer {

    /**
     * This server's logger
     */
    private final Logger logger = LoggerFactory.getLogger("HTTP Server");

    /**
     * This HttpServer's {@link HttpServerConfig}
     */
    private final HttpServerConfig config;

    /**
     * The {@link Spark} instance of this web server
     */
    private final Service spark = Service.ignite();

    /**
     * The port this web server is running on
     */
    private final int port;

    /**
     * A list of regions registered on this web server
     */
    private final List<DispatchRegion> regions;

    public IrminsulHttpServer(@NonNull HttpServerConfig config) {
        this.config = config;
        this.port = config.getPort();
        this.regions = config.getRegions();

        this.logger.info(I18n.translate("http.info.start"));

        // Set up HTTPS, if enabled
        if (this.config.isSsl()) {
            this.spark.secure("keystore.jks", "password", null, null);
            this.logger.info(I18n.translate("http.info.ssl"));
        }

        // Start the spark server
        this.spark.port(this.port);
        this.spark.init();

        // Set up region handlers
        this.spark.get("/query_security_file", new QuerySecurityFileHandler(this));
        this.spark.get("/query_region_list", new QueryRegionListHandler(this));
        this.spark.get("/query_cur_region/:region", new QueryCurrentRegionHandler(this));

        // Set up login handlers

        // Used to check login "risk", determines whether the user needs to do a captcha or not
        // Hardcoded to return no risk, no captcha
        this.spark.post("/account/risky/api/check", (request, response) -> {
            response.type("application/json");
            return "{\"data\":{\"action\":\"ACTION_NONE\",\"geetest\":null,\"id\":\"1\"},\"message\":\"OK\",\"retcode\":0}";
        });

        // Used to generate a login token
        this.spark.post("/hk4e_global/mdk/shield/api/login", new LoginHandler(this));

        // Used to log in with a session key
        this.spark.post("/hk4e_global/combo/granter/login/v2/login", new LoginSessionHandler(this));

        // Used to log in with a cached login token
        this.spark.post("/hk4e_global/mdk/shield/api/verify", (request, response) -> {
            this.logger.info("verify request"); // TODO
            return null;
        });

        // Set up logging handlers
        this.spark.post("/crash/dataUpload", (request, response) -> "");
        this.spark.post("/sdk/dataUpload", (request, response) -> "");
        this.spark.post("/log", new LogHandler(this));

        // Set up root handler
        this.spark.get("/", (request, response) -> "Irminsul PS");

        // Done
        this.logger.info(I18n.translate("http.info.done"), this.port);
    }
}
