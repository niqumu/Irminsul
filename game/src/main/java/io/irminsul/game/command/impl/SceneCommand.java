package io.irminsul.game.command.impl;

import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandManager;
import io.irminsul.common.game.player.Player;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Getter
@RequiredArgsConstructor
public class SceneCommand implements CommandHandler {

    /**
     * The {@link CommandManager} that this command is registered with
     */
    private final CommandManager commandManager;

    /**
     * @return The all-lowercase name of this command
     */
    @Override
    public @NotNull String getName() {
        return "scene";
    }

    /**
     * @return A brief description of this command
     */
    @Override
    public @NotNull String getDescription() {
        return "Sends you to a specified scene (scene 3 is Teyvat)";
    }

    /**
     * @return A brief example of this command's usage
     */
    @Override
    public @NotNull String getUsage() {
        return "scene <id>";
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

        // Ensure that a scene was provided
        if (args.length == 0) {
            this.commandManager.sendError(sender, "A destination scene ID is required! Usage: " + this.getUsage());
            return;
        }

        int sceneId;
        try {
            sceneId = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            this.commandManager.sendError(sender, "Couldn't parse that as a number! Usage: " + this.getUsage());
            return;
        }

        sender.sendToScene(sceneId);
        this.commandManager.sendMessage(sender, "Sending to you to scene" + sceneId + "...");
    }
}
