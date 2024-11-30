package io.irminsul.game.command.impl;

import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandInfo;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.util.i18n.I18n;
import org.jetbrains.annotations.NotNull;

@CommandInfo(name = "help", description = "game.command.help.description", usage = "help")
public class HelpCommand extends CommandHandler {

    /**
     * Handles this command when executed
     *
     * @param sender  The player that executed the command
     * @param command The full command, as sent by the player
     * @param args    The arguments, as sent by the player
     */
    @Override
    public void handle(@NotNull Player sender, @NotNull String command, @NotNull String[] args) {
        StringBuilder message = new StringBuilder(I18n.translate("game.command.help.commands", this.getServer().getConfig()));

        for (CommandHandler handler : this.getCommandManager().getRegisteredCommands().values()) {
            message
                .append("\n - ")
                .append(handler.getCommandInfo().name())
                .append(": <i><color=\"#aaaaaa\">")
                .append(handler.getCommandInfo().description())
                .append("</color></i>");
        }

        this.sendMessage(sender, message.toString());
    }
}
