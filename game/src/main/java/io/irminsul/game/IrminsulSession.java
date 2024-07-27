package io.irminsul.game;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.Player;
import io.irminsul.common.game.Session;
import io.irminsul.common.game.SessionState;
import io.irminsul.common.game.net.KcpTunnel;
import io.irminsul.common.util.CryptoUtil;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.Nullable;

@Getter
@RequiredArgsConstructor
public class IrminsulSession implements Session {

    /**
     * The game server the session belongs to
     */
    private final GameServer server;

    /**
     * The {@link KcpTunnel} of the session
     */
    private KcpTunnel tunnel;

    /**
     * The current {@link SessionState} of the session
     */
    @Setter
    private SessionState state = SessionState.CLOSED;

    /**
     * The {@link Player} associated with the session, or null if none exists yet
     */
    @Setter
    private Player player = null;

    private boolean useEncryption = false;

    private int clientSequence = 10;

    @Override
    public void onConnect(KcpTunnel tunnel) {
        this.tunnel = tunnel;
        this.state = SessionState.WAITING_FOR_TOKEN;
        this.server.getLogger().info("New connection from {}", this.tunnel.getAddress().toString());
    }

    @Override
    public void onReceive(byte[] bytes) {
        this.server.handlePacket(bytes, this, this.useEncryption ? CryptoUtil.ENCRYPT_KEY : CryptoUtil.DISPATCH_KEY);
    }

    @Override
    public void onClose() {
        this.server.getLogger().info("Connection to {} closed", this.tunnel.getAddress().toString());
    }

    /**
     * @return The next client sequence to use
     */
    @Override
    public int getNextClientSequence() {
        return ++this.clientSequence;
    }

    /**
     * Enables encryption of packets
     */
    @Override
    public void enableEncryption() {
        this.useEncryption = true;
    }
}
