package io.irminsul.common.game.data.avatar;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AvatarData {

    private final int initialWeapon;

    private final AvatarSkillDepotData skillDepotData;

    private final List<Integer> candSkillDepotIds;

    private final float baseHp;

    private final float baseAtk;

    private final float baseDef;

    private final float baseCritRate;

    private final float baseCritDmg;

    public AvatarData() {
        this(0, new AvatarSkillDepotData(), List.of(), 0, 0, 0, 0, 0);
    }
}
