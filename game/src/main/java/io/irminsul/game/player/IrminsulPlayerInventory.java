package io.irminsul.game.player;

import io.irminsul.common.game.item.Item;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.player.PlayerInventory;
import io.irminsul.game.net.packet.PacketStoreItemChangeNotify;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class IrminsulPlayerInventory implements PlayerInventory {

    /**
     * The {@link Player} this inventory belongs to
     */
    private final Player player;

    private final List<Item> items = new ArrayList<>();

    /**
     * Adds a single instance of an into this inventory
     *
     * @param item The item to add
     */
    @Override
    public void addItem(Item item) {

        // todo store the item. no idea how to approach this with items having multiple counts

        // Tell the client about the item
        new PacketStoreItemChangeNotify(player.getSession(), item).send();
    }
}
