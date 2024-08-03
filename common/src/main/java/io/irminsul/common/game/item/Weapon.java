package io.irminsul.common.game.item;

import io.irminsul.common.game.Entity;
import io.irminsul.common.proto.SceneWeaponInfoOuterClass.SceneWeaponInfo;
import org.jetbrains.annotations.NotNull;

/**
 * Represents an instance of a weapon
 */
public interface Weapon extends Entity {

    /**
     * @return The ID of the weapon type
     */
    int getWeaponId();

    /**
     * @return The GUID of this instance
     */
    long getGuid();

    /**
     * @return This weapon instance's {@link SceneWeaponInfo}
     */
    @NotNull SceneWeaponInfo getSceneWeaponInfo();
}
