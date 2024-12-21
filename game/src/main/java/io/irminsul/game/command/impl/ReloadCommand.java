package io.irminsul.game.command.impl;

import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandInfo;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.plugin.PluginReloadChanges;
import io.irminsul.common.util.i18n.I18n;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

@CommandInfo(name = "reload", description = "game.command.reload.description", usage = "game.command.reload.usage", privileged = true)
public class ReloadCommand extends CommandHandler {

    /**
     * Used for command confirmation. A map of player UID -> confirmation prompt time
     */
    private final Map<Integer, Long> confirmTimes = new HashMap<>();

    /**
     * Handles this command when executed
     *
     * @param sender  The player that executed the command
     * @param command The full command, as sent by the player
     * @param args    The arguments, as sent by the player
     */
    @Override
    public void handle(@NotNull Player sender, @NotNull String command, @NotNull String[] args) {

        // Confirmation
        if (!this.isConfirmed(sender.getUid())) {
            this.sendError(sender, I18n.translate("game.command.reload.confirm"));
            this.confirmTimes.put(sender.getUid(), System.currentTimeMillis());
            return;
        }

        long startTime = System.currentTimeMillis();
        PluginReloadChanges changes = this.getServer().reload();
        long timeElapsed = System.currentTimeMillis() - startTime;

        // Done
        this.sendMessage(sender, I18n.translate("game.command.reload.done")
            .formatted(timeElapsed, changes.getAdded(), changes.getRemoved(), changes.getChanged()));

        // Remove the player from the confirmation list
        this.confirmTimes.remove(sender.getUid());
    }

    private boolean isConfirmed(int uid) {
        if (!this.confirmTimes.containsKey(uid)) {
            return false;
        }

        // 15 second expiry
        return System.currentTimeMillis() < this.confirmTimes.get(uid) + (1000 * 15);
    }
}
