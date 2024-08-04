package io.irminsul.common.game.player;

import io.irminsul.common.game.PlayerSystem;
import io.irminsul.common.game.item.Item;

public interface PlayerInventory extends PlayerSystem {

    /**
     * Adds a single instance of an into this inventory
     * @param item The item to add
     */
    void addItem(Item item);
}
