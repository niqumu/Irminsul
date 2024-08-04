package io.irminsul.common.game;

import io.irminsul.common.proto.SceneEntityInfoOuterClass.SceneEntityInfo;
import org.jetbrains.annotations.NotNull;

/**
 * Represents an entity in a {@link io.irminsul.common.game.world.Scene}
 */
public interface Entity {

    /**
     * @return The entity id of this entity
     */
    int getEntityId();

    /**
     * Sets the entity ID of this entity
     * @param entityId The new entity ID to use
     */
    void setEntityId(int entityId);

    /**
     * @return This entity's {@link SceneEntityInfo}
     */
    @NotNull SceneEntityInfo buildSceneEntityInfo();

    /**
     * @return Whether this object has an entity associated with it
     */
    default boolean hasEntity() {
        return this.getEntityId() != 0;
    }
}
