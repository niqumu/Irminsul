package io.irminsul.game.database.state;

import com.google.gson.JsonObject;
import io.irminsul.common.game.database.StateContainer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class ItemState implements StateContainer {

    private int itemId;

    private UUID persistentId;

    private int count;

    private boolean locked;

    public ItemState(@NotNull JsonObject state) {
        this.loadState(state);
    }

    /**
     * Load the state of this object from a json object, as exported by {@link StateContainer#exportState()}
     * @param state The state to load, as a json object
     */
    @Override
    public void loadState(@NotNull JsonObject state) {
        this.itemId = state.get("id").getAsInt();
        this.persistentId = UUID.fromString(state.get("uuid").getAsString());
        this.count = state.get("count").getAsInt();
        this.locked = state.get("locked").getAsBoolean();
    }

    /**
     * Exports the state of this object to a json object, which can be imported by
     * {@link StateContainer#loadState(JsonObject)}
     * @return The state of this object, exported as a json object
     */
    @Override
    public @NotNull JsonObject exportState() {
        JsonObject object = new JsonObject();
        object.addProperty("id", this.itemId);
        object.addProperty("uuid", this.persistentId.toString());
        object.addProperty("count", this.count);
        object.addProperty("locked", this.locked);
        return object;
    }
}
