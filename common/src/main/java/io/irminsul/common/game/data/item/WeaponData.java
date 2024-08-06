package io.irminsul.common.game.data.item;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

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
        this(WeaponType.SWORD, 0, List.of(), List.of());
    }
}
