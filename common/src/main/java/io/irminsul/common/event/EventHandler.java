package io.irminsul.common.event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to annotate methods that are eligible to receive posted events.
 * <p>
 * In order to receive events, methods annotated via {@code @EventHandler} are expected to be accessible (public) and
 * contain a sole parameter: the event they wish to handle. Additional conditions may be imposed by individual
 * implementations of the {@link EventBus} interface.
 * <pre>
 *         {@code
 *              public class ClientJoinSubscriber {
 *
 *                      public ClientJoinSubscriber() {
 *                              eventBus.registerSubscriber(this);
 *                      }
 *
 *                      @EventHandler
 *                      public void handleClientJoinEvent(ClientJoinEvent event) {
 *                              // ...
 *                      }
 *              }
 *         }
 * </pre>
 *
 * Appropriate methods annotated via {@code @EventHandler} will be invoked once a matching event is posted, provided
 * that the object they belong to has been registered as an event subscriber via
 * {@link EventBus#registerSubscriber(Object)}
 * <p>
 * An event subscriber is expected to only contain at most one method marked as an {@code @EventHandler} for a given
 * event. The behavior that occurs when this is not the case is undefined and left to individual EventBus
 * implementations.
 *
 * @see Event
 * @see EventBus
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EventHandler {
}