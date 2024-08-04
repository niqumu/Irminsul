package io.irminsul.common.game;

import io.irminsul.common.util.MiscUtil;
import lombok.experimental.UtilityClass;

@UtilityClass
public class GameConstants {

    /**
     * The scene ID of the main world
     */
    public final int OVERWORLD_SCENE = 3;

    /**
     * The avatar ID of the travelers
     */
    public final int MALE_TRAVELER_AVATAR_ID = 10000005;
    public final int FEMALE_TRAVELER_AVATAR_ID = 10000007;

    /**
     * An array of default avatar abilities
     */
    public final String[] DEFAULT_ABILITIES = {
        "Avatar_DefaultAbility_VisionReplaceDieInvincible",
        "Avatar_DefaultAbility_AvartarInShaderChange",
        "Avatar_SprintBS_Invincible",
        "Avatar_Freeze_Duration_Reducer",
        "Avatar_Attack_ReviveEnergy",
        "Avatar_Component_Initializer",
        "Avatar_FallAnthem_Achievement_Listener",
        "GrapplingHookSkill_Ability",
        "Avatar_PlayerBoy_DiveStamina_Reduction",
        "Ability_Avatar_Dive_SealEcho",
        "Absorb_SealEcho_Bullet_01",
        "Absorb_SealEcho_Bullet_02",
        "Ability_Avatar_Dive_CrabShield",
        "ActivityAbility_Absorb_Shoot",
        "SceneAbility_DiveVolume"
    };

    public final int DEFAULT_ABILITY_HASH = MiscUtil.abilityHash("Default");

    public final int ITEM_CHAR_EXP = 101;
    public final int ITEM_AR_EXP = 102;
    public final int ITEM_COMPANION_EXP = 105;
    public final int ITEM_RESIN = 106;
    public final int ITEM_PRIMOGEM = 201;
    public final int ITEM_MORA = 202;
    public final int ITEM_GEN_CRYSTAL = 203;
    public final int ITEM_HOME_COIN = 204;
}
