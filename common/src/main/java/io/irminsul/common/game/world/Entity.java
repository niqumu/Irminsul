package io.irminsul.common.game.world;

import io.irminsul.common.proto.MotionStateOuterClass;
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
     * @return This entity's current {@link Position} within their scene
     */
    default @NotNull Position getPosition() {
        throw new UnsupportedOperationException("not implemented");
    }

    /**
     * @return This entity's current {@link MotionStateOuterClass.MotionState}
     */
    default @NotNull MotionStateOuterClass.MotionState getMotionState() {
        throw new UnsupportedOperationException("not implemented");
    }

    /**
     * @return Whether this object has an entity associated with it
     */
    default boolean hasEntity() {
        return this.getEntityId() != 0;
    }

    /**
     * @return This entity's {@link SceneEntityInfo}
     */
    default @NotNull SceneEntityInfo buildSceneEntityInfo() {
        return SceneEntityInfo.newBuilder().build();
    }
}
