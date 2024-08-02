package io.irminsul.common.game.avatar;

import io.irminsul.common.game.Entity;
import io.irminsul.common.game.item.Weapon;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.proto.AvatarInfoOuterClass.AvatarInfo;
import io.irminsul.common.proto.SceneAvatarInfoOuterClass.SceneAvatarInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Avatar extends Entity {
    int getAvatarId();

    long getGuid();

    int getBornTime();

    int getFlyCloak();

    int getCostume();

    @Nullable Weapon getWeapon();

    @NotNull Player getOwner();

    @NotNull AvatarInfo getAvatarInfo();

    @NotNull SceneAvatarInfo getSceneAvatarInfo();
}
