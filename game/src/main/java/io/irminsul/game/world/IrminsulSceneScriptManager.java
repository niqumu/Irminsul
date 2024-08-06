package io.irminsul.game.world;

import io.irminsul.common.game.world.Scene;
import io.irminsul.common.game.world.SceneScriptManager;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class IrminsulSceneScriptManager implements SceneScriptManager {

    /**
     * The {@link Scene} that this script manager belongs to
     */
    private final Scene scene;

    /**
     * Loads and executes the provided block
     *
     * @param id The ID of the block to load
     */
    @Override
    public void loadBlock(int id) {

    }

    /**
     * Loads and executes the provided group
     *
     * @param id The ID of the group to load
     */
    @Override
    public void loadGroup(int id) {

    }
}
