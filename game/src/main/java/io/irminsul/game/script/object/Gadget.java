package io.irminsul.game.script.object;

import io.irminsul.common.game.world.Position;
import io.irminsul.game.script.ScriptObject;
import lombok.Getter;
import lombok.ToString;
import org.luaj.vm2.LuaValue;

@Getter
@ToString
public class Gadget extends ScriptObject {

    private final int gadgetId;

    private final int state;

    public Gadget(LuaValue value) {
        super(
            value.get("config_id").toint(),
            new Position(
                value.get("pos").get("x").tofloat(),
                value.get("pos").get("y").tofloat(),
                value.get("pos").get("z").tofloat(),
                value.get("rot").get("x").tofloat(),
                value.get("rot").get("y").tofloat(),
                value.get("rot").get("z").tofloat()
            ),
            value.get("level").toint()
        );

        this.gadgetId = value.get("gadget_id").toint();
        this.state = value.get("state").toint();
    }
}
