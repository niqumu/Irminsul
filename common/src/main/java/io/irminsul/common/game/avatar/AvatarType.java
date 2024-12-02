package io.irminsul.common.game.avatar;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AvatarType {
    NORMAL(1),
    TRIAL(2);

    private final int id;
}
