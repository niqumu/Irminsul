package io.irminsul.common.game.data;

import io.irminsul.common.game.world.Position;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class SceneData {
    private final @NotNull Position spawn;
}
