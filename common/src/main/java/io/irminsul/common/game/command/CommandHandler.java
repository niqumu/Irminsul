package io.irminsul.common.game.command;

import io.irminsul.common.game.player.Player;
import org.jetbrains.annotations.NotNull;

public interface CommandHandler {

    /**
     * @return The {@link CommandManager} that this command is registered with
     */
    @NotNull CommandManager getCommandManager();

    /**
     * @return The all-lowercase name of this command
     */
    @NotNull String getName();

    /**
     * @return A brief description of this command
     */
    @NotNull String getDescription();

    /**
     * @return A brief example of this command's usage
     */
    @NotNull String getUsage();

    /**
     * Handles this command when executed
     * @param sender The player that executed the command
     * @param command The full command, as sent by the player
     * @param args The arguments, as sent by the player
     */
    void handle(@NotNull Player sender, @NotNull String command, @NotNull String[] args);
}
