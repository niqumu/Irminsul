package io.irminsul.common.game.event;

import io.irminsul.common.event.Event;
import io.irminsul.common.game.player.Player;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class PlayerTickEvent implements Event {

    /**
     * The player being ticked
     */
    private final @NotNull Player player;
}
