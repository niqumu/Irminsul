package io.irminsul.common;

import io.irminsul.common.config.Config;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a class that publicly supplies a {@link io.irminsul.common.config.Config} instance
 */
public interface ConfigContainer {

    /**
     * @return This container's config
     */
    @NotNull Config getConfig();
}
