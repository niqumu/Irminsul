package io.irminsul.http.handler;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.irminsul.common.http.HttpServer;
import lombok.RequiredArgsConstructor;
import spark.Request;
import spark.Response;
import spark.Route;

@RequiredArgsConstructor
public class LoginHandler implements Route {

    /**
     * The {@link HttpServer} this handler belongs to
     */
    private final HttpServer server;

    @Override
    public Object handle(Request request, Response response) {
        JsonObject requestJson = JsonParser.parseString(request.body()).getAsJsonObject();
        String account = requestJson.get("account").getAsString();

        this.server.getLogger().info("Incoming login request for {}", account);

        JsonObject responseJson = new JsonObject();
        JsonObject data = new JsonObject();
        data.add("account", this.getAccountData());
        data.addProperty("device_grant_required", false);
        data.addProperty("reactivate_required", false);
        data.addProperty("realname_operation", "None");
        data.addProperty("realperson_required", false);
        data.addProperty("safe_mobile_required", false);
        responseJson.add("data", data);
        responseJson.addProperty("message", "OK");
        responseJson.addProperty("retcode", 0);

        response.type("application/json");
        return responseJson.toString();
    }

    private JsonObject getAccountData() {
        JsonObject account = new JsonObject();
        account.addProperty("apple_name", "");
        account.addProperty("area_code", "");
        account.addProperty("country", "US");
        account.addProperty("cx_name", "");
        account.addProperty("device_grant_ticket", "");
        account.addProperty("email", "irminsul@gmail.com");
        account.addProperty("facebook_name", "");
        account.addProperty("game_center_name", "");
        account.addProperty("google_name", "");
        account.addProperty("identity_card", "");
        account.addProperty("is_email_verify", "0");
        account.addProperty("mobile", "000****00");
        account.addProperty("name", "");
        account.addProperty("reactive_ticket", "");
        account.addProperty("realname", "");
        account.addProperty("safe_mobile", "");
        account.addProperty("sony_name", "");
        account.addProperty("steam_name", "");
        account.addProperty("tap_name", "");
        account.addProperty("token", "token");
        account.addProperty("twitter_name", "");
        account.addProperty("uid", "1");
        account.addProperty("unmasked_email", "");
        account.addProperty("unmasked_email_type", 0);
        return account;
    }
}
