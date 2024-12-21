package io.irminsul.game.command.impl;

import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandInfo;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.util.i18n.I18n;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

@CommandInfo(name = "players", description = "game.command.players.description", usage = "game.command.players.usage", privileged = false, aliases = {"who", "online"})
public class PlayersCommand extends CommandHandler {

    /**
     * Handles this command when executed
     *
     * @param sender  The player that executed the command
     * @param command The full command, as sent by the player
     * @param args    The arguments, as sent by the player
     */
    @Override
    public void handle(@NotNull Player sender, @NotNull String command, @NotNull String[] args) {
        StringBuilder message = new StringBuilder();

        for (Map.Entry<Integer, Player> entry : this.getServer().getOnlinePlayers().entrySet()) {
            message.append(entry.getValue().toString());
        }

        this.sendMessage(sender, message.toString());
    }
}
