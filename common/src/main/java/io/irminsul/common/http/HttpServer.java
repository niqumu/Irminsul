package io.irminsul.common.http;

import org.slf4j.Logger;
import spark.Service;

import java.util.List;

public interface HttpServer {

    /**
     * @return This server's logger
     */
    Logger getLogger();

    /**
     * @return The Spark {@link Service} instance of this web server
     */
    Service getSpark();

    /**
     * @return The port this web server is running on
     */
    int getPort();

    /**
     * @return A list of regions registered on this web server
     */
    List<DispatchRegion> getRegions();
}
