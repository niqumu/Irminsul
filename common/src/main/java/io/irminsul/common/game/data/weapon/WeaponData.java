package io.irminsul.common.game.data.weapon;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representation of an entry in the weapon data excel
 */
@Data
@AllArgsConstructor
public class WeaponData {

    /**
     * The type of weapon
     */
    private final WeaponType type;

    /**
     * The maximum level of this weapon, derived from the weapon rarity (70 for 1 and 2 stars, 90 for 3+)
     */
    private final int maxLevel;

    /**
     * The gadget ID of the weapon. Seems to always be the weapon ID + 50000000
     */
    private final int gadgetId;

    /**
     * A list of skills, by id, that this weapon grants avatars when used
     */
    private final List<Integer> skillAffixes;

    /**
     * A list of {@link WeaponProperty}s (stats) that this weapon has
     */
    private final List<WeaponProperty> properties;

    /**
     * Construct a new fallback WeaponData with default/placeholder values
     */
    public WeaponData() {
        this(WeaponType.SWORD, 0, 0, List.of(), List.of());
    }
}
