package io.irminsul.common.game.player;

import io.irminsul.common.game.PlayerManager;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface PlayerProgress extends PlayerManager, Serializable {

    /**
     * @return A key-value map of client open states, controlling features on the client
     */
    @NotNull Map<Integer, Boolean> getOpenStates();

    /**
     * Called when the player logs in
     * TODO: event
     */
    void onLogin();

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
}
