package io.irminsul.common.game.data.avatar;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Representation of an avatar's skill depot
 * <p>
 * Glossary because I can't keep track of these stupid internal names:
 * skill -> what the english version refers to as "talents".
 * talent -> what the english version refers to as "constellations".
 * proud skill -> passive skills
 */
@Data
@AllArgsConstructor
public class AvatarSkillDepotData {

    /**
     * The ID of this skill depot
     */
    private final int skillDepotId;

    /**
     * Elemental burst ID
     */
    private final int energySkill;

    /**
     * A list of other skills that this depot has, excluding the burst (normal attack and elemental skill)
     */
    private final List<Integer> skills;

    private final List<Integer> subSkills;

    private final List<String> extraAbilities;

    /**
     * A list of constellations this depot has
     */
    private final List<Integer> talents;

    public AvatarSkillDepotData() {
        this(0, 0, List.of(), List.of(), List.of(), List.of());
    }
}
