package io.irminsul.common.game.event;

import io.irminsul.common.event.Event;
import io.irminsul.common.game.world.World;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class WorldTickEvent implements Event {

    /**
     * The world being ticked
     */
    private final @NotNull World world;
}
