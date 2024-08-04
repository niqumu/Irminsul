package io.irminsul.game.player;

import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.player.PlayerProgress;
import io.irminsul.game.data.OpenStateData;
import io.irminsul.game.net.packet.PacketOpenStateUpdateNotify;
import io.irminsul.game.net.packet.PacketScenePointUnlockNotify;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.io.Serial;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class IrminsulPlayerProgress implements PlayerProgress {

    @Serial
    private final static long serialVersionUID = 1;

    /**
     * The {@link Player} this manager belongs to
     */
    private final Player player;

    /**
     * A key-value map of client open states, controlling features on the client
     */
    private final Map<Integer, Boolean> openStates = new HashMap<>();

    /**
     * A map of unlocked scene points, keying scene IDs to lists of unlocked points
     */
    private final Map<Integer, List<Integer>> unlockedScenePoints = new HashMap<>();

    /**
     * A map of unlocked scene areas, keying scene IDs to lists of unlocked areas
     */
    private final Map<Integer, List<Integer>> unlockedSceneAreas = new HashMap<>();

    /**
     * Creates a new player progress container with fresh/blank data
     * @param player The {@link Player} the progress belongs to
     */
    public IrminsulPlayerProgress(Player player) {
        this.player = player;

        // Load default open states
        OpenStateData.DEFAULT_OPEN_STATES.forEach(state -> this.openStates.put(state, true));
        if (this.player.getSession().getServer().isSandbox()) { // todo this part should be per login but kept separate
            OpenStateData.SANDBOX_OPEN_STATES.forEach(state -> this.openStates.put(state, true));
        }

        this.openStates.put(OpenStateData.OPEN_STATE_LIMIT_REGION_FRESHMEAT, false);
    }

    /**
     * Called when the player logs in
     * TODO: event
     */
    @Override
    public void onLogin() {

        // Send open states
        new PacketOpenStateUpdateNotify(this.player.getSession(), this.openStates).send();
    }

    /**
     * Gets a list of unlocked scene points within a given scene
     * @param scene The ID of the scene to fetch a list of unlocked scene points for
     * @return A list of unlocked scene points with the specified scene
     */
    @Override
    public @NotNull List<Integer> getUnlockedScenePoints(int scene) {

        // Sandbox mode
        if (this.player.getSession().getServer().isSandbox()) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
            return list;
        }

        // Return unlocked points if we have a list
        if (this.unlockedScenePoints.containsKey(scene)) {
            return this.unlockedScenePoints.get(scene);
        }

        // Fallback to an empty list if we have no data
        return List.of();
    }

    /**
     * Unlock the specified scene point
     * @param scene The ID of the scene containing the unlocked scene point
     * @param point The ID of the unlocked scene point
     */
    @Override
    public void unlockScenePoint(int scene, int point) {
        if (!this.unlockedScenePoints.containsKey(scene)) {
            this.unlockedScenePoints.put(scene, new ArrayList<>());
        }
        this.unlockedScenePoints.get(scene).add(point);
        new PacketScenePointUnlockNotify(this.player.getSession(), scene, List.of(point)).send();
    }

    /**
     * Gets a list of unlocked scene areas within a given scene
     *
     * @param scene The ID of the scene to fetch a list of unlocked scene areas for
     * @return A list of unlocked scene areas with the specified scene
     */
    @Override
    public @NotNull List<Integer> getUnlockedSceneAreas(int scene) {

        // Sandbox mode
        if (this.player.getSession().getServer().isSandbox()) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                list.add(i);
            }
            return list;
        }

        // Return unlocked areas if we have a list
        if (this.unlockedSceneAreas.containsKey(scene)) {
            return this.unlockedSceneAreas.get(scene);
        }

        // Fallback to an empty list if we have no data
        return List.of();
    }

    /**
     * Unlock the specified scene area
     *
     * @param scene The ID of the scene containing the unlocked scene area
     * @param area  The ID of the unlocked scene area
     */
    @Override
    public void unlockSceneArea(int scene, int area) {
        // TODO
    }
}
