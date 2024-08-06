package io.irminsul.common.game.data.avatar;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Representation of an entry within the avatar data excel
 */
@Data
@AllArgsConstructor
public class AvatarData {

    /**
     * The internal name of the avatar. This may or may not be the same as the English name in-game!
     */
    private final String name;

    /**
     * The ID of the initial weapon that this avatar comes with
     */
    private final int initialWeapon;

    /**
     * The {@link AvatarSkillDepotData} of this avatar
     */
    private final AvatarSkillDepotData skillDepotData;

    /**
     * A list of "canned" skill depot IDs that this avatar contains and has the potential to use.
     * Currently only used for the travelers' depot IDs with different elements
     */
    private final List<Integer> candSkillDepotIds;

    /**
     * The base HP of this avatar at level 1
     */
    private final float baseHp;

    /**
     * The base ATK of this avatar at level 1
     */
    private final float baseAtk;

    /**
     * The base DEF of this avatar at level 1
     */
    private final float baseDef;

    /**
     * The base Crit Rate of this avatar at level 1
     */
    private final float baseCritRate;

    /**
     * The base Crit DMG of this avatar at level 1
     */
    private final float baseCritDmg;

    /**
     * A list of abilities, by internal name, that this avatar possesses
     */
    private final List<String> abilities;

    /**
     * Construct a new fallback AvatarData with default/placeholder values
     */
    public AvatarData() {
        this("Unknown", 0, new AvatarSkillDepotData(), List.of(), 0, 0, 0, 0, 0, List.of());
    }
}
