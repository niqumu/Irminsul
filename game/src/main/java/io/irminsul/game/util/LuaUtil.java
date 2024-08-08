package io.irminsul.game.util;

import io.irminsul.common.game.world.Position;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.luaj.vm2.LuaValue;

@UtilityClass
public class LuaUtil {

    public @NotNull Position positionFromTable(@NotNull LuaValue pos, @Nullable LuaValue rot) {
        Position position = Position.ORIGIN();
        position.setX(pos.get("x").tofloat());
        position.setY(pos.get("y").tofloat());
        position.setZ(pos.get("z").tofloat());

        if (rot != null) {
            position.setXRot(rot.get("x").tofloat());
            position.setYRot(rot.get("y").tofloat());
            position.setZRot(rot.get("z").tofloat());
        }

        return position;
    }
}
