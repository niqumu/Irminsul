package io.irminsul.common.game.data.misc;

import lombok.Data;

@Data
public class OpenStateCondition {

    private final String conditionType;

    private final int param;

    private final int param2;
}
