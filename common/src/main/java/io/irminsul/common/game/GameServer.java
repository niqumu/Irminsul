package io.irminsul.common.game;

import io.irminsul.common.LoggerContainer;
import io.irminsul.common.config.GameServerConfig;
import io.irminsul.common.game.command.CommandManager;
import io.irminsul.common.game.dungeon.DungeonManager;
import io.irminsul.common.event.EventBus;
import io.irminsul.common.game.net.Session;
import io.irminsul.common.game.player.PlayerProfile;
import io.irminsul.common.game.world.World;
import kcp.highway.Ukcp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

public interface GameServer extends LoggerContainer {

    /**
     * @return This GameServer's {@link GameServerConfig}
     */
    @NotNull GameServerConfig getConfig();

    /**
     * @return This server's {@link EventBus}
     */
    @NotNull EventBus getEventBus();

    /**
     * @return The port this game server is running on
     */
    int getPort();

    /**
     * @return A map of {@link Session}s connected to the server
     */
    @NotNull Map<Ukcp, Session> getSessions();

    /**
     * @return A list of {@link World}s on the server
     */
    @NotNull List<World> getWorlds();

    /**
     * @return Whether this server is running in sandbox mode, as opposed to realistic mode
     */
    boolean isSandbox();

    /**
     * @return This server's {@link DungeonManager}
     */
    @NotNull DungeonManager getDungeonManager();

    /**
     * @return This server's {@link CommandManager}
     */
    @NotNull CommandManager getCommandManager();

    /**
     * Attempt to fetch the social profile data of the player with the provided UID
     * @param uid The UID of the player to fetch social data for
     * @return The provided player's social profile, or null, if the player doesn't exist
     */
    @Nullable PlayerProfile lookupPlayerProfile(int uid);

    /**
     * Handles a packet
     * @param raw The raw bytes of the packet
     * @param session The session that sent the packet
     * @param key The key used to decrypt the packet
     */
    void handlePacket(byte[] raw, Session session, byte[] key);
}
