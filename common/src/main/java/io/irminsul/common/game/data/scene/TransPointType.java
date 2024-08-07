package io.irminsul.common.game.data.scene;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a type of point that can be teleported to
 */
@Getter
@RequiredArgsConstructor
public enum TransPointType {

    /**
     * Teleport waypoint
     */
    NORMAL("TransPointNormal"),

    /**
     * Statue of the Seven
     */
    STATUE("TransPointStatue"),

    /**
     * Domain entrance
     */
    DUNGEON_ENTRY("DungeonEntry"),

    /**
     * Domain exit (facing away from domain)
     */
    DUNGEON_EXIT("DungeonExit");

    /**
     * The internal name of the trans point type, as used in scene point JSONs
     */
    private final String name;

    /**
     * Gets the trans point type corresponding to the internal name of the type
     * @param name The internal name of the trans point type, as used in scene point JSONs
     * @return The trans point type corresponding to the given name, or NORMAL as a fallback if none exists
     */
    public static @NotNull TransPointType of(@NotNull String name) {
        for (TransPointType type : TransPointType.values()) {
            if (type.name.equals(name)) {
                return type;
            }
        }
        return NORMAL; // fallback
    }
}