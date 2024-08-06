package io.irminsul.common.game.data.weapon;

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
     * The base value of this property
     */
    private final float value;

    /**
     * The growth type, by ID/name, of this property, describing the function by which this stat increases by level.
     * This is null where it doesn't apply, for example in static weapon promotion properties that do not grow.
     */
    private final String growthType;
}
