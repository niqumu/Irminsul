package io.irminsul.common.config.game;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * Configuration for mail sent to players when they join the server for the first time
 */
@Data
public class WelcomeMailConfig {

    /**
     * Used to enable/disable the welcome mail system
     */
    private final boolean enabled;

    /**
     * The name of the text file containing the welcome mail to use
     */
    private final @NotNull String file;

    /**
     * The subject of the welcome mail
     */
    private final @NotNull String subject;

    /**
     * The sender of the welcome mail
     */
    private final @NotNull String sender;
}
