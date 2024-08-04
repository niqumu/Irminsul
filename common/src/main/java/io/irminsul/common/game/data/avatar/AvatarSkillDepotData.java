package io.irminsul.common.game.data.avatar;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AvatarSkillDepotData {

    private final int skillDepotId;

    private final int energySkill;

    private final List<Integer> skills;

    private final List<Integer> subSkills;

    private final List<String> extraAbilities;

    private final List<Integer> talents;

    public AvatarSkillDepotData() {
        this(0, 0, List.of(), List.of(), List.of(), List.of());
    }
}
