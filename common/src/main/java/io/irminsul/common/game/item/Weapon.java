package io.irminsul.common.game.item;

import io.irminsul.common.game.data.weapon.WeaponData;
import io.irminsul.common.proto.SceneWeaponInfoOuterClass.SceneWeaponInfo;
import org.jetbrains.annotations.NotNull;

/**
 * Represents an instance of a weapon
 */
public interface Weapon extends Item {

    /**
     * @return The {@link WeaponData} of this weapon
     */
    @NotNull WeaponData getWeaponData();

    /**
     * @return The level of this weapon
     */
    int getLevel();

    /**
     * @return The EXP on this weapon
     */
    int getExp();

    /**
     * @return The promotion level of this weapon
     */
    int getPromoteLevel();

    /**
     * @return This weapon instance's {@link SceneWeaponInfo}
     */
    @NotNull SceneWeaponInfo getSceneWeaponInfo();

    /**
     * @return The quantity of this item
     * @implNote Weapons cannot be stacked.
     */
    default int getCount() {
        return 1;
    }
}
