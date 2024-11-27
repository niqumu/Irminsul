package io.irminsul.common.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Enum to represent entries in the configuration file
 */
@Getter
@AllArgsConstructor
public enum ConfigEntry {
    LANGUAGE("language", "en_US"),
    TARGET_VERSION("target_version", "not set"),
    HTTP_ENABLED("http_enabled", "true"),
    HTTP_PORT("http_port", "3000"),
    HTTP_USE_SSL("http_ssl", "false"),
    GAME_ENABLED("game_enabled", "true"),
    GAME_PORT("game_port", "22102"),
    GAME_SANDBOX("game_sandbox_mode", "true");

    /**
     * The key used to identify this entry
     */
    private final String key;

    /**
     * The default value of this entry
     */
    private final String defaultValue;
}
