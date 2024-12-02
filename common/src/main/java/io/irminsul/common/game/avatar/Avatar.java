package io.irminsul.common.game.avatar;

import io.irminsul.common.game.world.Entity;
import io.irminsul.common.game.data.avatar.AvatarData;
import io.irminsul.common.game.item.Weapon;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.proto.AbilityControlBlockOuterClass.AbilityControlBlock;
import io.irminsul.common.proto.AvatarInfoOuterClass.AvatarInfo;
import io.irminsul.common.proto.SceneAvatarInfoOuterClass.SceneAvatarInfo;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 * Represents an instance of an avatar (character)
 */
public interface Avatar extends Entity {

    // ================================================================ //
    //                               Core                               //
    // ================================================================ //

    /**
     * @return The ID of the avatar
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

    /**
     * @return The {@link AvatarType} of this avatar: normal or trial
     */
    @NotNull AvatarType getType();

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
     * @return The level of this avatar
     */
    int getLevel();

    /**
     * @return The total EXP of this avatar
     */
    int getExp();

    /**
     * @return The ascension level of this avatar
     */
    int getBreakLevel();

    /**
     * @return A map of skill levels, keyed by ID
     */
    @NotNull Map<Integer, Integer> getSkillLevels();

    /**
     * @return A map of fight properties, keyed by id
     */
    @NotNull Map<Integer, Float> getFightProperties();

    // ================================================================ //
    //                             Function                             //
    // ================================================================ //

    /**
     * Recalculate and resend this avatar's stats
     */
    void updateStats();

    /**
     * Sets this avatar's health, represented as a percent of their max health
     * @param percent The new health value, as a percent of max health, for this avatar
     */
    void setHealthPercent(float percent);

    /**
     * @return This avatar instance's {@link AvatarInfo}
     */
    @NotNull AvatarInfo buildAvatarInfo();

    /**
     * @return This avatar instance's {@link SceneAvatarInfo}
     */
    @NotNull SceneAvatarInfo buildSceneAvatarInfo();

    /**
     * @return An {@link AbilityControlBlock} built from this avatar's abilities from all sources
     */
    @NotNull AbilityControlBlock buildAbilityControlBlock();
}
