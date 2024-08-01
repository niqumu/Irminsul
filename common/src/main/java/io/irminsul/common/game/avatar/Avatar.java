package io.irminsul.common.game.avatar;

import io.irminsul.common.game.player.Player;
import io.irminsul.common.proto.AvatarInfoOuterClass.AvatarInfo;
import org.jetbrains.annotations.NotNull;

public interface Avatar {
    int getAvatarId();

    long getGuid();

    @NotNull Player getOwner();

    int getEntityId();

    @NotNull AvatarInfo getAvatarInfo();
}
