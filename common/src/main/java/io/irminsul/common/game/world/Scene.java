package io.irminsul.common.game.world;

import io.irminsul.common.game.Entity;
import io.irminsul.common.game.player.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface Scene {

    /**
     * @return The {@link World} that this scene belongs to
     */
    @NotNull World getWorld();

    /**
     * @return This scene's ID
     */
    int getId();

    /**
     * @return The next free entity ID
     */
    int getNextEntityId();

    @NotNull List<Player> getPlayers();

    void addPlayer(@NotNull Player player);

    void addEntity(@NotNull Entity entity);
}
