package io.irminsul.game.command.impl;

import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandInfo;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.util.i18n.I18n;
import io.irminsul.game.avatar.IrminsulAvatar;
import io.irminsul.game.data.ActionReason;
import io.irminsul.game.net.packet.PacketAddNoGachaAvatarCardNotify;
import org.jetbrains.annotations.NotNull;

@CommandInfo(name = "avatar", description = "game.command.avatar.description", usage = "game.command.avatar.usage")
public class AvatarCommand extends CommandHandler {

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
            this.sendError(sender, I18n.translate("game.command.avatar.no_id", this.getServer().getConfig()));
            this.sendUsage(sender);
            return;
        }

        int avatarId;
        try {
            avatarId = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            this.sendError(sender, I18n.translate("game.command.avatar.bad_id", this.getServer().getConfig()));
            return;
        }

        // Make sure that the avatar isn't a duplicate
        for (Avatar avatar : sender.getAvatars()) {
            if (avatar.getAvatarId() == avatarId) {
                this.sendError(sender, I18n.translate("game.command.avatar.duplicate", this.getServer().getConfig()));
                return;
            }
        }

        // Add the avatar
        Avatar avatar = new IrminsulAvatar(avatarId, sender);
        new PacketAddNoGachaAvatarCardNotify(sender.getSession(), avatar, ActionReason.ADD_AVATAR).send();
        sender.addAvatar(avatar);

        this.sendMessage(sender, I18n.translate("game.command.avatar.success",
            this.getServer().getConfig()).replace("{}", avatar.getAvatarData().getName()));
    }
}
