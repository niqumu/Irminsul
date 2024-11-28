package io.irminsul.common.http;

import io.irminsul.common.LoggerContainer;
import io.irminsul.common.config.HttpServerConfig;
import org.jetbrains.annotations.NotNull;
import spark.Service;

import java.util.List;

public interface HttpServer extends LoggerContainer {

    /**
     * @return This HttpServer's {@link HttpServerConfig}
     */
    @NotNull HttpServerConfig getConfig();

    /**
     * @return The Spark {@link Service} instance of this web server
     */
    @NotNull Service getSpark();

    /**
     * @return The port this web server is running on
     */
    int getPort();

    /**
     * @return A list of {@link DispatchRegion}s registered on this web server
     */
    @NotNull List<DispatchRegion> getRegions();
}
