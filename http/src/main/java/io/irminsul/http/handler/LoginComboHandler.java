package io.irminsul.http.handler;

import com.google.gson.JsonObject;
import io.irminsul.common.http.HttpServer;
import lombok.RequiredArgsConstructor;
import spark.Request;
import spark.Response;
import spark.Route;

@RequiredArgsConstructor
public class LoginComboHandler implements Route {

    /**
     * The {@link HttpServer} this handler belongs to
     */
    private final HttpServer server;

    @Override
    public Object handle(Request request, Response response) {
        this.server.getLogger().info("Incoming token login request");

        JsonObject responseJson = new JsonObject();
        JsonObject data = new JsonObject();
        data.addProperty("account_type", 1);
        data.addProperty("combo_id", 0);
        data.addProperty("combo_token", "token");
        data.addProperty("data", "{\"guest\":false}");
        data.addProperty("fatigue_remind", (String) null);
        data.addProperty("heartbeat", false);
        data.addProperty("open_id", "1");
        responseJson.add("data", data);
        responseJson.addProperty("message", "OK");
        responseJson.addProperty("retcode", 0);

        response.type("application/json");
        return responseJson.toString();
    }
}
