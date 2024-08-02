package io.irminsul.common.game.item;

import io.irminsul.common.game.Entity;
import io.irminsul.common.proto.SceneWeaponInfoOuterClass;
import org.jetbrains.annotations.NotNull;

public interface Weapon extends Entity {
    int getWeaponId();

    long getGuid();

    @NotNull SceneWeaponInfoOuterClass.SceneWeaponInfo getSceneWeaponInfo();
}
