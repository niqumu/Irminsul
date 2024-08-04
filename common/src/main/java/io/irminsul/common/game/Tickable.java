package io.irminsul.common.game;

public interface Tickable {

    /**
     * Called at a regular interval by the server; update this object in some way
     */
    void tick();
}
