package io.irminsul.game.script;

import io.irminsul.common.game.world.Position;
import lombok.Data;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

@Data
public class Group {

    /**
     * Lua Globals instance
     */
    private final Globals globals;

    /**
     * The Lua script of this group
     */
    private final LuaValue script;

    /**
     * Group ID
     */
    private final int id;

    /**
     * Area ID
     */
    private final int area;

    /**
     * Group position
     */
    private final Position position;
}
