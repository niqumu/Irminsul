package io.irminsul.common.game.world;

import org.jetbrains.annotations.NotNull;

public interface SceneScriptManager {

    /**
     * @return The {@link Scene} that this script manager belongs to
     */
    @NotNull Scene getScene();

    /**
     * @return The spawn point of the scene, as derived from the scene's main script
     */
    @NotNull Position getSceneSpawn();
}
