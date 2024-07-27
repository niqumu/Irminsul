package io.irminsul.http.handler;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.protobuf.ByteString;
import io.irminsul.common.game.GameClient;
import io.irminsul.common.http.HttpServer;
import io.irminsul.common.proto.QueryRegionListHttpRspOuterClass;
import io.irminsul.common.proto.RegionSimpleInfoOuterClass;
import io.irminsul.common.util.CryptoUtil;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.ArrayList;
import java.util.Base64;

public class QueryRegionListHandler implements Route {

    /**
     * The {@link HttpServer} this handler belongs to
     */
    private final HttpServer server;

    private QueryRegionListHttpRspOuterClass.QueryRegionListHttpRsp queryResponse;

    private String encodedQueryResponse;

    public QueryRegionListHandler(HttpServer server) {
        this.server = server;
        this.buildResponse();
    }

    private void buildResponse() {
        ArrayList<RegionSimpleInfoOuterClass.RegionSimpleInfo> servers = new ArrayList<>();

        // Iterate over registered regions, generating region info for each
        this.server.getRegions().forEach(region -> servers.add(RegionSimpleInfoOuterClass.RegionSimpleInfo.newBuilder()
            .setName(region.name())
            .setTitle(region.title())
            .setType("DEV_PUBLIC")
            .setDispatchUrl("http://127.0.0.1:" + this.server.getPort() + "/query_cur_region/" + region.name())
            .build()
        ));

        // Determine config settings
        JsonArray hiddenIcons = new JsonArray();
        hiddenIcons.add(40);
        JsonArray codeSwitch = new JsonArray();
        codeSwitch.add(3628);

        // Create a config object
        JsonObject customConfig = new JsonObject();
        customConfig.addProperty("sdkenv", "2");
        customConfig.addProperty("checkdevice", "false");
        customConfig.addProperty("loadPatch", "false");
        customConfig.addProperty("showexception", "true");
        customConfig.addProperty("regionConfig", "pm|fk|add");
        customConfig.addProperty("downloadMode", "0");
        customConfig.add("codeSwitch", codeSwitch);
        customConfig.add("coverSwitch", hiddenIcons);
        byte[] encodedConfig = new GsonBuilder().create().toJson(customConfig).getBytes();
        CryptoUtil.xor(encodedConfig, CryptoUtil.DISPATCH_KEY);

        // Build a query response
        this.queryResponse = QueryRegionListHttpRspOuterClass.QueryRegionListHttpRsp.newBuilder()
            .addAllRegionList(servers)
            .setEnableLoginPc(true)
            .setClientSecretKey(ByteString.copyFrom(CryptoUtil.DISPATCH_SEED))
            .setClientCustomConfigEncrypted(ByteString.copyFrom(encodedConfig))
            .build();

        // Encode the response
        this.encodedQueryResponse = Base64.getEncoder().encodeToString(this.queryResponse.toByteString().toByteArray());
    }

    @Override
    public Object handle(Request request, Response response) {
        if (!request.queryParams().contains("version")) {
            return "This endpoint is designed for the client only!";
        }

        // The client connecting
        GameClient client = new GameClient(
            request.queryParams("version"),
            request.queryParams("lang"),
            request.queryParams("platform"),
            request.queryParams("binary"),
            request.queryParams("channel_id"),
            request.queryParams("sub_channel_id")
        );

        this.server.getLogger().info("Incoming /query_region_list request from {}", client);
        return this.encodedQueryResponse;
    }
}
