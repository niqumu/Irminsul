package io.irminsul.common.game.command;

import org.jetbrains.annotations.NotNull;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Annotation used to provide basic information on a command
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface CommandInfo {

    /**
     * @return The all-lowercase name of this command
     */
    @NotNull String name();

    /**
     * @return A brief description of this command
     */
    @NotNull String description();

    /**
     * @return A brief example of this command's usage
     */
    @NotNull String usage();

    /**
     * @return Whether executing this command requires operator status
     */
    boolean privileged() default false;

    String[] aliases() default {};
}
