package io.irminsul.game.event.impl;

import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.event.CancellableEvent;
import io.irminsul.common.game.player.Player;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * Event fired when a player switches their current on-field avatar
 */
@Data
public class PlayerSwitchAvatarEvent implements CancellableEvent {

    /**
     * The player switching avatars
     */
    private final @NotNull Player player;

    /**
     * The avatar the player is switching from
     */
    private final @NotNull Avatar from;

    /**
     * The avatar the player is switching to
     */
    private final @NotNull Avatar to;

    /**
     * Whether this even has been cancelled
     */
    private boolean cancelled;
}
