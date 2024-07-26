package io.irminsul.dispatch;

import lombok.Getter;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

@Getter
public class DispatchServer extends WebSocketServer {

    private final Logger logger = LoggerFactory.getLogger("DispatchServer");

    public DispatchServer(int port) {
        super(new InetSocketAddress("localhost", port));
    }

    @Override
    public void onStart() {
        this.logger.info("Dispatch server started on port {}", this.getPort());
    }

    @Override
    public void onOpen(WebSocket conn, ClientHandshake clientHandshake) {
        this.logger.info("Client connected from {}", conn.getRemoteSocketAddress());
    }

    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {
        this.logger.info("Client disconnected from {}: {}", conn.getRemoteSocketAddress(), reason);
    }

    @Override
    public void onMessage(WebSocket conn, String message) {
        this.logger.info("Message from {}: {}", conn.getRemoteSocketAddress(), message);
    }

    @Override
    public void onMessage(WebSocket conn, ByteBuffer message) {
        this.logger.info("Raw message from {}: {}", conn.getRemoteSocketAddress(), message.array());
    }

    @Override
    public void onError(WebSocket conn, Exception e) {
        this.logger.error("WebSocketServer error: ", e);
    }
}
