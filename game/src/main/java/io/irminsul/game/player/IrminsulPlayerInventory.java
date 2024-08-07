package io.irminsul.game.player;

import io.irminsul.game.GameConstants;
import io.irminsul.common.game.item.Item;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.player.PlayerInventory;
import io.irminsul.common.proto.ItemHintOuterClass;
import io.irminsul.game.item.IrminsulItem;
import io.irminsul.game.net.packet.PacketItemAddHintNotify;
import io.irminsul.game.net.packet.PacketStoreItemChangeNotify;
import lombok.Data;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

@Data
public class IrminsulPlayerInventory implements PlayerInventory {

    @Serial
    private final static long serialVersionUID = 1;

    /**
     * The {@link Player} this inventory belongs to
     */
    private final Player player;

    private final List<Item> items = new ArrayList<>();

    /**
     * Adds a set amount of an item into this inventory
     * @param id     The ID of the item to add
     * @param count  The amount of the amount to add
     * @param reason The reason for the item being added
     */
    @Override
    public void addItem(int id, int count, int reason) {
        switch (id) {
            case GameConstants.ITEM_AR_EXP -> this.player.awardExp(count);
            case GameConstants.ITEM_PRIMOGEM -> this.player.setPrimogems(this.player.getPrimogems() + count);
            case GameConstants.ITEM_MORA -> this.player.setMora(this.player.getMora() + count);
            case GameConstants.ITEM_GEN_CRYSTAL -> this.player.setCrystals(this.player.getCrystals() + count);
            case GameConstants.ITEM_HOME_COIN -> this.player.setHomeCoins(this.player.getHomeCoins() + count);
            default -> addItem(new IrminsulItem(id, count, this.player), reason);
        }

        // Notify the player
        ItemHintOuterClass.ItemHint hint = ItemHintOuterClass.ItemHint.newBuilder().setCount(count).setItemId(id).build();
        new PacketItemAddHintNotify(this.player.getSession(), hint, reason).send();
    }

    /**
     * Adds an instance of an item into this inventory
     * @param item   The item to add
     * @param reason The reason for the item being added
     */
    @Override
    public void addItem(Item item, int reason) {
        // todo: how to approach this with items having multiple counts?
        this.items.add(item);

        // Tell the client about the item
        new PacketStoreItemChangeNotify(player.getSession(), List.of(item)).send();
    }

}
