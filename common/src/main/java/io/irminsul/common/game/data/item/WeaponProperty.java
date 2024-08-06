package io.irminsul.common.game.data.item;

import lombok.Data;

/**
 * Represents a weapon property (stat) in the weapon data excel
 */
@Data
public class WeaponProperty {

    /**
     * The type of this property, which is missing and must be inferred from the growth type if no initial value is
     * present (seriously mhy?)
     */
    private final String propertyType;

    /**
     * The initial value of this property, at level 1
     */
    private final float initValue;

    /**
     * The growth type, by ID/name, of this property, describing the function by which this stat increases by level
     */
    private final String growthType;
}
