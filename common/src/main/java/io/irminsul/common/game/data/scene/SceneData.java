package io.irminsul.common.game.data.scene;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Representation of an entry in the scene data excel
 */
@Data
public class SceneData {

    /**
     * A list of TransPoints (teleport points) in this scene, keyed by scene point ID
     */
    private final @NotNull Map<Integer, TransPoint> transPoints = new HashMap<>();

    /**
     * A list of dungeon (domain) entry points in this scene, keyed by scene point ID. Entries in this map are expected
     * to also be in {@link SceneData#transPoints}, as dungeon entry points are also teleport points.
     */
    private final @NotNull Map<Integer, DungeonEntryPoint> dungeonEntryPoints = new HashMap<>();

    /**
     * A list of dungeon (domain) exit points in this scene, keyed by scene point ID. Entries in this map are expected
     * to also be in {@link SceneData#transPoints}, as dungeon exit points are also teleport points.
     */
    private final @NotNull Map<Integer, DungeonExitPoint> dungeonExitPoints = new HashMap<>();
}
