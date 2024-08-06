package io.irminsul.common.game.data.weapon;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * Represents a category of weapon
 */
@Getter
@RequiredArgsConstructor
public enum WeaponType {
    SWORD("WEAPON_SWORD_ONE_HAND", 11101),
    CLAYMORE("WEAPON_CLAYMORE", 12101),
    POLEARM("WEAPON_POLE", 13101),
    CATALYST("WEAPON_CATALYST", 14101),
    BOW("WEAPON_BOW", 15101);

    /**
     * The internal name of the weapon type, as used in the weapon data file
     */
    private final String name;

    /**
     * The number at which weapon IDs of this type begin
     */
    private final int baseId;

    /**
     * Gets the weapon type corresponding to the internal name of the type
     * @param name The internal name of the weapon type, as used in the weapon data excel
     * @return The weapon type corresponding to the given name, or SWORD as a fallback if none exists
     */
    public static @NotNull WeaponType of(@NotNull String name) {
        for (WeaponType type : WeaponType.values()) {
            if (type.name.equals(name)) {
                return type;
            }
        }
        return SWORD; // fallback
    }

    /**
     * Gets the weapon type given a weapon's ID
     * @param id The ID of the weapon to determine the type of
     * @return The weapon type corresponding to the given ID, or SWORD as a fallback if none exists
     */
    public static @NotNull WeaponType of(int id) {
        for (WeaponType type : Arrays.stream(WeaponType.values()).toList().reversed()) {
            if (id >= type.baseId) {
                return type;
            }
        }
        return SWORD; // fallback
    }
}
