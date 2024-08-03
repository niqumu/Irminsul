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
     * @return This entity's {@link SceneEntityInfo}
     */
    @NotNull SceneEntityInfo getSceneEntityInfo();
}
