package io.irminsul.http.handler;

import io.irminsul.common.http.HttpServer;
import lombok.RequiredArgsConstructor;
import spark.Request;
import spark.Response;
import spark.Route;

@RequiredArgsConstructor
public class QuerySecurityFileHandler implements Route {

    /**
     * The {@link HttpServer} this handler belongs to
     */
    private final HttpServer server;

    @Override
    public Object handle(Request request, Response response) {
        this.server.getLogger().debug("Incoming /query_security_file request!");
        return "";
    }
}
