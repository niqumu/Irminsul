package io.irminsul.common.game.avatar;

import io.irminsul.common.game.Entity;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.proto.AvatarInfoOuterClass.AvatarInfo;
import org.jetbrains.annotations.NotNull;

public interface Avatar extends Entity {
    int getAvatarId();

    long getGuid();

    int getBornTime();

    @NotNull Player getOwner();

    @NotNull AvatarInfo getAvatarInfo();
}
