package io.irminsul.common.game.data.scene;

import io.irminsul.common.game.world.Position;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class DungeonExitPoint extends TransPoint {

    public DungeonExitPoint(int areaId, int gadgetId, Position position, Position transPosition) {
        super(areaId, gadgetId, position, transPosition, TransPointType.DUNGEON_EXIT);
    }
}