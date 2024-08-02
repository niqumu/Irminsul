package io.irminsul.common.game.property;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EntityIdType {
    AVATAR(1),
    MONSTER(2),
    NPC(3),
    GADGET(4),
    REGION(5),
    WEAPON(6),
    TEAM(9),
    MPLEVEL(11);

    private final int id;
}
