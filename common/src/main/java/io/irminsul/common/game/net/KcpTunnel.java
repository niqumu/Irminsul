package io.irminsul.common.game.net;

import java.net.InetSocketAddress;

public interface KcpTunnel {
    InetSocketAddress getAddress();

    void writeData(byte[] bytes);

    void close();
}
