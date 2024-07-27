package io.irminsul.common.game.world;

import io.irminsul.common.proto.VectorOuterClass;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Position {
    public static final Position ORIGIN = new Position(0,0, 0);

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

    public Position copy() {
        return new Position(this.x, this.y, this.z);
    }

    public VectorOuterClass.Vector asVector() {
        return VectorOuterClass.Vector.newBuilder().setX(this.x).setY(this.y).setZ(this.z).build();
    }
}
