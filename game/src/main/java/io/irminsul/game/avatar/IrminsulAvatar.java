package io.irminsul.game.avatar;

import io.irminsul.common.game.GameConstants;
import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.data.avatar.AvatarData;
import io.irminsul.common.game.item.Weapon;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.property.EntityIdType;
import io.irminsul.common.proto.*;
import io.irminsul.common.proto.AbilityControlBlockOuterClass.AbilityControlBlock;
import io.irminsul.common.util.MiscUtil;
import io.irminsul.game.data.DataContainer;
import io.irminsul.game.data.FightProperty;
import io.irminsul.game.data.PlayerProperty;
import io.irminsul.game.item.IrminsulWeapon;
import io.irminsul.game.net.packet.PacketAvatarFightPropNotify;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.io.Serial;
import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of {@link Avatar}, representing an instance of an avatar (character)
 */
@Data
public class IrminsulAvatar implements Avatar {

    @Serial
    private final static long serialVersionUID = 1;

    // ================================================================ //
    //                               Core                               //
    // ================================================================ //

    /**
     * The ID of the avatar type
     */
    private final int avatarId;

    /**
     * The GUID of this instance
     */
    private final long guid;

    /**
     * The entity id of this entity, or 0 if none exists
     */
    private final int entityId;

    /**
     * The {@link Player} who owns this instance
     */
    private final Player owner;

    /**
     * The time this avatar was created/obtained at
     */
    private final int bornTime = (int) (System.currentTimeMillis() / 1000);

    /**
     * The {@link AvatarData} of this avatar
     */
    private final AvatarData avatarData;

    // ================================================================ //
    //                            Cosmetics                             //
    // ================================================================ //

    /**
     * The glider worn by this instance
     */
    private int flyCloak = 140001;

    /**
     * The costume worn by this instance
     */
    private int costume = 0;

    // ================================================================ //
    //                              Items                               //
    // ================================================================ //

    /**
     * The weapon held by this instance
     */
    private Weapon weapon;

    // ================================================================ //
    //                           Attributes                             //
    // ================================================================ //

    /**
     * The level of this avatar
     */
    private int level = 1;

    /**
     * The total EXP of this avatar
     */
    private int exp = 0;

    /**
     * The ascension level of this avatar
     */
    private int breakLevel = 0;

    /**
     * A map of talent levels, keyed by ID
     */
    private final Map<Integer, Integer> talentLevels = new HashMap<>();

    /**
     * A map of fight properties, keyed by id
     * @see io.irminsul.game.data.FightProperty
     */
    private final Map<Integer, Float> fightProperties = new HashMap<>();

    // ================================================================ //

    /**
     * Creates a new avatar with fresh/blank data
     * @param avatarId The ID of the avatar to create an instance of
     * @param owner The player who this avatar should belong to
     */
    public IrminsulAvatar(int avatarId, @NotNull Player owner) {
        this.avatarId = avatarId;
        this.guid = owner.getNextGuid();
        this.owner = owner;
        this.entityId = owner.getWorld().getNextEntityId(EntityIdType.AVATAR);
        this.avatarData = DataContainer.getOrLoadAvatarData(this.avatarId);
        this.weapon = new IrminsulWeapon(this.avatarData.getInitialWeapon(), owner);

        this.updateStats();
        this.setHealthPercent(1); // Start at full HP
    }

    /**
     * Recalculate and resend this avatar's stats
     */
    @Override
    public void updateStats() {

        // Health percent before updating stats
        final float oldHealthPercent = this.getFightProperty(FightProperty.FIGHT_PROP_CUR_HP) /
            this.getFightProperty(FightProperty.FIGHT_PROP_MAX_HP);

        // Base stats
        this.putFightProperty(FightProperty.FIGHT_PROP_BASE_HP, this.avatarData.getBaseHp());
        this.putFightProperty(FightProperty.FIGHT_PROP_BASE_ATTACK, this.avatarData.getBaseAtk());
        this.putFightProperty(FightProperty.FIGHT_PROP_BASE_DEFENSE, this.avatarData.getBaseDef());

        // Start fresh from base stats
        this.putFightProperty(FightProperty.FIGHT_PROP_MAX_HP, this.avatarData.getBaseHp());
        this.putFightProperty(FightProperty.FIGHT_PROP_CUR_ATTACK, this.avatarData.getBaseAtk());
        this.putFightProperty(FightProperty.FIGHT_PROP_CUR_DEFENSE, this.avatarData.getBaseDef());
        this.putFightProperty(FightProperty.FIGHT_PROP_CRITICAL, this.avatarData.getBaseCritRate());
        this.putFightProperty(FightProperty.FIGHT_PROP_CRITICAL_HURT, this.avatarData.getBaseCritDmg());

        // Set the health to the same percent as before the stat update
        this.putFightProperty(FightProperty.FIGHT_PROP_CUR_HP,
            oldHealthPercent * this.getFightProperty(FightProperty.FIGHT_PROP_MAX_HP));

        // Send the new stats to the player
        new PacketAvatarFightPropNotify(this.owner.getSession(), this).send();
    }

    /**
     * Sets this avatar's health, represented as a percent of their max health
     * @param percent The new health value, as a percent of max health, for this avatar
     */
    @Override
    public void setHealthPercent(float percent) {
        this.putFightProperty(FightProperty.FIGHT_PROP_CUR_HP, this.getFightProperty(FightProperty.FIGHT_PROP_MAX_HP));
    }

    private void putFightProperty(FightProperty property, float value) {
        this.fightProperties.put(property.getId(), value);
    }

    private float getFightProperty(FightProperty property) {
        return this.fightProperties.getOrDefault(property.getId(), 0f);
    }

    /**
     * @return This avatar instance's {@link AvatarInfoOuterClass.AvatarInfo}
     */
    @Override
    public @NotNull AvatarInfoOuterClass.AvatarInfo buildAvatarInfo() {
        return AvatarInfoOuterClass.AvatarInfo.newBuilder()
            .setAvatarId(this.avatarId)
            .setGuid(this.guid)
            .setSkillDepotId(this.avatarData.getSkillDepotData().getSkillDepotId())
            .setBornTime(this.bornTime)
            .setLifeState(1)
            .setWearingFlycloakId(this.flyCloak)
            .setCostumeId(this.costume)
            .addEquipGuidList(this.weapon.getGuid())
            .putPropMap(PlayerProperty.LEVEL.getId(), PlayerProperty.LEVEL.toPropValue(this.level))
            .putPropMap(PlayerProperty.EXP.getId(), PlayerProperty.EXP.toPropValue(this.exp))
            .putPropMap(PlayerProperty.BREAK_LEVEL.getId(), PlayerProperty.BREAK_LEVEL.toPropValue(this.breakLevel))
            .build();
    }

    /**
     * @return This entity's {@link SceneEntityInfoOuterClass.SceneEntityInfo}
     */
    @Override
    public @NotNull SceneEntityInfoOuterClass.SceneEntityInfo buildSceneEntityInfo() {
        return SceneEntityInfoOuterClass.SceneEntityInfo.newBuilder()
            .setEntityId(this.entityId)
            .setEntityType(ProtEntityTypeOuterClass.ProtEntityType.PROT_ENTITY_TYPE_AVATAR)
            .setAvatar(this.buildSceneAvatarInfo())
            .setEntityAuthorityInfo(
                EntityAuthorityInfoOuterClass.EntityAuthorityInfo.newBuilder()
                    .setAbilityInfo(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder())
                    .setRendererChangedInfo(EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.newBuilder())
                    .setAiInfo(SceneEntityAiInfoOuterClass.SceneEntityAiInfo.newBuilder()
                        .setIsAiOpen(true).setBornPos(VectorOuterClass.Vector.newBuilder()))
                    .setBornPos(VectorOuterClass.Vector.newBuilder())
                    .build())
            .setEntityClientData(EntityClientDataOuterClass.EntityClientData.newBuilder().build())
            .addAnimatorParaList(AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.newBuilder().build())
            .setMotionInfo(
                MotionInfoOuterClass.MotionInfo.newBuilder()
                    .setPos(this.owner.getPosition().positionAsVector())
                    .setRot(VectorOuterClass.Vector.newBuilder().build())
                    .setSpeed(VectorOuterClass.Vector.newBuilder().build())
                    .setState(MotionStateOuterClass.MotionState.MOTION_STATE_NONE)
                    .build())
            .setLifeState(1)
            .build();
    }

    /**
     * @return This avatar instance's {@link SceneAvatarInfoOuterClass.SceneAvatarInfo}
     */
    @Override
    public @NotNull SceneAvatarInfoOuterClass.SceneAvatarInfo buildSceneAvatarInfo() {
        return SceneAvatarInfoOuterClass.SceneAvatarInfo.newBuilder()
            .setUid(this.owner.getUid())
            .setPeerId(this.owner.getPeerId())
            .setSkillDepotId(this.avatarData.getSkillDepotData().getSkillDepotId())
            .setAvatarId(this.avatarId)
            .setGuid(this.guid)
            .setBornTime(this.bornTime)
            .setCostumeId(this.costume)
            .setWearingFlycloakId(this.flyCloak)
            .setWeapon(this.weapon.getSceneWeaponInfo())
            .addEquipIdList(this.weapon.getWeaponId())
            .build();
    }

    /**
     * @return An {@link AbilityControlBlock} built from this avatar's abilities from all sources
     */
    @Override
    public @NotNull AbilityControlBlock buildAbilityControlBlock() {
        AbilityControlBlock.Builder builder = AbilityControlBlock.newBuilder();
        int embryo = 0;

        // Avatar abilities TODO disabled until i figure out why the client rejects these hashes
//        for (String ability : this.avatarData.getAbilities()) {
//            builder.addAbilityEmbryoList(
//                AbilityEmbryoOuterClass.AbilityEmbryo.newBuilder()
//                    .setAbilityId(++embryo)
//                    .setAbilityNameHash(MiscUtil.abilityHash(ability))
//                    .setAbilityOverrideNameHash(GameConstants.DEFAULT_ABILITY_HASH)
//                    .build());
//        }

        // Default abilities
        for (String ability : GameConstants.DEFAULT_ABILITIES) {
            builder.addAbilityEmbryoList(
                AbilityEmbryoOuterClass.AbilityEmbryo.newBuilder()
                    .setAbilityId(++embryo)
                    .setAbilityNameHash(MiscUtil.abilityHash(ability))
                    .setAbilityOverrideNameHash(GameConstants.DEFAULT_ABILITY_HASH)
                    .build());
        }

        return builder.build();
    }
}
