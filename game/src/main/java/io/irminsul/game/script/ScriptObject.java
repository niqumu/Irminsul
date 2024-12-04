package io.irminsul.game.script;

import io.irminsul.common.game.world.Position;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public abstract class ScriptObject {

    private final int configId;

    private final @NotNull Position position;

    private final int level;
}
