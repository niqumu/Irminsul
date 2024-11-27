package io.irminsul.http.handler;

import com.google.protobuf.ByteString;
import io.irminsul.common.config.Config;
import io.irminsul.common.http.HttpServer;
import io.irminsul.common.proto.http.QueryCurrRegionHttpRspOuterClass;
import io.irminsul.common.proto.http.RegionInfoOuterClass;
import io.irminsul.common.proto.http.RetcodeOuterClass;
import io.irminsul.common.util.CryptoUtil;
import io.irminsul.common.http.DispatchRegion;
import io.irminsul.common.util.i18n.I18n;
import lombok.RequiredArgsConstructor;
import spark.Request;
import spark.Response;
import spark.Route;

@RequiredArgsConstructor
public class QueryCurrentRegionHandler implements Route {

    /**
     * The {@link HttpServer} this handler belongs to
     */
    private final HttpServer server;

    @Override
    public Object handle(Request request, Response response) {
        String region = request.params(":region");
        String keyID = request.queryParams("key_id");
        DispatchRegion resolvedRegion = null;
        this.server.getLogger().debug("Incoming /query_cur_region request for region {} with key id {}", region, keyID);

        for (DispatchRegion serverRegion : this.server.getRegions()) {
            if (serverRegion.name().equals(region)) {
                resolvedRegion = serverRegion;
                break;
            }
        }

        if (resolvedRegion == null) {
            this.server.getLogger().error(I18n.translate("http.error.region_resolve_failed", this.server.getConfig()), region);
            return null;
        }

        RegionInfoOuterClass.RegionInfo regionInfo = RegionInfoOuterClass.RegionInfo.newBuilder()
            .setGateserverIp(resolvedRegion.ip())
            .setGateserverPort(resolvedRegion.port())
            .build();

        QueryCurrRegionHttpRspOuterClass.QueryCurrRegionHttpRsp queryResponse =
            QueryCurrRegionHttpRspOuterClass.QueryCurrRegionHttpRsp.newBuilder()
                .setRetcode(RetcodeOuterClass.Retcode.RET_SUCC_VALUE)
                .setRegionInfo(regionInfo)
                .setClientSecretKey(ByteString.copyFrom(CryptoUtil.DISPATCH_SEED))
                .build();

//        QueryCurrRegionHttpRspOuterClass.QueryCurrRegionHttpRsp queryResponse =
//            QueryCurrRegionHttpRspOuterClass.QueryCurrRegionHttpRsp.newBuilder()
//                .setRetcode(RetcodeOuterClass.Retcode.RET_STOP_SERVER_VALUE)
//                .setMsg("Testing message")
//                .setRegionInfo(RegionInfoOuterClass.RegionInfo.newBuilder())
//                .setStopServer(
//                    StopServerInfoOuterClass.StopServerInfo.newBuilder()
//                        .setUrl("https://github.com/niqumu")
//                        .setStopBeginTime((int) Instant.now().getEpochSecond())
//                        .setStopEndTime((int) Instant.now().getEpochSecond() + 1)
//                        .setContentMsg("Hello world!")
//                        .build()
//                )
//                .buildPartial();

        try {
            return CryptoUtil.encodeCurrentRegion(queryResponse.toByteArray(), keyID);
        } catch (Exception e) {
            this.server.getLogger().error(I18n.translate("http.error.region_encode_failed", this.server.getConfig()), e);
            return null;
        }
    }
}
