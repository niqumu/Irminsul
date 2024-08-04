package io.irminsul.common.game.item;

import io.irminsul.common.game.Entity;
import io.irminsul.common.proto.ItemHintOuterClass;
import io.irminsul.common.proto.ItemOuterClass;
import org.jetbrains.annotations.NotNull;

/**
 * Represents an instance of a generic game item
 */
public interface Item extends Entity {

    /**
     * @return The ID of the item type
     */
    int getItemId();

    /**
     * @return The GUID of this instance
     */
    long getGuid();

    /**
     * @return The quantity of this item
     */
    int getCount();

    /**
     * @return Whether this item is locked
     */
    boolean isLocked();

    /**
     * @return This item, as a protobuf Item
     */
    @NotNull ItemOuterClass.Item asItem();

    /**
     * @return A protobuf ItemHint of this item
     */
    default @NotNull ItemHintOuterClass.ItemHint asItemHint() {
        return ItemHintOuterClass.ItemHint.newBuilder()
            .setCount(this.getCount())
            .setItemId(this.getItemId())
            .setGuid(this.getGuid())
            .build();
    }
}
