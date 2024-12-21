package io.irminsul.game.command.impl;

import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandInfo;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.util.i18n.I18n;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

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

            Stream<CommandHandler> commands = this.getCommandManager().getRegisteredCommands().values().stream();

            // Remove duplicate command entries (caused by aliases)
            commands = commands.distinct();

            // Sort commands alphabetically
            commands = commands.sorted(Comparator.comparing(CommandHandler::getFullName));

            for (CommandHandler handler : commands.toList()) {

                message
                    .append("\n - ")
                    .append(handler.getFullName())
                    .append(": <i><color=\"#aaaaaa\">")
                    .append(I18n.translate(handler.getCommandInfo().description()))
                    .append("</color></i>");
            }

            this.sendMessage(sender, message.toString());
        }

        // If a command was provided, list some information on it
        else {
            String targetCommand = args[0];

            // If the command doesn't have a namespace, resolve it and prepend it
            if (!targetCommand.contains(":")) {
                String resolvedCommand;
                try {
                    resolvedCommand = this.getCommandManager().resolveNamespace(targetCommand);
                } catch (NoSuchElementException e) {

                    // No such command exists (no matches found)
                    this.sendError(sender, I18n.translate("game.command.help.not_found").replace("{}", targetCommand));
                    return;
                }

                if (resolvedCommand == null) {
                    // Multiple matches exist
                    this.sendError(sender, I18n.translate("game.command.ambiguous").replace("{}", targetCommand));
                    return;
                }

                targetCommand = resolvedCommand;
            }

            // Iterate over commands
            for (Map.Entry<String, CommandHandler> entry : this.getCommandManager().getRegisteredCommands().entrySet()) {
                CommandInfo info = entry.getValue().getCommandInfo();

                // We found the provided command
                if (entry.getValue().getFullName().equalsIgnoreCase(targetCommand)) {

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

                    // Aliases
                    if (info.aliases().length != 0) {
                        message += "\n" + I18n.translate("game.command.help.list_aliases")
                            .replace("{}", "<i><color=\"#aaaaaa\">" +
                                Arrays.toString(info.aliases()) + "</color></i>");
                    }

                    // Registrar
                    message += "\n\n" + I18n.translate("game.command.help.list_registrar")
                        .replace("{}", "<i><color=\"#aaaaaa\">\"" + entry.getValue().getRegistrar()+ "\"</color></i>");

                    this.sendMessage(sender, message);
                    return;
                }

                // We found the provided command, as an alias
                else if (entry.getKey().equalsIgnoreCase(targetCommand)) {

                    String message = entry.getKey();

                    message += "\n" + I18n.translate("game.command.help.alias")
                        .replace("{}", "<i><color=\"#aaaaaa\">" + entry.getValue().getFullName() + "</color></i>");
                    this.sendMessage(sender, message);
                    return;
                }
            }

            // We didn't find the command
            this.sendError(sender, I18n.translate("game.command.help.not_found").replace("{}", targetCommand));
        }
    }
}
