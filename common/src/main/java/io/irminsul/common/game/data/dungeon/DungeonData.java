package io.irminsul.common.game.data.dungeon;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Representation of an entry within the dungeon data excel
 */
@Data
@AllArgsConstructor
public class DungeonData {

    /**
     * The ID of the scene in which this dungeon (domain) takes place
     */
    private final int sceneId;

    /**
     * Construct a new fallback DungeonData with default/placeholder values
     */
    public DungeonData() {
        this(0);
    }
}
