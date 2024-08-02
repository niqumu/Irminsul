package io.irminsul.core.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Enum to represent entries in the configuration file
 */
@Getter
@AllArgsConstructor
public enum ConfigEntry {
    LANGUAGE("language", "en_US"),
    HTTP_ENABLED("http_enabled", true),
    HTTP_PORT("http_port", 3000),
    HTTP_USE_SSL("http_ssl", false),
    GAME_ENABLED("game_enabled", true),
    GAME_PORT("game_port", 22102);

    /**
     * The key used to identify this entry
     */
    private final String key;

    /**
     * The default value of this entry
     */
    private final Object defaultValue;
}
