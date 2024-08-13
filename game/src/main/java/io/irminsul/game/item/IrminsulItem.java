package io.irminsul.game.item;

import io.irminsul.common.game.database.StateContainer;
import io.irminsul.common.game.item.Item;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.property.EntityIdType;
import io.irminsul.common.proto.ItemOuterClass;
import io.irminsul.common.proto.MaterialOuterClass;
import io.irminsul.game.database.state.ItemState;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@Data
public class IrminsulItem implements Item {

    /**
     * The ID of the item type
     */
    private int itemId;

    /**
     * The persistent UUID of this item
     */
    private final UUID persistentId;

    /**
     * The quantity of this item
     */
    private int count;

    /**
     * The GUID of this instance
     */
    private long guid;

    /**
     * The entity id of this entity
     */
    private int entityId;

    /**
     * Whether this item is locked
     */
    private boolean locked;

    /**
     * Loads an existing item from an exported {@link ItemState}
     * @param state The state to load
     */
    public IrminsulItem(@NotNull ItemState state) {
        this.itemId = state.getItemId();
        this.persistentId = state.getPersistentId();
        this.count = state.getCount();

        // todo assign guid and entity id
    }

    /**
     * Create a new item with the given parameters
     * @param itemId The ID of the item
     * @param owner The owner of this item
     */
    public IrminsulItem(int itemId, @NotNull Player owner) {
        this(itemId, 1, owner);
    }

    /**
     * Create a new item with the given parameters
     * @param itemId The ID of the item
     * @param count The count of the item
     * @param owner The owner of this item
     */
    public IrminsulItem(int itemId, int count, @NotNull Player owner) {
        this.itemId = itemId;
        this.count = count;

        this.persistentId = UUID.randomUUID(); // todo: insanely unlikely to happen, but should check for dupe uuid

        // todo: this should only be done when needed!
        this.guid = owner.getNextGuid();
    }

    /**
     * Exports the state of this object to an appropriate {@link StateContainer} that can be used in a constructor
     * to recreate this object
     * @return The state of this object, exported as a {@link StateContainer} implementation
     */
    @Override
    public StateContainer exportState() {
        return new ItemState(this.itemId, this.persistentId, this.count, this.locked);
    }

    /**
     * @return This item, as a protobuf Item
     */
    @Override
    public @NotNull ItemOuterClass.Item asItem() {
        MaterialOuterClass.Material material = MaterialOuterClass.Material.newBuilder().setCount(this.count).build();
        return ItemOuterClass.Item.newBuilder().setMaterial(material).setGuid(this.guid).setItemId(this.itemId).build();
    }
}
