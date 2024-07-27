package io.irminsul.http.handler;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.irminsul.common.http.HttpServer;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;
import spark.Route;

@RequiredArgsConstructor
public class LogHandler implements Route {

    /**
     * The {@link HttpServer} this handler belongs to
     */
    private final HttpServer server;

    private final Logger clientLogger = LoggerFactory.getLogger("Attached Client");

    @Override
    public Object handle(Request request, Response response) throws Exception {
        JsonObject jsonRequest = JsonParser.parseString(request.body()).getAsJsonObject();

        String message = jsonRequest.get("logStr").getAsString();
        String stackTrace = jsonRequest.get("stackTrace").getAsString();

        clientLogger.info(message);
        clientLogger.info("Client trace:\n{}", stackTrace.substring(0, stackTrace.length() - 1)
            .replace("\n", "\n\tat "));

        return null;
    }
}
