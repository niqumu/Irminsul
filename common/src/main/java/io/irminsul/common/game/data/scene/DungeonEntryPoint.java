package io.irminsul.common.game.data.scene;

import io.irminsul.common.game.world.Position;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DungeonEntryPoint extends TransPoint {

    private final List<Integer> dungeonIds;

    public DungeonEntryPoint(int areaId, int gadgetId, Position position, Position transPosition,
                             TransPointType type, List<Integer> dungeonIds) {
        super(areaId, gadgetId, position, transPosition, type);
        this.dungeonIds = dungeonIds;
    }
}