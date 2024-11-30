package io.irminsul.common.config;

import io.irminsul.common.http.DispatchRegion;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class HttpServerConfig {

    /**
     * The global config this config is under
     */
    private final @NotNull GlobalConfig globalConfig;



    /**
     * Whether the HTTP server is enabled
     */
    private final boolean enabled;

    /**
     * The port the HTTP server will run on
     */
    private final int port;

    /**
     * Whether the HTTP server is to use HTTPS encryption
     */
    private final boolean ssl;

    /**
     * Whether to enable integration with the game client's debugging/logging system
     */
    private final boolean clientDebugging;

    /**
     * A list of target game servers this HTTP server will dispatch to
     */
    private final @NotNull List<DispatchRegion> regions = new ArrayList<>();
}
