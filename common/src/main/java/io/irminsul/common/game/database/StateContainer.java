package io.irminsul.common.game.database;

import com.google.gson.JsonObject;
import org.jetbrains.annotations.NotNull;

/**
 * Represents an abstract object that contains a state. Implementations must have functionality to export and load
 * the object's state.
 */
public interface StateContainer {

    /**
     * Load the state of this object from a json object, as exported by {@link StateContainer#exportState()}
     * @param state The state to load, as a json object
     */
    void loadState(@NotNull JsonObject state);

    /**
     * Exports the state of this object to a json object, which can be imported by
     * {@link StateContainer#loadState(JsonObject)}
     * @return The state of this object, exported as a json object
     */
    @NotNull JsonObject exportState();
}
