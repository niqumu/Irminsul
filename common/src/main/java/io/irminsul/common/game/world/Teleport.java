package io.irminsul.common.game.world;

import io.irminsul.common.proto.EnterTypeOuterClass.EnterType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teleport {

    private final int scene;

    private final Position position;

    private final EnterType enterType;

    private final int enterReason;

    private final int destinationDungeon;

    public Teleport(int scene, Position position) {
        this(scene, position, EnterType.ENTER_TYPE_SELF, 0, 0);
    }

    public Teleport(int scene, Position position, EnterType enterType, int enterReason) {
        this(scene, position, enterType, enterReason, 0);
    }
}
