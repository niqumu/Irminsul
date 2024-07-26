package io.irminsul.http.handler;

import io.irminsul.http.HTTPServer;
import lombok.RequiredArgsConstructor;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.Arrays;

@RequiredArgsConstructor
public class QuerySecurityFileHandler implements Route {

    /**
     * The {@link HTTPServer} this handler belongs to
     */
    private final HTTPServer server;

    @Override
    public Object handle(Request request, Response response) {
        this.server.getLogger().info("Incoming /query_security_file request!");
        return "";
    }
}
