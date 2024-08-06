package io.irminsul.game.item;

import io.irminsul.common.game.data.item.WeaponData;
import io.irminsul.common.game.item.Weapon;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.property.EntityIdType;
import io.irminsul.common.proto.*;
import io.irminsul.game.data.DataContainer;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * Implementation of {@link Weapon}, representing an instance of a weapon
 */
@Data
public class IrminsulWeapon implements Weapon {

    /**
     * The {@link WeaponData} of this weapon
     */
    private final WeaponData weaponData;

    /**
     * The ID of the weapon
     */
    private final int itemId;

    /**
     * The GUID of this instance
     */
    private final long guid;

    /**
     * The entity id of this entity
     */
    private final int entityId;

    /**
     * Whether this item is locked
     */
    private boolean locked;

    /**
     * The level of this weapon
     */
    private int level;

    /**
     * The EXP on this weapon
     */
    private int exp;

    /**
     * The promotion level of this weapon
     */
    private int promoteLevel;

    public IrminsulWeapon(int weaponId, @NotNull Player owner) {
        this.itemId = weaponId;
        this.guid = owner.getNextGuid();
        this.entityId = owner.getWorld().getNextEntityId(EntityIdType.WEAPON);

        // Load weapon data
        this.weaponData = DataContainer.getOrLoadWeaponData(weaponId);
    }

    /**
     * @return This weapon instance's {@link SceneWeaponInfoOuterClass.SceneWeaponInfo}
     */
    @Override
    public @NotNull SceneWeaponInfoOuterClass.SceneWeaponInfo getSceneWeaponInfo() {
        return SceneWeaponInfoOuterClass.SceneWeaponInfo.newBuilder()
            .setEntityId(this.entityId)
            .setItemId(this.itemId)
            .setGuid(this.guid)
            .setLevel(0) // todo
            .setGadgetId(this.weaponData.getGadgetId())
            .setAbilityInfo(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder().build())
            .build();
    }

    /**
     * @return This item, as a protobuf Item
     */
    @Override
    public @NotNull ItemOuterClass.Item asItem() {
        WeaponOuterClass.Weapon weapon = WeaponOuterClass.Weapon.newBuilder()
            .setLevel(this.level)
            .setExp(this.exp)
            .setPromoteLevel(this.promoteLevel)
            .build();

        // TODO AFFIXES/REFINEMENT

        EquipOuterClass.Equip equip = EquipOuterClass.Equip.newBuilder().setWeapon(weapon).setIsLocked(this.locked).build();
        return ItemOuterClass.Item.newBuilder().setEquip(equip).setGuid(this.guid).setItemId(this.itemId).build();
    }
}
