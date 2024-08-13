package io.irminsul.game.command.impl;

import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandManager;
import io.irminsul.common.game.player.Player;
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
        return "Gives you the specified avatar (character)";
    }

    /**
     * @return A brief example of this command's usage
     */
    @Override
    public @NotNull String getUsage() {
        return "avatar <id>";
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
            this.commandManager.sendError(sender, "A avatar ID is required! Usage: " + this.getUsage());
            return;
        }

        int avatarId;
        try {
            avatarId = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            this.commandManager.sendError(sender, "Couldn't parse that as a number! Usage: " + this.getUsage());
            return;
        }

        // Make sure that the avatar isn't a duplicate
        for (Avatar avatar : sender.getAvatars()) {
            if (avatar.getAvatarId() == avatarId) {
                this.commandManager.sendError(sender, "You already have this avatar!");
                return;
            }
        }

        // Add the avatar
        Avatar avatar = new IrminsulAvatar(avatarId, sender);
        new PacketAddNoGachaAvatarCardNotify(sender.getSession(), avatar, ActionReason.AddAvatar).send();
        sender.addAvatar(avatar);

        this.commandManager.sendMessage(sender, "Gave you " + avatarId +
            " (" + avatar.getAvatarData().getName() + ")!");
    }
}
