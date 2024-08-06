package io.irminsul.common.game.data.item;

import lombok.Data;

/**
 * Represents a weapon fight property (stat) in the weapon data excel
 */
@Data
public class WeaponProperty {

    /**
     * The fight property being granted, by internal ID
     */
    private final int propertyType;

    /**
     * The initial value of this property, at level 1
     */
    private final float initValue;

    /**
     * The growth type, by ID/name, of this property, describing the function by which this stat increases by level
     */
    private final String growthType;
}
