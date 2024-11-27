package io.irminsul.game.player;

import io.irminsul.common.game.GameServerContainer;
import io.irminsul.common.game.data.misc.OpenStateData;
import io.irminsul.common.game.data.scene.SceneData;
import io.irminsul.common.game.data.scene.TransPointType;
import io.irminsul.common.game.event.EventHandler;
import io.irminsul.game.GameConstants;
import io.irminsul.common.game.data.scene.TransPoint;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.player.PlayerProgress;
import io.irminsul.game.data.ActionReason;
import io.irminsul.game.data.DataContainer;
import io.irminsul.game.event.impl.PlayerLoginEvent;
import io.irminsul.game.net.packet.PacketOpenStateChangeNotify;
import io.irminsul.game.net.packet.PacketOpenStateUpdateNotify;
import io.irminsul.game.net.packet.PacketScenePointUnlockNotify;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class IrminsulPlayerProgress implements PlayerProgress {

    /**
     * The {@link Player} this manager belongs to
     */
    private final Player player;

    /**
     * A key-value map of client open states, controlling features on the client
     */
    private final Map<OpenStateData, Boolean> openStates = new HashMap<>();

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
        DataContainer.getAllOpenStateData().forEach(state -> this.openStates.put(state, state.isDefaultState()));

        // Subscribe to events
        GameServerContainer.getServer().getEventBus().registerSubscriber(this);
    }

    /**
     * Called when the player logs in
     * @param event The event associated with the login
     */
    @EventHandler
    public void onLogin(PlayerLoginEvent event) {
        // Send open states
        if (event.getPlayer().equals(this.player)) {
            new PacketOpenStateUpdateNotify(this.player.getSession(), this.getOpenStates()).send();
            new PacketOpenStateChangeNotify(this.player.getSession(), this.getOpenStates()).send();
        }
    }

    /**
     * @return A key-value map of client open states, controlling features on the client
     */
    public @NotNull Map<OpenStateData, Boolean> getOpenStates() {
        if (!GameServerContainer.getServer().isSandbox()) {
            return this.openStates;
        }
        Map<OpenStateData, Boolean> map = new HashMap<>(this.openStates);
        DataContainer.getAllOpenStateData().forEach(state -> map.put(state, true)); // TODO one of them throws an npe!
        return map;
    }

    /**
     * Gets a list of unlocked scene points within a given scene
     * @param scene The ID of the scene to fetch a list of unlocked scene points for
     * @return A list of unlocked scene points with the specified scene
     */
    @Override
    public @NotNull List<Integer> getUnlockedScenePoints(int scene) {

        // Sandbox mode
        if (GameServerContainer.getServer().isSandbox()) {
            ArrayList<Integer> list = new ArrayList<>();

            // Add all teleport points from the scene data
            SceneData sceneData = this.player.getWorld().getOrCreateScene(scene).getSceneData();
            sceneData.getTransPoints().forEach((id, point) -> list.add(id));

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

        // Reward the player
        TransPoint transPoint = player.getWorld().getOrCreateScene(scene).getSceneData().getTransPoints().get(point);
        boolean extraEXP = transPoint.getType().equals(TransPointType.STATUE); // statues give more ar exp
        this.player.getInventory().addItem(GameConstants.ITEM_AR_EXP, extraEXP ? 50 : 10, ActionReason.UNLOCK_POINT_REWARD);
        this.player.getInventory().addItem(GameConstants.ITEM_PRIMOGEM, 5, ActionReason.UNLOCK_POINT_REWARD);

        // Unlock the point
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

        // Sandbox mode TODO: load scene areas from bin
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
