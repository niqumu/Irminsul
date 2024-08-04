package io.irminsul.common.game.data;

import io.irminsul.common.game.world.Position;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

@Data
public class SceneData {

    /**
     * The spawn point of this scene, as a {@link Position}
     */
    private final @NotNull Position spawn;

    /**
     * A list of TransPoints (teleport points) in this scene, keyed by scene point ID
     */
    private final @NotNull Map<Integer, TransPoint> transPoints = new HashMap<>();

    @Data
    public static class TransPoint {
        private final int areaId;
        private final int gadgetId;
        private final Position position;
        private final Position transPosition;
    }
}
