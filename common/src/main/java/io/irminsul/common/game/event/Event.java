package io.irminsul.common.game.event;

public interface Event {

    /**
     * @return Whether this event may be cancelled
     */
    default boolean isCancellable() {
        return this instanceof CancellableEvent;
    }

    default boolean isCancelled() {
        return false;
    }
}
