package io.irminsul.common.event;


public interface EventBus {

    /**
     * Register the given object as an event subscriber. Event subscribers are objects that are eligible to
     * receive posted events to methods annotated with the {@link EventHandler} annotation.
     * <p>
     * Attempting to register an object that is already registered as a subscriber will result in a warning with
     * no action taken - the object will not be registered again.
     * @param subscriber An object to register as an event subscriber
     */
    void registerSubscriber(Object subscriber);

    /**
     * Unregister the given object as an event subscriber. Event subscribers are objects that are eligible to
     * receive posted events to methods annotated with the {@link EventHandler} annotation.
     * <p>
     * Attempting to unregister an object that is not registered as a subscriber will result in a warning with no
     * action taken - the EventBus will not attempt to unregister the object.
     * @param subscriber An object to unregister as an event subscriber.
     */
    void unregisterSubscriber(Object subscriber);

    /**
     * Posts (publishes) an event to this event bus. Doing so will dispatch the event to all event subscribers
     * of the bus, and passing the event along to eligible event handlers that accept the provided event.
     *
     * @param event The event to post
     * @return True if the event has been cancelled
     */
    boolean postEvent(Event event);
}