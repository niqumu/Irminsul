package io.irminsul.common.game.database;

public interface StateProvider {

    /**
     * Exports the state of this object to an appropriate {@link StateContainer} that can be used in a constructor
     * to recreate this object
     * @return The state of this object, exported as a {@link StateContainer} implementation
     */
    StateContainer exportState();
}
