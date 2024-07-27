package io.irminsul.common.game.net;

public interface KcpChannel {
    void onConnect(KcpTunnel tunnel);

    void onReceive(byte[] bytes);

    void onClose();
}
