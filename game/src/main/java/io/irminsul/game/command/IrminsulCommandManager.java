package io.irminsul.game.command;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandManager;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.proto.*;
import io.irminsul.common.proto.ChatInfoOuterClass.ChatInfo;
import io.irminsul.game.net.packet.PacketPrivateChatNotify;
import io.irminsul.game.net.packet.PacketPrivateChatRsp;
import io.irminsul.game.net.packet.PacketPullPrivateChatRsp;
import io.irminsul.game.net.packet.PacketPullRecentChatRsp;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.*;

@Getter
public class IrminsulCommandManager implements CommandManager {

    private final static int SERVER_UID = 0;

    /**
     * The {@link GameServer} this command manager belongs to
     */
    private final GameServer server;

    /**
     * A map of players' chat histories with the server console
     */
    private final Map<Player, List<ChatInfo>> serverChatHistory = new HashMap<>();

    /**
     * A map of registered command handlers, keyed by command name
     */
    private final Map<String, CommandHandler> registeredCommands = new HashMap<>();

    public IrminsulCommandManager(GameServer server) {
        this.server = server;
    }

    @Override
    public void sendMessage(@NotNull Player player, @NotNull String message) {
        ChatInfo messageInfo = ChatInfo.newBuilder()
            .setUid(SERVER_UID)
            .setToUid(player.getUid())
            .setText(message)
            .build();

        this.serverChatHistory.get(player).add(messageInfo);
        new PacketPrivateChatNotify(player.getSession(), messageInfo).send();
    }

    @Override
    public void sendError(@NotNull Player player, @NotNull String message) {
        this.sendMessage(player, "<color=\"#f97575\">" + message + "</color>");
    }

    @Override
    public void handlePullRecentChatReq(@NotNull Player player) {
        List<ChatInfo> history = this.serverChatHistory.computeIfAbsent(player, a -> new ArrayList<>());

        if (history.isEmpty()) {
            this.sendMessage(player, "Welcome to Irminsul! Message me to execute commands");
        }

        new PacketPullRecentChatRsp(player.getSession(), this.serverChatHistory.get(player)).send();
    }

    @Override
    public void handlePullPrivateChatReq(@NotNull Player player, int uid) {
        if (uid == SERVER_UID) {
            new PacketPullPrivateChatRsp(player.getSession(), this.serverChatHistory.get(player)).send();
        }
    }

    @Override
    public void handlePrivateChatReq(@NotNull Player player, int uid, @NotNull String message) {
        if (uid == SERVER_UID) {
            this.server.getLogger().info("{} executed server command: {}", player, message);

            ChatInfo messageInfo = ChatInfo.newBuilder()
                .setUid(player.getUid())
                .setToUid(SERVER_UID)
                .setText(message)
                .build();

            // Execute command
            String[] args = message.split(" ");
            String command = args[0].toLowerCase();

            if (registeredCommands.containsKey(command)) {
                this.registeredCommands.get(command).handle(message, Arrays.copyOfRange(args, 1, args.length));
            } else {
                this.sendError(player, "Unknown command \"" + command + "\"! Try \"help\" for help.");
            }

            this.serverChatHistory.get(player).add(messageInfo);
            new PacketPrivateChatRsp(player.getSession()).send();
        }
    }

    @Override
    public @NotNull FriendBriefOuterClass.FriendBrief getServerFriendBrief() {
        return FriendBriefOuterClass.FriendBrief.newBuilder()
            .setUid(SERVER_UID)
            .setNickname("Server")
            .setProfilePicture(ProfilePictureOuterClass.ProfilePicture.newBuilder().setAvatarId(0).build())
            .setNameCardId(210001)
            .setFriendEnterHomeOption(FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_REFUSE)
            .setWorldLevel(0)
            .setLevel(1)
            .setLastActiveTime((int) (System.currentTimeMillis() / 1000))
            .setOnlineState(FriendOnlineStateOuterClass.FriendOnlineState.FRIEND_ONLINE_STATE_ONLINE)
            .setSignature("Irminsul server console")
            .setPlatformType(PlatformTypeOuterClass.PlatformType.PLATFORM_TYPE_CLOUD_PC)
            .setIsGameSource(true)
            .setParam(1)
            .build();
    }
}
