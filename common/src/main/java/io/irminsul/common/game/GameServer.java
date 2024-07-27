package io.irminsul.common.game;

import org.slf4j.Logger;

public interface GameServer {

    /**
     * @return This server's logger
     */
    Logger getLogger();

    /**
     * @return The port this web server is running on
     */
    int getPort();
}
