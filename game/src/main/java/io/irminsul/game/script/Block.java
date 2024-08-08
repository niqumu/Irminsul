package io.irminsul.game.script;

import lombok.Data;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

@Data
public class Block {

    /**
     * Lua Globals instance
     */
    private final Globals globals;

    /**
     * The Lua script of this block
     */
    private final LuaValue script;

    /**
     * Block ID
     */
    private final int id;
}
