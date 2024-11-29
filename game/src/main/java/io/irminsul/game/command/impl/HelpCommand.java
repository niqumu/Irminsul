package io.irminsul.game.command.impl;

import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandManager;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.util.i18n.I18n;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Getter
@RequiredArgsConstructor
public class HelpCommand implements CommandHandler {

    /**
     * The {@link CommandManager} that this command is registered with
     */
    private final CommandManager commandManager;

    /**
     * @return The all-lowercase name of this command
     */
    @Override
    public @NotNull String getName() {
        return "help";
    }

    /**
     * @return A brief description of this command
     */
    @Override
    public @NotNull String getDescription() {
        return I18n.translate("game.command.help.description", this.commandManager.getServer().getConfig());
    }

    /**
     * @return A brief example of this command's usage
     */
    @Override
    public @NotNull String getUsage() {
        return "help";
    }

    /**
     * Handles this command when executed
     *
     * @param sender  The player that executed the command
     * @param command The full command, as sent by the player
     * @param args    The arguments, as sent by the player
     */
    @Override
    public void handle(@NotNull Player sender, @NotNull String command, @NotNull String[] args) {
        StringBuilder message = new StringBuilder(I18n.translate("game.command.help.commands",
            this.commandManager.getServer().getConfig()));

        for (CommandHandler handler : this.commandManager.getRegisteredCommands().values()) {
            message
                .append("\n - ")
                .append(handler.getName())
                .append(": <i><color=\"#aaaaaa\">")
                .append(handler.getDescription())
                .append("</color></i>");
        }

        this.commandManager.sendMessage(sender, message.toString());
    }
}
