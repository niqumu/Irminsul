package io.irminsul.common.game.event;

import io.irminsul.common.event.Event;
import io.irminsul.common.game.player.Player;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * Event that is fired late in the login process, immediately before the player is sent to the overworld scene
 */
@Data
public class PlayerLoginEvent implements Event {

    /**
     * The player logging in
     */
    private final @NotNull Player player;
}
