package io.irminsul.common.game.event;

import io.irminsul.common.event.CancellableEvent;
import io.irminsul.common.game.command.CommandHandler;
import io.irminsul.common.game.player.Player;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * Event fired when a player executes a server command.
 * This event is fired only if the command is about to be successfully executed. For an event fired when a command
 * is attempted, use {@link PlayerSendCommandEvent}, which is fired earlier than this event.
 */
@Data
public class PlayerExecuteCommandEvent implements CancellableEvent {

    /**
     * Whether this event has been cancelled
     */
    private boolean cancelled;

    /**
     * The player sending the command
     */
    private final @NotNull Player sender;

    /**
     * The command executed by the player
     */
    private final @NotNull CommandHandler command;

    /**
     * A list of arguments provided by the player
     */
    private final @NotNull String[] args;
}
