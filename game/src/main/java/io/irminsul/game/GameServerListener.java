package io.irminsul.game;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.net.KcpTunnel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import kcp.highway.KcpListener;
import kcp.highway.Ukcp;
import lombok.RequiredArgsConstructor;

import java.net.InetSocketAddress;

@RequiredArgsConstructor
public class GameServerListener implements KcpListener {

    private final GameServer server;

    @Override
    public void onConnected(Ukcp ukcp) {
        KcpTunnel connection = new KcpTunnel() {
            @Override
            public InetSocketAddress getAddress() {
                return ukcp.user().getRemoteAddress();
            }

            @Override
            public void writeData(byte[] bytes) {
                ByteBuf buf = Unpooled.wrappedBuffer(bytes);
                ukcp.write(buf);
                buf.release();
            }

            @Override
            public void close() {
                ukcp.close();
            }
        };

        IrminsulSession session = new IrminsulSession(this.server);
        session.onConnect(connection);
        this.server.getSessions().put(ukcp, session);
    }

    @Override
    public void handleReceive(ByteBuf byteBuf, Ukcp ukcp) {
        if (this.server.getSessions().containsKey(ukcp)) {
            byte[] bytes = new byte[byteBuf.readableBytes()];
            byteBuf.readBytes(bytes);
            this.server.getSessions().get(ukcp).onReceive(bytes);
        }
    }

    @Override
    public void handleException(Throwable throwable, Ukcp ukcp) {
        this.server.getLogger().error("Server listener raised an exception!", throwable);
    }

    @Override
    public void handleClose(Ukcp ukcp) {
        if (this.server.getSessions().containsKey(ukcp)) {
            this.server.getSessions().get(ukcp).onClose();
            this.server.getSessions().remove(ukcp);
        }
    }
}
