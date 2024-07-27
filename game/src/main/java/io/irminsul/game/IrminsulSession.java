package io.irminsul.game;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.Session;
import io.irminsul.common.game.SessionState;
import io.irminsul.common.game.net.KcpTunnel;
import io.irminsul.common.util.CryptoUtil;
import io.irminsul.game.net.MalformedPacketException;
import io.irminsul.game.net.GenericPacket;
import io.netty.buffer.Unpooled;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

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
    private SessionState state = SessionState.CLOSED;

    @Override
    public void onConnect(KcpTunnel tunnel) {
        this.tunnel = tunnel;
        this.state = SessionState.WAITING_FOR_TOKEN;
        this.server.getLogger().info("New connection from {}", this.tunnel.getAddress().toString());
    }

    @Override
    public void onReceive(byte[] bytes) {
        this.server.handlePacket(bytes, this);
    }

    @Override
    public void onClose() {
        this.server.getLogger().info("Connection to {} closed", this.tunnel.getAddress().toString());
    }
}
