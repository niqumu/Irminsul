package io.irminsul.game;

import io.irminsul.common.game.GameServer;
import kcp.KcpServer;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
public class IrminsulGameServer extends KcpServer implements GameServer {

    /**
     * This server's logger
     */
    private final Logger logger = LoggerFactory.getLogger("Game Server");

    /**
     * The port this server is running on
     */
    private final int port;

    public IrminsulGameServer(int port) {
        this.port = port;
    }
}
