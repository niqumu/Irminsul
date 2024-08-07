package io.irminsul.game.event.impl;

import io.irminsul.common.game.event.Event;
import io.irminsul.common.game.player.Player;
import lombok.Data;

/**
 * Event that is fired late in the login process, immediately before the player is sent to the overworld scene
 */
@Data
public class PlayerLoginEvent implements Event {

    /**
     * The player logging in
     */
    private final Player player;
}
