package io.irminsul.common.game;

import io.irminsul.common.game.player.PlayerProfile;
import io.irminsul.common.game.world.World;
import kcp.highway.Ukcp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import java.util.HashMap;
import java.util.List;

public interface GameServer {

    /**
     * @return This server's logger
     */
    @NotNull Logger getLogger();

    /**
     * @return The port this game server is running on
     */
    int getPort();

    /**
     * @return A map of {@link Session}s connected to the server
     */
    @NotNull HashMap<Ukcp, Session> getSessions();

    /**
     * @return A list of {@link World}s on the server
     */
    @NotNull List<World> getWorlds();

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
