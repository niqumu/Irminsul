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
     * The x-rotation of the position
     */
    private float xRot;

    /**
     * The y-rotation of the position
     */
    private float yRot;

    /**
     * The z-rotation of the position
     */
    private float zRot;

    public Position(float x, float y, float z) {
        this(x, y, z, 0, 0, 0);
    }

    /**
     * @return A new position with the same x, y, and z values as this one
     */
    public Position copy() {
        return new Position(this.x, this.y, this.z);
    }

    /**
     * @return This position's location represented as a {@link Vector} for protocol use
     */
    public Vector positionAsVector() {
        return Vector.newBuilder().setX(this.x).setY(this.y).setZ(this.z).build();
    }

    /**
     * @return This position's rotation represented as a {@link Vector} for protocol use
     */
    public Vector rotationAsVector() {
        return Vector.newBuilder().setX(this.xRot).setY(this.yRot).setZ(this.zRot).build();
    }
}
