package io.irminsul.game.event;

import io.irminsul.common.event.Event;
import io.irminsul.common.event.EventBus;
import io.irminsul.common.event.EventHandler;
import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.ServerSystem;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

/**
 * Simple, fast implementation of an {@link EventBus}.
 */
@RequiredArgsConstructor
public final class SimpleEventBus implements EventBus, ServerSystem {

    /**
     * The {@link GameServer} this system belongs to
     */
    @Getter
    private final GameServer server;

    /**
     * A list of objects that are subscribed to receive posted events to eligible methods
     */
    private final ArrayList<Object> subscribers = new ArrayList<>();

    /**
     * Register the given object as an event subscriber. Event subscribers are objects that are eligible to
     * receive posted events to methods annotated with the {@link EventHandler} annotation.
     * <p>
     * Attempting to register an object that is already registered as a subscriber will result in a warning with
     * no action taken - the object will not be registered again.
     * @param subscriber An object to register as an event subscriber
     */
    public synchronized void registerSubscriber(Object subscriber) {

        // Ensure that the new subscriber isn't already registered as a subscriber. If it is, log a warning
        //   and ignore the request to register it.
        if (this.subscribers.contains(subscriber)) {
            this.getLogger().warn("Tried to register duplicate subscriber class: {}", subscriber.getClass().getName());
            return;
        }

        // Add the new subscriber to the list of subscribers
        this.subscribers.add(subscriber);
    }

    /**
     * Unregister the given object as an event subscriber. Event subscribers are objects that are eligible to
     * receive posted events to methods annotated with the {@link EventHandler} annotation.
     * <p>
     * Attempting to unregister an object that is not registered as a subscriber will result in a warning with no
     * action taken - the EventBus will not attempt to unregister the object.
     * @param subscriber An object to unregister as an event subscriber.
     */
    public synchronized void unregisterSubscriber(Object subscriber) {

        // Ensure that the subscriber to remove is indeed registered as a subscriber. If it is not, log a
        //   warning and ignore the request to unregister it.
        if (!this.subscribers.contains(subscriber)) {
            this.getLogger().warn("Tried to unregister non-existent subscriber class: {}", subscriber.getClass().getName());
            return;
        }

        // Remove the subscriber from the list of subscribers
        this.subscribers.remove(subscriber);
    }

    /**
     * Posts (publishes) an event to this event bus. Doing so will dispatch the event to all event subscribers
     * of the bus, and passing the event along to eligible event handlers that accept the provided event.
     *
     * @param event The event to post
     * @return True if the event has been cancelled
     */
    public synchronized boolean postEvent(Event event) {
        this.subscribers.forEach(sub -> this.fireEventForSubscriber(event, sub, sub.getClass()));
        return event.isCancelled();
    }

    /**
     * Posts an event to a given subscriber
     *
     * @param event The event to post
     * @param subscriber The instance (object) of the subscriber class
     * @param subscriberClass The class of the subscriber
     */
    private void fireEventForSubscriber(Event event, Object subscriber, Class<?> subscriberClass) {

        // Iterate over all methods in the subscriber class
        for (Method method : subscriberClass.getMethods()) {

            // Ignore methods that are not annotated with the EventHandler annotation
            if (!method.isAnnotationPresent(EventHandler.class)) {
                continue;
            }

            // Ignore methods that take no parameters, as well as methods that take multiple, as any true
            //   event handler must take in the event, and we don't know what else the method expects.
            if (method.getParameterCount() != 1) {
                continue;
            }

            Parameter firstParameter = method.getParameters()[0];

            // If the sole parameter matches the class of the provided, invoke the method
            if (firstParameter.getType().equals(event.getClass())) {
                try {
                    method.invoke(subscriber, event);
                } catch (Exception e) {
                    this.getLogger().error("Failed to pass event to {}#{}", subscriberClass.getName(), method.getName(), e);
                }

                return;
            }
        }
    }
}