package io.irminsul.common.config;

import io.irminsul.common.http.DispatchRegion;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class HttpServerConfig implements LanguageSupplier {

    /**
     * The global config this config is under
     */
    private final GlobalConfig globalConfig;



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
    private final List<DispatchRegion> regions = new ArrayList<>();

    @Override
    public String getLanguage() {
        return this.globalConfig.getLanguage();
    }
}
