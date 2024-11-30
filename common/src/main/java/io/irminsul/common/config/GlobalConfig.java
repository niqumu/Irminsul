package io.irminsul.common.config;

import lombok.Data;

@Data
public class GlobalConfig {

    /**
     * The game version that may connect to this Irminsul network
     */
    private final String targetVersion;

    /**
     * The language this Irminsul network will use in logs and in-game
     */
    private final String language;

    /**
     * Whether to prevent the logging of the IP addresses of clients
     */
    private final boolean hideAddresses;
}
