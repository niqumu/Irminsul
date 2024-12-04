package io.irminsul.common.game.event;

import io.irminsul.common.event.Event;
import io.irminsul.common.game.player.Player;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * Event that is fired when a player disconnects. The connection to the client is assumed to already be closed by the
 * time this event is fired.
 */
@Data
public class PlayerLogoutEvent implements Event {

    /**
     * The player logging out
     */
    private final @NotNull Player player;
}
