package io.irminsul.common.game.world;

import io.irminsul.common.proto.VectorOuterClass.Vector;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Position {
    public static Position ORIGIN() {
        return new Position(0, 0, 0);
    }

    /**
     * The x-coordinate of the position
     */
    private float x;

    /**
     * The y-coordinate of the position
     */
    private float y;

    /**
     * The z-coordinate of the position
     */
    private float z;

    /**
     * @return A new position with the same x, y, and z values as this one
     */
    public Position copy() {
        return new Position(this.x, this.y, this.z);
    }

    /**
     * @return This position, represented as a {@link Vector} for protocol use
     */
    public Vector asVector() {
        return Vector.newBuilder().setX(this.x).setY(this.y).setZ(this.z).build();
    }
}
