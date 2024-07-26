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
    HTTP_PORT("http_port", 3000),
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
