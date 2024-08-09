package io.irminsul.common.game.data.misc;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Representation of an entry in the open state config data excel
 */
@Data
public class OpenStateData {

    private final int id;

    private final boolean defaultState;

    private final boolean allowClientOpen;

    private final @NotNull List<OpenStateCondition> conditions;

    private final int systemOpenUiId;
}
