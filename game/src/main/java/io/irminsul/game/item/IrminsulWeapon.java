package io.irminsul.game.item;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.data.weapon.WeaponData;
import io.irminsul.common.game.database.StateContainer;
import io.irminsul.common.game.item.Weapon;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.property.EntityIdType;
import io.irminsul.common.proto.*;
import io.irminsul.game.database.state.WeaponState;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

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
     * The ID of the weapon type
     */
    private final int itemId;

    /**
     * The persistent UUID of this weapon
     */
    private final UUID persistentId;

    /**
     * The GUID of this instance
     */
    private long guid;

    /**
     * The entity id of this entity
     */
    private int entityId;

    /**
     * Whether this item is locked
     */
    private boolean locked = false;

    /**
     * The level of this weapon
     */
    private int level = 1;

    /**
     * The EXP on this weapon
     */
    private int exp = 0;

    /**
     * The promotion level of this weapon
     */
    private int promoteLevel = 0;

    /**
     * Loads an existing weapon from an exported {@link WeaponState}
     * @param gameServer The {@link GameServer} this weapon is to be created under
     * @param state The state to load
     */
    public IrminsulWeapon(@NotNull GameServer gameServer, @NotNull WeaponState state) {
        this.itemId = state.getItemId();
        this.persistentId = state.getPersistentId();
        this.locked = state.isLocked();
        this.level = state.getLevel();
        this.exp = state.getExp();
        this.promoteLevel = state.getPromoteLevel();

        // Load weapon data
        this.weaponData = gameServer.getDataContainer().getOrLoadWeaponData(this.itemId);

        // todo assign guid and entity id (or maybe not?)
    }

    /**
     * Create a new weapon with the given parameters
     * @param weaponId The ID of the weapon type
     * @param owner The owner of this weapon
     */
    public IrminsulWeapon(int weaponId, @NotNull Player owner) {
        this.itemId = weaponId;

        this.persistentId = UUID.randomUUID(); // todo: insanely unlikely to happen, but should check for dupe uuid

        // todo: this should only be done when needed!
        this.guid = owner.getNextGuid();
        this.entityId = owner.getWorld().getNextEntityId(EntityIdType.WEAPON);

        // Load weapon data
        this.weaponData = owner.getServer().getDataContainer().getOrLoadWeaponData(this.itemId);
    }

    /**
     * Exports the state of this object to an appropriate {@link StateContainer} that can be used in a constructor
     * to recreate this object
     * @return The state of this object, exported as a {@link StateContainer} implementation
     */
    @Override
    public StateContainer exportState() {
        return new WeaponState(this.itemId, this.persistentId, this.locked, this.level, this.exp, this.promoteLevel);
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
            .setLevel(this.level)
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
