package io.irminsul.game.command.impl;

import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandInfo;
import io.irminsul.common.game.player.Player;
import org.jetbrains.annotations.NotNull;

@CommandInfo(name = "scene", description = "Sends you to a scene", usage = "scene <id>")
public class SceneCommand extends CommandHandler {

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
            this.sendError(sender, "A destination scene ID is required!");
            this.sendUsage(sender);
            return;
        }

        int sceneId;
        try {
            sceneId = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            this.sendError(sender, "Couldn't parse that as a number!");
            this.sendUsage(sender);
            return;
        }

        sender.sendToScene(sceneId);
        this.sendMessage(sender, "Sending to you to scene" + sceneId + "...");
    }
}
