package io.irminsul.common.game.avatar;

import io.irminsul.common.game.player.Player;
import org.jetbrains.annotations.NotNull;

public interface Avatar {
    int getGuid();

    @NotNull Player getOwner();

    int getEntityId();
}
