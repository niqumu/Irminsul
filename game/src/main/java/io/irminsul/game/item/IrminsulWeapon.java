package io.irminsul.game.item;

import io.irminsul.common.game.item.Weapon;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.property.EntityIdType;
import io.irminsul.common.proto.AbilitySyncStateInfoOuterClass;
import io.irminsul.common.proto.SceneEntityInfoOuterClass;
import io.irminsul.common.proto.SceneWeaponInfoOuterClass;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * Implementation of {@link Weapon}, representing an instance of a weapon
 */
@Data
public class IrminsulWeapon implements Weapon {

    /**
     * The ID of the weapon type
     */
    private final int weaponId;

    /**
     * The GUID of this instance
     */
    private final long guid;

    /**
     * The entity id of this entity
     */
    private final int entityId;

    public IrminsulWeapon(int weaponId, @NotNull Player owner) {
        this.weaponId = weaponId;
        this.guid = owner.getNextGuid();
        this.entityId = owner.getWorld().getNextEntityId(EntityIdType.WEAPON);
    }

    /**
     * @return This entity's {@link SceneEntityInfoOuterClass.SceneEntityInfo}
     */
    @Override
    public SceneEntityInfoOuterClass.@NotNull SceneEntityInfo buildSceneEntityInfo() {
        return SceneEntityInfoOuterClass.SceneEntityInfo.newBuilder().build();
    }

    /**
     * @return This weapon instance's {@link SceneWeaponInfoOuterClass.SceneWeaponInfo}
     */
    @Override
    public @NotNull SceneWeaponInfoOuterClass.SceneWeaponInfo getSceneWeaponInfo() {
        return SceneWeaponInfoOuterClass.SceneWeaponInfo.newBuilder()
            .setEntityId(this.entityId)
            .setItemId(this.weaponId)
            .setGuid(this.guid)
            .setLevel(0) // todo
            .setGadgetId(this.weaponId) // todo hardcode testing
            .setAbilityInfo(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder().build())
            .build();
    }
}
