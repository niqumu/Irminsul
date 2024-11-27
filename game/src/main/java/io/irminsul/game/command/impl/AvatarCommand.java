package io.irminsul.game.command.impl;

import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandManager;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.util.i18n.I18n;
import io.irminsul.game.avatar.IrminsulAvatar;
import io.irminsul.game.data.ActionReason;
import io.irminsul.game.net.packet.PacketAddNoGachaAvatarCardNotify;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Getter
@RequiredArgsConstructor
public class AvatarCommand implements CommandHandler {

    /**
     * The {@link CommandManager} that this command is registered with
     */
    private final CommandManager commandManager;

    /**
     * @return The all-lowercase name of this command
     */
    @Override
    public @NotNull String getName() {
        return "avatar";
    }

    /**
     * @return A brief description of this command
     */
    @Override
    public @NotNull String getDescription() {
        return I18n.translate("game.command.avatar.description", this.commandManager.getServer().getConfig());
    }

    /**
     * @return A brief example of this command's usage
     */
    @Override
    public @NotNull String getUsage() {
        return I18n.translate("game.command.avatar.usage", this.commandManager.getServer().getConfig());
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

        // Ensure that an avatar was provided
        if (args.length == 0) {
            this.commandManager.sendError(sender, I18n.translate("game.command.avatar.no_id",
                this.commandManager.getServer().getConfig()));
            this.commandManager.sendError(sender, I18n.translate("game.command.usage",
                this.commandManager.getServer().getConfig()).replace("{}", this.getUsage()));
            return;
        }

        int avatarId;
        try {
            avatarId = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            this.commandManager.sendError(sender, I18n.translate("game.command.avatar.bad_id",
                this.commandManager.getServer().getConfig()));
            return;
        }

        // Make sure that the avatar isn't a duplicate
        for (Avatar avatar : sender.getAvatars()) {
            if (avatar.getAvatarId() == avatarId) {
                this.commandManager.sendError(sender, I18n.translate("game.command.avatar.duplicate",
                    this.commandManager.getServer().getConfig()));
                return;
            }
        }

        // Add the avatar
        Avatar avatar = new IrminsulAvatar(avatarId, sender);
        new PacketAddNoGachaAvatarCardNotify(sender.getSession(), avatar, ActionReason.ADD_AVATAR).send();
        sender.addAvatar(avatar);

        this.commandManager.sendMessage(sender, I18n.translate("game.command.avatar.success",
            this.commandManager.getServer().getConfig()).replace("{}", avatar.getAvatarData().getName()));
    }
}
