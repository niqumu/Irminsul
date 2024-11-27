package io.irminsul.common.config;

import lombok.NonNull;

/**
 * Interface representing a server configuration containing a map of {@link ConfigEntry} {@code -> String}
 * @see ConfigEntry configuration keys
 */
public interface Config {

    /**
     * Gets a value from the config, keyed by {@link ConfigEntry}
     * @param key The {@link ConfigEntry} to lookup
     * @return The value associated with the provided key in this configuration
     */
    @NonNull String getValue(@NonNull ConfigEntry key);

    /**
     * Sets a value in the config, keyed by {@link ConfigEntry}
     * @param key The {@link ConfigEntry} to set
     * @param value The new value to associate with the provided key
     */
    void setValue(@NonNull ConfigEntry key, @NonNull Object value);
}
