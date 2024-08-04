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

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class LogHandler implements Route {

    /**
     * The {@link HttpServer} this handler belongs to
     */
    private final HttpServer server;

    private final Logger clientLogger = LoggerFactory.getLogger("Attached Client");

    private final List<String> alreadyLoggedMessages = new ArrayList<>();

    @Override
    public Object handle(Request request, Response response) throws Exception {
        JsonObject jsonRequest = JsonParser.parseString(request.body()).getAsJsonObject();

        String message = jsonRequest.get("logStr").getAsString();
        String stackTrace = jsonRequest.get("stackTrace").getAsString();

        if (!this.alreadyLoggedMessages.contains(message)) {
            clientLogger.info(message);
            clientLogger.info("Client trace:\n{}", stackTrace.substring(0, stackTrace.length() - 1)
                .replace("\n", "\n\tat "));
            this.alreadyLoggedMessages.add(message);
        }

        return null;
    }
}
