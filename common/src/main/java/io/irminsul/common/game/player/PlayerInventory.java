package io.irminsul.common.game.player;

import io.irminsul.common.game.PlayerSystem;
import io.irminsul.common.game.item.Item;

import java.io.Serializable;

public interface PlayerInventory extends PlayerSystem, Serializable {

    /**
     * Adds a set amount of an item into this inventory
     * @param id The ID of the item to add
     * @param count The amount of the amount to add
     * @param reason The reason for the item being added
     */
    void addItem(int id, int count, int reason);

    /**
     * Adds an instance of an item into this inventory
     * @param item The item to add
     * @param reason The reason for the item being added
     */
    void addItem(Item item, int reason);
}
