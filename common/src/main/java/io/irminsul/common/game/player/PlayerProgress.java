package io.irminsul.common.game.player;

import io.irminsul.common.game.PlayerSystem;
import io.irminsul.common.game.data.misc.OpenStateData;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

public interface PlayerProgress extends PlayerSystem {

    /**
     * @return A key-value map of client open states, controlling features on the client
     */
    @NotNull Map<OpenStateData, Boolean> getOpenStates();

    /**
     * Gets a list of unlocked scene points within a given scene
     * @param scene The ID of the scene to fetch a list of unlocked scene points for
     * @return A list of unlocked scene points with the specified scene
     */
    @NotNull List<Integer> getUnlockedScenePoints(int scene);

    /**
     * Unlock the specified scene point
     * @param scene The ID of the scene containing the unlocked scene point
     * @param point The ID of the unlocked scene point
     */
    void unlockScenePoint(int scene, int point);

    /**
     * Gets a list of unlocked scene areas within a given scene
     * @param scene The ID of the scene to fetch a list of unlocked scene areas for
     * @return A list of unlocked scene areas with the specified scene
     */
    @NotNull List<Integer> getUnlockedSceneAreas(int scene);

    /**
     * Unlock the specified scene area
     * @param scene The ID of the scene containing the unlocked scene area
     * @param area The ID of the unlocked scene area
     */
    void unlockSceneArea(int scene, int area);
}
