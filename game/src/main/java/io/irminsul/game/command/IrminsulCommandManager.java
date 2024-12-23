package io.irminsul.game.command;

import io.irminsul.common.config.game.ServerAccountConfig;
import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.command.CommandManager;
import io.irminsul.common.game.event.PlayerExecuteCommandEvent;
import io.irminsul.common.game.event.PlayerSendCommandEvent;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.proto.*;
import io.irminsul.common.proto.ChatInfoOuterClass.ChatInfo;
import io.irminsul.common.util.i18n.I18n;
import io.irminsul.game.GameConstants;
import io.irminsul.game.command.impl.*;
import io.irminsul.game.net.packet.PacketPrivateChatNotify;
import io.irminsul.game.net.packet.PacketPrivateChatRsp;
import io.irminsul.game.net.packet.PacketPullPrivateChatRsp;
import io.irminsul.game.net.packet.PacketPullRecentChatRsp;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

@Getter
public class IrminsulCommandManager implements CommandManager {

    private final static int SERVER_UID = 1;

    /**
     * The {@link ServerAccountConfig} configuring this command manager
     */
    private final ServerAccountConfig config;

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
        this.config = server.getConfig().getServerAccountConfig();

        this.server.getEventBus().registerSubscriber(this);

        this.registerIrminsulCommand(new AvatarCommand()); // todo: broken!
        this.registerIrminsulCommand(new HelpCommand());
        this.registerIrminsulCommand(new ItemCommand()); // todo: broken!
        this.registerIrminsulCommand(new PluginsCommand());
        this.registerIrminsulCommand(new ReloadCommand());
        this.registerIrminsulCommand(new SceneCommand());
        this.registerIrminsulCommand(new KickCommand());
        this.registerIrminsulCommand(new PlayersCommand());
    }

    private void registerIrminsulCommand(@NotNull CommandHandler command) {
        this.registerCommand(command, "irminsul");
    }

    /**
     * Registers a command with the command manager
     * @param command The command handler to register
     * @param registrar The plugin or module registering this command
     */
    @Override
    public void registerCommand(@NotNull CommandHandler command, @NotNull String registrar) {

        // Make sure that the command handler contains a @CommandInfo annotation
        if (command.getCommandInfo() == null) {
            this.getLogger().error(I18n.translate("game.error.command_info_missing"), command.getClass().getName(), registrar);
            return;
        }

        // Set command data
        command.setCommandManager(this);
        command.setRegistrar(registrar);

        // Insert command into the commands map
        this.registeredCommands.put(command.getFullName(), command);

        // Insert command aliases into the commands map
        for (String alias : command.getCommandInfo().aliases()) {
            this.registeredCommands.put("%s:%s".formatted(command.getRegistrar(), alias), command);
        }
    }

    /**
     * Sends the player a message from the server
     * @param player The player to send the message to
     * @param message The message to send
     */
    @Override
    public void sendMessage(@NotNull Player player, @NotNull String message) {
        ChatInfo messageInfo = ChatInfo.newBuilder()
            .setUid(SERVER_UID)
            .setToUid(player.getUid())
            .setText(message)
            .setTime((int) (System.currentTimeMillis() / 1000))
            .build();

        this.serverChatHistory.get(player).add(messageInfo);
        new PacketPrivateChatNotify(player.getSession(), messageInfo).send();
    }

    /**
     * Sends the player a red error message from the server
     * @param player The player to send the message to
     * @param message The message to send
     */
    @Override
    public void sendError(@NotNull Player player, @NotNull String message) {
        this.sendMessage(player, "<color=\"#f97575\">" + message + "</color>");
    }

    /**
     * Attempts to resolve the namespace of a command
     * @param command The namespace-less command to attempt to resolve
     * @return The full name of the command, including the namespace, or {@code null} if multiple matches exist.
     * @throws NoSuchElementException If no matches exist
     */
    @Override
    public @Nullable String resolveNamespace(@NotNull String command) throws NoSuchElementException {
        String fullCommand = null;

        // Look over registered commands, looking for a match
        for (String commandName : this.registeredCommands.keySet()) {
            if (commandName.split(":")[1].equalsIgnoreCase(command)) {

                // We already found a match, so we have a duplicate!
                if (fullCommand != null) {
                    return null;
                }

                // We found a match, but keep looking to find duplicates.
                fullCommand = commandName;
            }
        }

        if (fullCommand == null) {
            throw new NoSuchElementException(); // the command doesn't exist
        }

        return fullCommand;
    }

    @Override
    public void handlePullRecentChatReq(@NotNull Player player) {
        List<ChatInfo> history = this.serverChatHistory.computeIfAbsent(player, a -> new ArrayList<>());

        if (history.isEmpty()) {
            this.sendWelcomeMessages(player);
        }

        new PacketPullRecentChatRsp(player.getSession(), this.serverChatHistory.get(player)).send();
    }

    @Override
    public void handlePullPrivateChatReq(@NotNull Player player, int uid) {
        if (uid == SERVER_UID) {
            List<ChatInfo> history = this.serverChatHistory.computeIfAbsent(player, a -> new ArrayList<>());

            if (history.isEmpty()) {
                this.sendWelcomeMessages(player);
            }

            new PacketPullPrivateChatRsp(player.getSession(), history).send();
        }
    }

    @Override
    public void handlePrivateChatReq(@NotNull Player player, int uid, @NotNull String message, int icon) {

        // If the private chat was sent to the server account, it's a command and we must handle it
        if (uid == SERVER_UID) {
            String messageToLog = icon != 0 ? "(emote " + icon + ")" : message;
            this.server.getLogger().info(I18n.translate("game.info.command_executed"), player, messageToLog);

            ChatInfo.Builder messageInfo = ChatInfo.newBuilder()
                .setUid(player.getUid())
                .setToUid(SERVER_UID)
                .setText(icon != 0 ? "" : message)
                .setTime((int) (System.currentTimeMillis() / 1000));

            if (icon != 0) {
                messageInfo.setIcon(icon);
            }

            this.serverChatHistory.get(player).add(messageInfo.build());

            // We have to do this before handling the command so the order is right on the client
            // I also think it's stupid to need both of these. But here we are.
            new PacketPrivateChatRsp(player.getSession()).send();
            new PacketPrivateChatNotify(player.getSession(), messageInfo.build()).send(); // needed for the player to see their message

            String[] args = message.split(" ");
            String command = args[0].toLowerCase();

            // Create and fire send command event
            PlayerSendCommandEvent sendEvent = new PlayerSendCommandEvent(false, player, command,
                Arrays.copyOfRange(args, 1, args.length));
            this.server.getEventBus().postEvent(sendEvent);

            // Return if the send command event was cancelled
            if (sendEvent.isCancelled()) {
                return;
            }

            // Verify that commands are enabled
            if (!this.config.isCommandsEnabled()) {
                this.sendError(player, "<i>" + I18n.translate("game.command.disabled") + "</i>");
                return;
            }

            // If the command doesn't have a namespace, resolve it and prepend it
            if (!command.contains(":")) {
                String resolvedCommand;
                try {
                    resolvedCommand = this.resolveNamespace(command);
                } catch (NoSuchElementException e) {

                    // No such command exists (no matches found)
                    this.sendError(player, I18n.translate("game.command.unknown").replace("{}", command));
                    return;
                }

                if (resolvedCommand == null) {
                    // Multiple matches exist
                    this.sendError(player, I18n.translate("game.command.ambiguous").replace("{}", command));
                    return;
                }

                command = resolvedCommand;
            }

            // If we found the command in the command registry
            if (registeredCommands.containsKey(command)) {

                // Create and fire execute command event
                PlayerExecuteCommandEvent executeEvent = new PlayerExecuteCommandEvent(player,
                    this.registeredCommands.get(command), Arrays.copyOfRange(args, 1, args.length));
                this.server.getEventBus().postEvent(executeEvent);

                // Actually invoke the command handler if the even wasn't cancelled
                if (!executeEvent.isCancelled()) {
                    this.registeredCommands.get(command).handle(player, message, Arrays.copyOfRange(args, 1, args.length));
                }
            } else {
                this.sendError(player, I18n.translate("game.command.unknown")
                    .replace("{}", command));
            }
        }
    }

    @Override
    public @NotNull FriendBriefOuterClass.FriendBrief getServerFriendBrief() {
        return FriendBriefOuterClass.FriendBrief.newBuilder()
            .setUid(SERVER_UID)
            .setNickname(this.config.getNickname())
            .setProfilePicture(ProfilePictureOuterClass.ProfilePicture.newBuilder().setAvatarId(GameConstants.FEMALE_TRAVELER_AVATAR_ID).build())
            .setNameCardId(210020)
            .setFriendEnterHomeOption(FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_REFUSE)
            .setWorldLevel(0)
            .setLevel(1)
            .setLastActiveTime((int) (System.currentTimeMillis() / 1000))
            .setOnlineState(FriendOnlineStateOuterClass.FriendOnlineState.FRIEND_ONLINE_STATE_ONLINE)
            .setSignature("<color=\"#00a8b7\">" + this.config.getSignature() + "</color>")
            .setPlatformType(PlatformTypeOuterClass.PlatformType.PLATFORM_TYPE_CLOUD_PC)
            .setIsGameSource(true)
            .setParam(1)
            .build();
    }

    private void sendWelcomeMessages(@NotNull Player player) {
        this.serverChatHistory.computeIfAbsent(player, a -> new ArrayList<>());

        // Message
        if (this.config.getWelcomeMessage() != null && !this.config.getWelcomeMessage().isBlank()) {
            this.sendMessage(player, this.config.getWelcomeMessage());
        }

        // Emote
        if (this.config.getWelcomeEmote() > 0) {
            ChatInfo messageInfo = ChatInfo.newBuilder()
                .setUid(SERVER_UID)
                .setToUid(player.getUid())
                .setIcon(this.config.getWelcomeEmote())
                .setTime((int) (System.currentTimeMillis() / 1000))
                .build();

            this.serverChatHistory.get(player).add(messageInfo);
            new PacketPrivateChatNotify(player.getSession(), messageInfo).send();
        }
    }
}
