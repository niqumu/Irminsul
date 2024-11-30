package io.irminsul.common.game.command;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.util.i18n.I18n;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a class capable of handling a command
 */
@Setter
@Getter
public abstract class CommandHandler {

    /**
     * The {@link CommandManager} that this command is registered with
     */
    private CommandManager commandManager;

    /**
     * The plugin or module that registered this command
     */
    private String registrar;

    /**
     * Handles this command when executed
     * @param sender The player that executed the command
     * @param command The full command, as sent by the player
     * @param args The arguments, as sent by the player
     */
    public abstract void handle(@NotNull Player sender, @NotNull String command, @NotNull String[] args);

    /**
     * Sends the player a message from the server
     * @param player The player to send the message to
     * @param message The message to send
     */
    protected void sendMessage(@NotNull Player player, @NotNull String message) {
        this.commandManager.sendMessage(player, message);
    }

    /**
     * Sends the player a red error message from the server
     * @param player The player to send the message to
     * @param message The message to send
     */
    protected void sendError(@NotNull Player player, @NotNull String message) {
        this.commandManager.sendError(player, message);
    }

    /**
     * @return The {@link GameServer} this command is registered under
     */
    protected @NotNull GameServer getServer() {
        return this.commandManager.getServer();
    }

    /**
     * Sends the command usage to a given player
     * @param player The player to send the command usage to
     */
    protected void sendUsage(@NotNull Player player) {
        this.sendError(player, I18n.translate("game.command.usage", this.getServer().getConfig())
            .replace("{}", I18n.translate(this.getCommandInfo().usage(), this.getServer().getConfig())));
    }

    /**
     * @return The {@link CommandInfo} attached to this handler, or {@code null} if none exists
     */
    public CommandInfo getCommandInfo() {
        return this.getClass().getAnnotation(CommandInfo.class);
    }
}
