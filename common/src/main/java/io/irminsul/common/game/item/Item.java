package io.irminsul.common.game.item;

import io.irminsul.common.game.database.StateContainer;
import io.irminsul.common.game.database.StateProvider;
import io.irminsul.common.game.world.Entity;
import io.irminsul.common.proto.ItemHintOuterClass;
import io.irminsul.common.proto.ItemOuterClass;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * Represents an instance of a generic game item
 */
public interface Item extends Entity, StateProvider {

    /**
     * @return The ID of the item type
     */
    int getItemId();

    /**
     * @return The quantity of this item
     */
    int getCount();

    /**
     * @return The persistent UUID of this item
     */
    @NotNull UUID getPersistentId();

    /**
     * @return The GUID of this instance
     */
    long getGuid();

    /**
     * @return Whether this item is locked
     */
    boolean isLocked();

    /**
     * Sets whether this item is locked
     * @param locked Whether this item should be locked
     */
    void setLocked(boolean locked);

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
