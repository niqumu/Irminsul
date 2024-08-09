package io.irminsul.common.game.command;

import io.irminsul.common.game.ServerSystem;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.proto.FriendBriefOuterClass.FriendBrief;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface CommandManager extends ServerSystem {

    /**
     * @return A map of registered command handlers, keyed by command name
     */
    @NotNull Map<String, CommandHandler> getRegisteredCommands();

    void sendMessage(@NotNull Player player, @NotNull String message);

    void sendError(@NotNull Player player, @NotNull String message);

    void handlePullRecentChatReq(@NotNull Player player);

    void handlePullPrivateChatReq(@NotNull Player player, int uid);

    void handlePrivateChatReq(@NotNull Player player, int uid, @NotNull String message);

    @NotNull FriendBrief getServerFriendBrief();
}
