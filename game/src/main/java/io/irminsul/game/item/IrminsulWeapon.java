package io.irminsul.game.item;

import io.irminsul.common.game.item.Weapon;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.property.EntityIdType;
import io.irminsul.common.proto.AbilitySyncStateInfoOuterClass;
import io.irminsul.common.proto.SceneEntityInfoOuterClass;
import io.irminsul.common.proto.SceneWeaponInfoOuterClass;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class IrminsulWeapon implements Weapon {

    private final int weaponId;

    private final long guid;

    private final int entityId;

    public IrminsulWeapon(int weaponId, @NotNull Player owner) {
        this.weaponId = weaponId;
        this.guid = owner.getNextGuid();
        this.entityId = owner.getWorld().getNextEntityId(EntityIdType.WEAPON);
    }

    @Override
    public SceneEntityInfoOuterClass.@NotNull SceneEntityInfo getSceneEntityInfo() {
        return SceneEntityInfoOuterClass.SceneEntityInfo.newBuilder().build();
    }

    @Override
    public @NotNull SceneWeaponInfoOuterClass.SceneWeaponInfo getSceneWeaponInfo() {
        return SceneWeaponInfoOuterClass.SceneWeaponInfo.newBuilder()
            .setEntityId(this.entityId)
            .setItemId(this.weaponId)
            .setGuid(this.guid)
            .setLevel(0) // todo
            .setGadgetId(11407) // todo hardcode testing
            .setAbilityInfo(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder().build())
            .build();
    }
}
