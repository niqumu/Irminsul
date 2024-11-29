package io.irminsul.common.event;

public interface CancellableEvent extends Event {

    /**
     * @return Whether this even has been cancelled
     */
    boolean isCancelled();

    /**
     * Sets whether this event is cancelled
     * @param cancelled Whether this even should be cancelled
     */
    void setCancelled(boolean cancelled);
}
