package io.irminsul.common.game.world;

import org.jetbrains.annotations.NotNull;

public interface SceneScriptManager {

    /**
     * @return The {@link Scene} that this script manager belongs to
     */
    @NotNull Scene getScene();

    /**
     * Loads and executes the provided block
     * @param id The ID of the block to load
     */
    void loadBlock(int id);

    /**
     * Loads and executes the provided group
     * @param id The ID of the group to load
     */
    void loadGroup(int id);
}
