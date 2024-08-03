package io.irminsul.common.game.avatar;

import io.irminsul.common.game.Entity;
import io.irminsul.common.game.item.Weapon;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.proto.AvatarInfoOuterClass.AvatarInfo;
import io.irminsul.common.proto.SceneAvatarInfoOuterClass.SceneAvatarInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents an instance of an avatar (character)
 */
public interface Avatar extends Entity {

    /**
     * @return The ID of the avatar type
     */
    int getAvatarId();

    /**
     * @return The GUID of this instance
     */
    long getGuid();

    /**
     * @return The time this avatar was created/obtained at
     */
    int getBornTime();

    /**
     * @return The glider worn by this instance
     */
    int getFlyCloak();

    /**
     * @return The costume worn by this instance
     */
    int getCostume();

    /**
     * @return The weapon held by this instance
     */
    @Nullable Weapon getWeapon();

    /**
     * @return The {@link Player} who owns this instance
     */
    @NotNull Player getOwner();

    /**
     * @return This avatar instance's {@link AvatarInfo}
     */
    @NotNull AvatarInfo getAvatarInfo();

    /**
     * @return This avatar instance's {@link SceneAvatarInfo}
     */
    @NotNull SceneAvatarInfo getSceneAvatarInfo();
}
