package io.irminsul.common.game.event;

import io.irminsul.common.event.CancellableEvent;
import io.irminsul.common.game.player.Player;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * Event fired when a player sends (attempts to execute) a server command.
 * This event is fired regardless of whether the command was successfully executed. For an event actually fired by
 * command execution, use {@link PlayerExecuteCommandEvent}, which is fired later than this event.
 */
@Data
@AllArgsConstructor
public class PlayerSendCommandEvent implements CancellableEvent {

    /**
     * Whether this event has been cancelled
     */
    private boolean cancelled;

    /**
     * The player sending the command
     */
    private final @NotNull Player sender;

    /**
     * The command provided by the player
     */
    private @NotNull String command;

    /**
     * A list of arguments provided by the player
     */
    private @NotNull String[] args;
}
