package io.irminsul.common.game.net;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.player.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a client connection that may or may not belong to a player
 */
public interface Session extends KcpChannel {

    /**
     * @return The {@link GameServer} the session belongs to
     */
    @NotNull GameServer getServer();

    /**
     * @return The {@link KcpTunnel} of the session
     */
    @NotNull KcpTunnel getTunnel();

    /**
     * @return The current {@link SessionState} of the session
     */
    @NotNull SessionState getState();

    /**
     * Sets the state of the session
     * @param state The new {@link SessionState} of the session
     */
    void setState(@NotNull SessionState state);

    /**
     * @return The {@link Player} associated with the session, or null if none exists
     */
    @Nullable Player getPlayer();

    /**
     * @return The UID of the associated player, or 0 if none exists
     */
    int getUid();

    /**
     * Sets the {@link Player} associated with the session
     * @param player The new player of the session
     */
    void setPlayer(@Nullable Player player);

    /**
     * @return The next client sequence to use
     */
    int getNextClientSequence();

    /**
     * Enables encryption of packets
     */
    void enableEncryption();
}
