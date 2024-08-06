package io.irminsul.common.game.data.weapon;

import io.irminsul.common.util.Pair;
import lombok.Data;

import java.util.List;

@Data
public class WeaponPromotionData {

    /**
     * A list of {@link WeaponProperty}s that this promotion adds
     */
    private final List<WeaponProperty> newProperties;

    /**
     * The mora cost of this promotion
     */
    private final int coinCost;

    /**
     * The material cost of this promotion, as a list of (item ID / count) pairs
     */
    private final List<Pair<Integer, Integer>> materialCost;
}
