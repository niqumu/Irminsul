package io.irminsul.game.avatar;

import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.player.Player;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class IrminsulAvatar implements Avatar {
    private final int guid;

    private final Player owner;

    private final int entityId;

    public IrminsulAvatar(int guid, @NotNull Player owner) {
        this.guid = guid;
        this.owner = owner;
        this.entityId = owner.getWorld().getNextEntityId();
    }
}
