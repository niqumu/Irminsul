package io.irminsul.common.game;

import io.irminsul.common.proto.SceneEntityInfoOuterClass.SceneEntityInfo;
import org.jetbrains.annotations.NotNull;

public interface Entity {
    int getEntityId();

    @NotNull SceneEntityInfo getSceneEntityInfo();
}
