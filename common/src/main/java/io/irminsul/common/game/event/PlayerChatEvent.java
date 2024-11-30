package io.irminsul.common.game.event;

import io.irminsul.common.event.CancellableEvent;
import io.irminsul.common.game.player.Player;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
public class PlayerChatEvent implements CancellableEvent {

    /**
     * Whether this event has been cancelled
     */
    private boolean cancelled;

    /**
     * The player sending the message
     */
    private final @NotNull Player sender;

    /**
     * The UID of the message recipient
     */
    private final int recipient;

    /**
     * The text of the message. This will be empty if the player sent an emote
     */
    private @NotNull String text;

    /**
     * The emote attached with the message. This will be zero if no emote was sent
     */
    private int emote;
}
