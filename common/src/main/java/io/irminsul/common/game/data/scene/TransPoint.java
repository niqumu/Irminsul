package io.irminsul.common.game.data.scene;

import io.irminsul.common.game.world.Position;
import lombok.Data;

/**
 * Represents a trans (teleportation) point in a scene
 */
@Data
public class TransPoint {

    /**
     * The area to which this point belongs
     */
    private final int areaId;

    /**
     * The ID of the gadget corresponding to this point
     */
    private final int gadgetId;

    /**
     * The position of this point
     */
    private final Position position;

    /**
     * The position to which people teleport when teleporting to this point
     */
    private final Position transPosition;

    /**
     * The type of this point
     */
    private final TransPointType type;
}