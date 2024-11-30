package io.irminsul.game.command.impl;

import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandInfo;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.util.i18n.I18n;
import io.irminsul.game.data.ActionReason;
import io.irminsul.game.item.IrminsulItem;
import org.jetbrains.annotations.NotNull;

@CommandInfo(name = "item", description = "game.command.item.description", usage = "game.command.item.usage")
public class ItemCommand extends CommandHandler {

    /**
     * Handles this command when executed
     *
     * @param sender  The player that executed the command
     * @param command The full command, as sent by the player
     * @param args    The arguments, as sent by the player
     */
    @Override
    public void handle(@NotNull Player sender, @NotNull String command, @NotNull String[] args) {

        // Ensure that an item was provided
        if (args.length == 0) {
            this.sendError(sender, I18n.translate("game.command.item.no_id"));
            this.sendUsage(sender);
            return;
        }

        int itemId, count = 1;
        try {
            itemId = Integer.parseInt(args[0]);
            if (args.length > 1) {
                count = Integer.parseInt(args[1]);
            }
        } catch (NumberFormatException e) {
            this.sendError(sender, I18n.translate("game.command.item.bad_id"));
            return;
        }

        // Add the item
        sender.getInventory().addItem(new IrminsulItem(itemId, count, sender), ActionReason.NONE);
        this.sendMessage(sender, I18n.translate("game.command.item.success").replace("{}", Integer.toString(itemId)));
    }
}
