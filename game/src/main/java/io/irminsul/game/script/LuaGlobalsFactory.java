package io.irminsul.game.script;

import io.irminsul.game.script.include.LuaEventType;
import io.irminsul.game.script.include.LuaGadgetState;
import io.irminsul.game.script.include.LuaRegionShape;
import lombok.RequiredArgsConstructor;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.OneArgFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;
import org.luaj.vm2.lib.jse.JsePlatform;

import java.io.File;

@UtilityClass
public class LuaGlobalsFactory {

    /**
     * @return A new Lua {@link Globals} instance, including definitions used by game scripts
     */
    @SuppressWarnings("InstantiationOfUtilityClass")
    public Globals newGlobals(@NotNull File luaBaseDirectory) {
        Globals globals = JsePlatform.standardGlobals();

        // Custom "require" function
        globals.set("require", new RequireFunction(globals, luaBaseDirectory));

        // Game includes
        globals.set("EventType", CoerceJavaToLua.coerce(new LuaEventType()));
        globals.set("GadgetState", CoerceJavaToLua.coerce(new LuaGadgetState()));
        globals.set("RegionShape", CoerceJavaToLua.coerce(new LuaRegionShape()));

        return globals;
    }

    @RequiredArgsConstructor
    private static class RequireFunction extends OneArgFunction {

        private final Globals globals;

        private final File luaBaseDirectory;

        @Override
        public LuaValue call(LuaValue luaValue) {
            String path = luaBaseDirectory.getAbsolutePath() + "/common/%s.lua".formatted(luaValue.tojstring());

            LuaValue script = globals.loadfile(path);
            script.call();

            return LuaValue.NONE;
        }
    }
}
