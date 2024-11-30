package io.irminsul.game.command.impl;

import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandInfo;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.plugin.PluginInfo;
import io.irminsul.common.util.i18n.I18n;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@CommandInfo(name = "plugins", description = "game.command.plugins.description", usage = "game.command.plugins.usage")
public class PluginsCommand extends CommandHandler {

    /**
     * Handles this command when executed
     *
     * @param sender  The player that executed the command
     * @param command The full command, as sent by the player
     * @param args    The arguments, as sent by the player
     */
    @Override
    public void handle(@NotNull Player sender, @NotNull String command, @NotNull String[] args) {
        List<PluginInfo> plugins = this.getServer().getPlugins();

        // If no args were provided, display a list of plugins
        if (args.length == 0) {
            StringBuilder message = new StringBuilder("Plugins: " + plugins.size());

            for (PluginInfo plugin : plugins) {
                message
                    .append("\n - ")
                    .append(plugin.getName())
                    .append(": <i><color=\"#aaaaaa\">(")
                    .append(plugin.getId())
                    .append(")</color></i>");
            }

            this.sendMessage(sender, message.toString());
        }

        // If a plugin ID was provided, list some information on it
        else {
            for (PluginInfo plugin : plugins) {
                if (plugin.getId().equalsIgnoreCase(args[0])) {
                    String message = "%s (%s):".formatted(plugin.getName(), plugin.getId());

                    message += "\nDescription: <i><color=\"#aaaaaa\">" + plugin.getDescription() + "</color></i>";
                    message += "\nVersion: <i><color=\"#aaaaaa\">" + plugin.getVersion() + "</color></i>";
                    message += "\nAuthor: <i><color=\"#aaaaaa\">" + plugin.getAuthor() + "</color></i>";
                    message += "\nWebsite: <i><color=\"#aaaaaa\">" + plugin.getWebsite() + "</color></i>";
                    message += "\n\nLoaded from <i><color=\"#aaaaaa\">" + plugin.getFilename() + "</color></i>";

                    this.sendMessage(sender, message);

                    return;
                }
            }

            // We didn't find the plugin
            this.sendError(sender, I18n.translate("game.command.plugins.not_found",
                this.getServer().getConfig()).replace("{}", args[0]));
        }
    }
}
