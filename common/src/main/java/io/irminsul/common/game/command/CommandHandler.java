package io.irminsul.common.game.command;

import org.jetbrains.annotations.NotNull;

public interface CommandHandler {
    @NotNull String getName();

    @NotNull String getDescription();

    void handle(String command, String[] args);
}
