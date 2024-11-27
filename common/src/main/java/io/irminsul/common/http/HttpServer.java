package io.irminsul.common.http;

import io.irminsul.common.ConfigContainer;
import io.irminsul.common.LoggerContainer;
import spark.Service;

import java.util.List;

public interface HttpServer extends LoggerContainer, ConfigContainer {

    /**
     * @return The Spark {@link Service} instance of this web server
     */
    Service getSpark();

    /**
     * @return The port this web server is running on
     */
    int getPort();

    /**
     * @return A list of {@link DispatchRegion}s registered on this web server
     */
    List<DispatchRegion> getRegions();
}
