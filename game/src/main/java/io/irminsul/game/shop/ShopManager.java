package io.irminsul.game.shop;

import io.irminsul.common.game.GameServer;
import io.irminsul.game.Manager;
import lombok.Getter;

@Getter
public class ShopManager implements Manager {

    /**
     * The {@link GameServer} this manager belongs to
     */
    private final GameServer server;

    public ShopManager(GameServer server) {
        this.server = server;
        this.loadData();
    }

    private void loadData() {

    }
}
