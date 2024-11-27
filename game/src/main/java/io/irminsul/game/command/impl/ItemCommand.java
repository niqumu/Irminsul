package io.irminsul.game.command.impl;

import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandManager;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.util.i18n.I18n;
import io.irminsul.game.data.ActionReason;
import io.irminsul.game.item.IrminsulItem;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Getter
@RequiredArgsConstructor
public class ItemCommand implements CommandHandler {

    /**
     * The {@link CommandManager} that this command is registered with
     */
    private final CommandManager commandManager;

    /**
     * @return The all-lowercase name of this command
     */
    @Override
    public @NotNull String getName() {
        return "item";
    }

    /**
     * @return A brief description of this command
     */
    @Override
    public @NotNull String getDescription() {
        return I18n.translate("game.command.item.description", this.commandManager.getServer().getConfig());
    }

    /**
     * @return A brief example of this command's usage
     */
    @Override
    public @NotNull String getUsage() {
        return I18n.translate("game.command.item.usage", this.commandManager.getServer().getConfig());
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

        // Ensure that an item was provided
        if (args.length == 0) {
            this.commandManager.sendError(sender, I18n.translate("game.command.item.no_id",
                this.commandManager.getServer().getConfig()));
            this.commandManager.sendError(sender, I18n.translate("game.command.usage",
                this.commandManager.getServer().getConfig()).replace("{}", this.getUsage()));
            return;
        }

        int itemId, count = 1;
        try {
            itemId = Integer.parseInt(args[0]);
            if (args.length > 1) {
                count = Integer.parseInt(args[1]);
            }
        } catch (NumberFormatException e) {
            this.commandManager.sendError(sender, I18n.translate("game.command.item.bad_id",
                this.commandManager.getServer().getConfig()));
            return;
        }

        // Add the item
        sender.getInventory().addItem(new IrminsulItem(itemId, count, sender), ActionReason.NONE);
        this.commandManager.sendMessage(sender, I18n.translate("game.command.item.success",
            this.commandManager.getServer().getConfig()).replace("{}", Integer.toString(itemId)));
    }
}
