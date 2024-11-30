package io.irminsul.common.game.event;

import io.irminsul.common.event.CancellableEvent;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.world.Position;
import io.irminsul.common.game.world.Scene;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Event that is fired when the player teleports from one place to another.
 */
@Data
@AllArgsConstructor
public class PlayerTeleportEvent implements CancellableEvent {

    /**
     * Whether this event has been cancelled
     */
    private boolean cancelled;

    /**
     * The player teleporting
     */
    private final @NotNull Player player;

    /**
     * The scene ID the player is teleporting from. This will be zero (none) if the player is first logging in
     */
    private final int fromScene;

    /**
     * The scene ID the player is teleporting to.
     */
    private int toScene;

    /**
     * The {@link Position} the player is teleporting from. This may be null, i.e. if the player is first logging in
     */
    private final @Nullable Position fromPos;

    /**
     * The {@link Position} the player is teleporting to. This should not be the same as {@code fromPos}
     */
    private @NotNull Position toPos;

    /**
     * The reason for the teleport.
     * <p>
     * Some notable values:
     * <pre>
     *     LOGIN: 1
     *     DUNGEON_ENTER: 13
     *     DUNGEON_QUIT: 14
     *     TRANS_POINT (teleport waypoint/SotS): 42</pre>
     */
    private int reason;
}
