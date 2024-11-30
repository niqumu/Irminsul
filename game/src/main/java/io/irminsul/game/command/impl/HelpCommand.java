package io.irminsul.game.command.impl;

import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandInfo;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.util.i18n.I18n;
import org.jetbrains.annotations.NotNull;

@CommandInfo(name = "help", description = "game.command.help.description", usage = "game.command.help.usage")
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

        // If no args were provided, display a list of commands
        if (args.length == 0) {
            StringBuilder message = new StringBuilder(I18n.translate("game.command.help.commands"));

            for (CommandHandler handler : this.getCommandManager().getRegisteredCommands().values()) {
                message
                    .append("\n - ")
                    .append(handler.getCommandInfo().name())
                    .append(": <i><color=\"#aaaaaa\">")
                    .append(I18n.translate(handler.getCommandInfo().description()))
                    .append("</color></i>");
            }

            this.sendMessage(sender, message.toString());
        }

        // If a command was provided, list some information on it
        else {
            for (CommandHandler handler : this.getCommandManager().getRegisteredCommands().values()) {
                CommandInfo info = handler.getCommandInfo();

                if (info.name().equalsIgnoreCase(args[0])) {
                    String message = info.name();

                    // Description
                    message += "\n" + I18n.translate("game.command.help.list_description")
                        .replace("{}", "<i><color=\"#aaaaaa\">" + I18n.translate(info.description()) + "</color></i>");

                    // Usage
                    message += "\n" + I18n.translate("game.command.help.list_usage")
                        .replace("{}", "<i><color=\"#aaaaaa\">" + I18n.translate(info.usage()) + "</color></i>");

                    // Privileged
                    message += "\n" + I18n.translate("game.command.help.list_privileged")
                        .replace("{}", "<i><color=\"#aaaaaa\">" +
                            I18n.translate(info.privileged() ? "generic.yes" : "generic.no") + "</color></i>");

                    // Registrar
                    message += "\n\n" + I18n.translate("game.command.help.list_registrar")
                        .replace("{}", "<i><color=\"#aaaaaa\">\"" + handler.getRegistrar()+ "\"</color></i>");

                    this.sendMessage(sender, message);
                    return;
                }
            }

            // We didn't find the plugin
            this.sendError(sender, I18n.translate("game.command.help.not_found").replace("{}", args[0]));
        }
    }
}
