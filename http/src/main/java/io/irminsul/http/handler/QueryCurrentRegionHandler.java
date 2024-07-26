package io.irminsul.http.handler;

import com.google.protobuf.ByteString;
import io.irminsul.common.proto.QueryCurrRegionHttpRspOuterClass;
import io.irminsul.common.proto.RegionInfoOuterClass;
import io.irminsul.common.proto.RetcodeOuterClass;
import io.irminsul.common.proto.StopServerInfoOuterClass;
import io.irminsul.common.util.CryptoUtil;
import io.irminsul.http.HTTPServer;
import io.irminsul.http.dispatch.DispatchRegion;
import lombok.RequiredArgsConstructor;
import spark.Request;
import spark.Response;
import spark.Route;

import java.time.Instant;

@RequiredArgsConstructor
public class QueryCurrentRegionHandler implements Route {

    /**
     * The {@link HTTPServer} this handler belongs to
     */
    private final HTTPServer server;

    @Override
    public Object handle(Request request, Response response) {
        String region = request.params(":region");
        String keyID = request.queryParams("key_id");
        DispatchRegion resolvedRegion = null;
        this.server.getLogger().info("Incoming /query_cur_region request for region {} with key id {}", region, keyID);

        for (DispatchRegion serverRegion : this.server.getRegions()) {
            if (serverRegion.name().equals(region)) {
                resolvedRegion = serverRegion;
                break;
            }
        }

        if (resolvedRegion == null) {
            this.server.getLogger().error("Couldn't resolve region \"{}\"!", region);
            return null;
        }

        RegionInfoOuterClass.RegionInfo regionInfo = RegionInfoOuterClass.RegionInfo.newBuilder()
            .setGateserverIp(resolvedRegion.ip())
            .setGateserverPort(resolvedRegion.port())
            .build();

//        QueryCurrRegionHttpRspOuterClass.QueryCurrRegionHttpRsp queryResponse =
//            QueryCurrRegionHttpRspOuterClass.QueryCurrRegionHttpRsp.newBuilder()
//                .setRetcode(RetcodeOuterClass.Retcode.RET_SUCC_VALUE)
//                .setRegionInfo(regionInfo)
//                .setClientSecretKey(ByteString.copyFrom(CryptoUtil.DISPATCH_SEED))
//                .build();

        QueryCurrRegionHttpRspOuterClass.QueryCurrRegionHttpRsp queryResponse =
            QueryCurrRegionHttpRspOuterClass.QueryCurrRegionHttpRsp.newBuilder()
                .setRetcode(RetcodeOuterClass.Retcode.RET_STOP_SERVER_VALUE)
                .setMsg("Testing message")
                .setRegionInfo(RegionInfoOuterClass.RegionInfo.newBuilder())
                .setStopServer(
                    StopServerInfoOuterClass.StopServerInfo.newBuilder()
                        .setUrl("https://github.com/niqumu")
                        .setStopBeginTime((int) Instant.now().getEpochSecond())
                        .setStopEndTime((int) Instant.now().getEpochSecond() + 1)
                        .setContentMsg("Hello world!")
                        .build()
                )
                .buildPartial();

        try {
            return CryptoUtil.encodeCurrentRegion(queryResponse.toByteArray(), keyID);
        } catch (Exception e) {
            this.server.getLogger().error("Failed to encode current region!", e);
            return null;
        }
    }
}
