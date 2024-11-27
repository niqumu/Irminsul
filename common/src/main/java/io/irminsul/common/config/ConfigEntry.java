package io.irminsul.common.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Locale;
import java.util.function.Supplier;

/**
 * Enum to represent entries in the configuration file
 */
@Getter
@AllArgsConstructor
public enum ConfigEntry {

    /**
     * The language used by this server. Defaults to either "zh_CN" or "en_US" depending on the JVM locale.
     */
    LANGUAGE("language", () -> Locale.getDefault().getLanguage().equals("zh") ? "zh_CN" : "en_US"),

    /**
     * The game version this server is targeting. Defaults to "not set", which must be changed before use.
     */
    TARGET_VERSION("target_version", "not set"),

    /**
     * Whether the HTTP server service should be enabled on this server. Defaults to true.
     */
    HTTP_ENABLED("http_enabled", "true"),

    /**
     * The port the HTTP server service should run on. Defaults to 3000.
     */
    HTTP_PORT("http_port", "3000"),

    /**
     * Whether the HTTP server service should enable SSL encryption. Defaults to false.
     */
    HTTP_USE_SSL("http_ssl", "false"),

    /**
     * Whether the game server service should be enabled on this server. Defaults to true.
     */
    GAME_ENABLED("game_enabled", "true"),

    /**
     * The port the game server service should run on. Defaults to 22102.
     */
    GAME_PORT("game_port", "22102"),

    /**
     * Whether the game server service should run in "sandbox mode", unlocking all features, areas, avatars, etc., as
     * opposed to "realism" mode, which attempts to emulate official servers. Defaults to true.
     */
    GAME_SANDBOX("game_sandbox_mode", "true");

    /**
     * The key used to identify this entry
     */
    private final String key;

    /**
     * The default value of this entry
     */
    private final String defaultValue;

    /**
     * Create a new ConfigEntry using a {@link Supplier} to provide a default value
     * @param key The key used to identify this entry
     * @param defaultValueSupplier A {@link Supplier}{@code <String>} that provides the default value of this entry
     */
    ConfigEntry(String key, Supplier<String> defaultValueSupplier) {
        this(key, defaultValueSupplier.get());
    }
}
