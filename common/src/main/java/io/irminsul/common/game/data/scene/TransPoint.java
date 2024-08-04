package io.irminsul.common.game.data.scene;

import io.irminsul.common.game.world.Position;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class TransPoint {
    private final int areaId;
    private final int gadgetId;
    private final Position position;
    private final Position transPosition;
    private final TransPointType type;

    public enum TransPointType {
        NORMAL,
        STATUE,
        DUNGEON,
        UNKNOWN;

        public static @NotNull TransPointType byName(String name) {
            switch (name) {
                case "TransPointNormal" -> {
                    return NORMAL;
                }
                case "TransPointStatus" -> {
                    return STATUE;
                }
                case "DungeonEntry" -> {
                    return DUNGEON;
                }
                default -> {
                    return UNKNOWN;
                }
            }
        }
    }
}