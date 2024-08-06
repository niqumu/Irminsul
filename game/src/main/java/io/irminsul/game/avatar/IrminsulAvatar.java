package io.irminsul.game.avatar;

import static io.irminsul.game.data.FightProperty.*;

import io.irminsul.common.game.data.weapon.WeaponPromotionData;
import io.irminsul.game.GameConstants;
import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.data.avatar.AvatarData;
import io.irminsul.common.game.item.Weapon;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.property.EntityIdType;
import io.irminsul.common.proto.*;
import io.irminsul.common.proto.AbilityControlBlockOuterClass.AbilityControlBlock;
import io.irminsul.common.util.MiscUtil;
import io.irminsul.game.data.ActionReason;
import io.irminsul.game.data.DataContainer;
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
     * A map of fight properties, keyed by ID
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

        // Create a starter weapon, equip it, and give it to the owner
//        this.weapon = new IrminsulWeapon(this.avatarData.getInitialWeapon(), owner);
        this.weapon = new IrminsulWeapon(11502, owner);
        this.owner.getInventory().addItem(this.weapon, ActionReason.AddAvatar);

        // Calculate stats
        this.updateStats();
        this.setHealthPercent(1); // Start at full HP
    }

    /**
     * Recalculate and resend this avatar's stats
     * <p>
     * This is an extremely complicated and confusing process, but I tried my best to document it as well as possible
     * and break it all down. Most stats are simple and just additive, but health, attack, and defense are far more
     * complicated. These three stats each have four sub stats: base, % bonus, flat, and final. The final value is
     * derived from the first three values using the following formula:
     * <pre>final = (base * (1 + % bonus)) + flat
     * </pre>
     * The final value is what actually gets used in damage calculation, and is what's displayed to the end user (except
     * in the stat breakdown page, of course).
     * <p>
     * This makes more sense if you read <a href="https://genshin-impact.fandom.com/wiki/Attribute">the wiki</a>.
     */
    @Override
    public void updateStats() {

        // ================================================================
        // Step 1:
        // ----------------------------------------------------------------
        // As per the wiki, we want to preserve the same health percent after updating stats. If the player has 10k
        // health with 15k max health prior to this stat update, and the stat update leaves them with 20k max health,
        // they should have their current health set to 13.333k.
        // ================================================================

        // Snapshotted health percent before updating stats
        final float oldHealthPercent = this.getFightProperty(FIGHT_PROP_CUR_HP) /
            this.getFightProperty(FIGHT_PROP_MAX_HP);

        // ================================================================
        // Step 2:
        // ----------------------------------------------------------------
        // We want to start with a completely blank slate. Wipe all fight properties and reset them to zero. Then, we
        // want to reset base stats to their base value (character base stats), and build on them from there.
        // ================================================================

        // Wipe all stats
        this.fightProperties.clear(); // todo: we want to save energy!

        // Set up base stats
        this.putFightProperty(FIGHT_PROP_BASE_HP, this.avatarData.getBaseHp());
        this.putFightProperty(FIGHT_PROP_BASE_ATTACK, this.avatarData.getBaseAtk());
        this.putFightProperty(FIGHT_PROP_BASE_DEFENSE, this.avatarData.getBaseDef());
        this.putFightProperty(FIGHT_PROP_CRITICAL, this.avatarData.getBaseCritRate());
        this.putFightProperty(FIGHT_PROP_CRITICAL_HURT, this.avatarData.getBaseCritDmg());

        // ================================================================
        // Step 3:
        // ----------------------------------------------------------------
        // Calculate the base, multiplier, and flat values of every stat.
        // Factor in all stat sources, i.e. weapon, artifacts, food, team resonance, etc.
        // ================================================================

        this.calculateStatSources();

        // ================================================================
        // Step 4:
        // ----------------------------------------------------------------
        // Calculate the final value of health, attack, and defense. We already calculated the base, % bonus, and
        // flat values of these stats in step 3.
        // Formula: final = (base * (1 + % bonus)) + flat
        // Other stats are easy and only have flat values, so we don't need to touch them; they're already done.
        // ================================================================

        // Health
        this.putFightProperty(FIGHT_PROP_MAX_HP, getFightProperty(FIGHT_PROP_BASE_HP)); // Copy base
        this.boostFightProperty(FIGHT_PROP_MAX_HP, 1 + getFightProperty(FIGHT_PROP_HP_PERCENT)); // % bonus
        this.addFightProperty(FIGHT_PROP_MAX_HP, getFightProperty(FIGHT_PROP_HP)); // Add flat

        // Attack
        this.putFightProperty(FIGHT_PROP_CUR_ATTACK, getFightProperty(FIGHT_PROP_BASE_ATTACK)); // Copy base
        this.boostFightProperty(FIGHT_PROP_CUR_ATTACK, 1 + getFightProperty(FIGHT_PROP_ATTACK_PERCENT)); // % bonus
        this.addFightProperty(FIGHT_PROP_CUR_ATTACK, getFightProperty(FIGHT_PROP_ATTACK)); // Add flat

        // Defense
        this.putFightProperty(FIGHT_PROP_CUR_DEFENSE, getFightProperty(FIGHT_PROP_BASE_DEFENSE)); // Copy base
        this.boostFightProperty(FIGHT_PROP_CUR_DEFENSE, 1 + getFightProperty(FIGHT_PROP_DEFENSE_PERCENT)); // % bonus
        this.addFightProperty(FIGHT_PROP_CUR_DEFENSE, getFightProperty(FIGHT_PROP_DEFENSE)); // Add flat

        // ================================================================
        // Step 5:
        // ----------------------------------------------------------------
        // Restore the health percent we snapshotted at the start and inform the client of the stat changes.
        // ================================================================

        // Set the health to the same percent as before the stat update
        this.putFightProperty(FIGHT_PROP_CUR_HP, oldHealthPercent * this.getFightProperty(FIGHT_PROP_MAX_HP));

        // Send the new stats to the player
        new PacketAvatarFightPropNotify(this.owner.getSession(), this).send();
    }

    void calculateStatSources() {

        // Weapon base stats
        this.weapon.getWeaponData().getProperties().forEach(property -> {
            // Weapons don't scale by level, they scale by (level / max level)!
            // TODO: this is still off by 0.09%... I have no clue why
            float progressToMax = (float) this.weapon.getLevel() / this.weapon.getWeaponData().getMaxLevel();
            int level = Math.round(progressToMax * 100);
            float multiplier = DataContainer.getOrLoadWeaponCurve(property.getGrowthType()).get(level);
            this.addFightProperty(property.getPropertyType(), property.getValue() * multiplier);
        });

        // Weapon promotion stats
        // todo: why is this, again, slightly off?
        WeaponPromotionData data =
            DataContainer.getOrLoadWeaponPromotions(this.weapon.getItemId()).get(this.weapon.getPromoteLevel());
        if (data != null) {
            data.getNewProperties().forEach(prop -> this.addFightProperty(prop.getPropertyType(), prop.getValue()));
        }
    }

    /**
     * Sets this avatar's health, represented as a percent of their max health
     * @param percent The new health value, as a percent of max health, for this avatar
     */
    @Override
    public void setHealthPercent(float percent) {
        this.putFightProperty(FIGHT_PROP_CUR_HP, this.getFightProperty(FIGHT_PROP_MAX_HP));
    }

    private void putFightProperty(int property, float value) {
        this.fightProperties.put(property, value);
    }

    private float getFightProperty(int property) {
        return this.fightProperties.getOrDefault(property, 0f);
    }

    private void addFightProperty(int property, float change) {
        this.putFightProperty(property, this.getFightProperty(property) + change);
    }

    private void boostFightProperty(int property, float multiplier) {
        this.putFightProperty(property, this.getFightProperty(property) * multiplier);
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
            .addEquipIdList(this.weapon.getItemId())
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
