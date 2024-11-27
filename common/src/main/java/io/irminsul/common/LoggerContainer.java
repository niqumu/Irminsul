package io.irminsul.common;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

/**
 * Represents a class that publicly supplies an SLF4J logger
 */
public interface LoggerContainer {

    /**
     * @return This container's logger
     */
    @NotNull Logger getLogger();
}
