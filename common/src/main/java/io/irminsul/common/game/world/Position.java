package io.irminsul.common.game.world;

import com.google.gson.JsonObject;
import io.irminsul.common.game.database.StateContainer;
import io.irminsul.common.proto.VectorOuterClass.Vector;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
public class Position implements StateContainer {
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
     * @return A new position with the same position and rotation values as this one
     */
    public Position copy() {
        return new Position(this.x, this.y, this.z, this.xRot, this.yRot, this.zRot);
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

    /**
     * Load the state of this object from a json object, as exported by {@link StateContainer#exportState()}
     *
     * @param state The state to load, as a json object
     */
    @Override
    public void loadState(@NotNull JsonObject state) {
        this.setX(state.get("x").getAsFloat());
        this.setY(state.get("y").getAsFloat());
        this.setZ(state.get("z").getAsFloat());
        this.setXRot(state.get("x_rot").getAsFloat());
        this.setYRot(state.get("y_rot").getAsFloat());
        this.setZRot(state.get("z_rot").getAsFloat());
    }

    /**
     * Exports the state of this object to a json object, which can be imported by
     * {@link StateContainer#loadState(JsonObject)}
     *
     * @return The state of this object, exported as a json object
     */
    @Override
    public @NotNull JsonObject exportState() {
        JsonObject state = new JsonObject();
        state.addProperty("x", this.x);
        state.addProperty("y", this.y);
        state.addProperty("z", this.z);
        state.addProperty("x_rot", this.xRot);
        state.addProperty("y_rot", this.yRot);
        state.addProperty("z_rot", this.zRot);
        return state;
    }
}
