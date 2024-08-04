package io.irminsul.common.game.avatar;

import io.irminsul.common.game.Entity;
import io.irminsul.common.game.data.avatar.AvatarData;
import io.irminsul.common.game.item.Weapon;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.proto.AvatarInfoOuterClass.AvatarInfo;
import io.irminsul.common.proto.SceneAvatarInfoOuterClass.SceneAvatarInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.Map;

/**
 * Represents an instance of an avatar (character)
 */
public interface Avatar extends Entity, Serializable {

    // ================================================================ //
    //                               Core                               //
    // ================================================================ //

    /**
     * @return The ID of the avatar type
     */
    int getAvatarId();

    /**
     * @return The GUID of this instance
     */
    long getGuid();

    /**
     * @return The {@link Player} who owns this instance
     */
    @NotNull Player getOwner();

    /**
     * @return The time this avatar was created/obtained at
     */
    int getBornTime();

    /**
     * @return The {@link AvatarData} of this avatar
     */
    @NotNull AvatarData getAvatarData();

    // ================================================================ //
    //                            Cosmetics                             //
    // ================================================================ //

    /**
     * @return The glider worn by this instance
     */
    int getFlyCloak();

    /**
     * @return The costume worn by this instance
     */
    int getCostume();

    // ================================================================ //
    //                              Items                               //
    // ================================================================ //

    /**
     * @return The weapon held by this instance
     */
    @NotNull Weapon getWeapon();

    // ================================================================ //
    //                           Attributes                             //
    // ================================================================ //

    /**
     * @return A map of talent levels, keyed by ID
     */
    @NotNull Map<Integer, Integer> getTalentLevels();

    // ================================================================ //
    //                             Function                             //
    // ================================================================ //

    /**
     * @return This avatar instance's {@link AvatarInfo}
     */
    @NotNull AvatarInfo buildAvatarInfo();

    /**
     * @return This avatar instance's {@link SceneAvatarInfo}
     */
    @NotNull SceneAvatarInfo buildSceneAvatarInfo();
}
