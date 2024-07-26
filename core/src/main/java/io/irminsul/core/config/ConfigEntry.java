package io.irminsul.core.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ConfigEntry {
    LANGUAGE("language", "en_US"),
    HTTP_PORT("http_port", 3000),
    DISPATCH_PORT("dispatch_port", 1111),
    GAME_PORT("game_port", 22102);

    private final String key;

    private final Object defaultValue;
}
