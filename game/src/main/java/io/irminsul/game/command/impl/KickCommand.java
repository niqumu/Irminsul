package io.irminsul.game.command.impl;

import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandInfo;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.util.i18n.I18n;
import org.jetbrains.annotations.NotNull;

@CommandInfo(name = "kick", description = "game.command.kick.description", usage = "game.command.kick.usage", privileged = true)
public class KickCommand extends CommandHandler {

    /**
     * Handles this command when executed
     *
     * @param sender  The player that executed the command
     * @param command The full command, as sent by the player
     * @param args    The arguments, as sent by the player
     */
    @Override
    public void handle(@NotNull Player sender, @NotNull String command, @NotNull String[] args) {

        // Ensure that a username was provided
        if (args.length == 0) {
            this.sendError(sender, I18n.translate("game.command.kick.no_player"));
            this.sendUsage(sender);
            return;
        }

        Player player = null;
        for (Player onlinePlayer : this.getServer().getOnlinePlayers().values()) {
            if (onlinePlayer.getProfile().getNickname().equalsIgnoreCase(args[0])) {
                player = onlinePlayer;
                break;
            }
        }
        if (player == null) {
            this.sendError(sender, I18n.translate("game.command.kick.not_found"));
            this.sendUsage(sender);
            return;
        }

        // Close the KCP connection of the matched player
        player.getSession().getTunnel().close();
    }
}
