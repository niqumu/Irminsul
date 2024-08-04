package io.irminsul.game.item;

import io.irminsul.common.game.item.Item;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.property.EntityIdType;
import io.irminsul.common.proto.ItemOuterClass;
import io.irminsul.common.proto.MaterialOuterClass;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class IrminsulItem implements Item {

    /**
     * The ID of the item type
     */
    private final int itemId;

    /**
     * The GUID of this instance
     */
    private final long guid;

    /**
     * The quantity of this item
     */
    private final int count;

    /**
     * The entity id of this entity
     */
    private final int entityId;

    /**
     * Whether this item is locked
     */
    private boolean locked;

    public IrminsulItem(int itemId, @NotNull Player owner) {
        this(itemId, 1, owner);
    }

    public IrminsulItem(int itemId, int count, @NotNull Player owner) {
        this.itemId = itemId;
        this.guid = owner.getNextGuid();
        this.count = count;
        this.entityId = owner.getWorld().getNextEntityId(EntityIdType.WEAPON);
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
