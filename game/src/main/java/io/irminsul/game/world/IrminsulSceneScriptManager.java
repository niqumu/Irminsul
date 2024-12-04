package io.irminsul.game.world;

import io.irminsul.common.game.data.DataContainer;
import io.irminsul.common.game.world.Position;
import io.irminsul.common.game.world.Scene;
import io.irminsul.common.game.world.SceneScriptManager;
import io.irminsul.game.script.Block;
import io.irminsul.game.script.Group;
import io.irminsul.game.script.LuaGlobalsFactory;
import io.irminsul.game.script.object.Gadget;
import io.irminsul.game.util.LuaUtil;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.HashMap;

@Getter
public class IrminsulSceneScriptManager implements SceneScriptManager {

    /**
     * The {@link Scene} that this script manager belongs to
     */
    private final Scene scene;

    /**
     * The base path of all scripts in this scene
     */
    private final String scriptPathBase;

    /**
     * Lua Globals instance of the main scene script
     */
    private final Globals globals;

    /**
     * The main scene script
     */
    private final LuaValue mainScript;

    /**
     * A map of loaded blocks in this scene, keyed by ID
     */
    private final HashMap<Integer, Block> loadedBlocks = new HashMap<>();

    /**
     * A list of loaded groups in this scene, keyed by ID
     */
    private final HashMap<Integer, Group> loadedGroups = new HashMap<>();

    private final DataContainer dataContainer;

    public IrminsulSceneScriptManager(@NotNull Scene scene, @NotNull DataContainer dataContainer) {
        this.scene = scene;
        this.dataContainer = dataContainer;
        this.scriptPathBase = dataContainer.getDataDirectory().getAbsolutePath() +
            "/lua/scene/" + scene.getId() + "/scene" + scene.getId();

        this.globals = LuaGlobalsFactory.newGlobals(new File(this.dataContainer.getDataDirectory(), "lua"));

        // Load and call main script
        this.mainScript = this.globals.loadfile(this.scriptPathBase + ".lua");
        this.mainScript.call();

        // Disabled until I'm finished, as it crashes in this state
        // Load blocks (recursively loads groups)
        if (scene.getId() == 40501) { // artifact domain near beach
            LuaValue blocks = this.globals.get("blocks");
            for (int i = 0; i < blocks.length(); i++) {
                this.loadBlock(blocks.get(i + 1).toint());
            }
        }

        // Done
        this.dataContainer.getLogger().info("Finished loading scripts for scene {} - loaded {} blocks with {} groups in total!",
            this.scene.getId(), this.loadedBlocks.size(), this.loadedGroups.size());
    }

    /**
     * @return The spawn point of the scene, as derived from the scene's main script
     */
    @Override
    public @NotNull Position getSceneSpawn() {
        LuaValue sceneConfig = this.globals.get("scene_config");
        return LuaUtil.positionFromTable(sceneConfig.get("born_pos"), sceneConfig.get("born_rot"));
    }

    /**
     * Loads the provided block and its defined groups
     * @param id The ID of the block to load
     */
    private void loadBlock(int id) {

        // Load block
        Globals blockGlobals = LuaGlobalsFactory.newGlobals(new File(this.dataContainer.getDataDirectory(), "lua"));
        LuaValue blockScript = blockGlobals.loadfile(this.scriptPathBase + "_block" + id + ".lua");
        blockScript.call();
        this.loadedBlocks.put(id, new Block(blockGlobals, blockScript, id));

        // Load groups
        LuaValue groups = blockGlobals.get("groups");
        for (int i = 0; i < groups.length(); i++) {
            this.loadGroup(groups.get(i + 1));
        }
    }

    /**
     * Loads the provided group
     * @param groupTable The Lua table describing the group to load
     */
    private void loadGroup(LuaValue groupTable) {
        int id = groupTable.get("id").toint();
        int area = groupTable.get("id").toint(0);
        Position position = LuaUtil.positionFromTable(groupTable.get("pos"), null);

        Globals groupGlobals = LuaGlobalsFactory.newGlobals(new File(this.dataContainer.getDataDirectory(), "lua"));
        LuaValue groupScript = groupGlobals.loadfile(this.scriptPathBase + "_group" + id + ".lua");
        groupScript.call();

        Group group = new Group(groupGlobals, groupScript, id, area, position);

        // ================================
        // OBJECTS
        // ================================

        // Gadgets
        LuaValue gadgets = groupGlobals.get("gadgets");
        for (int i = 0; i < gadgets.length(); i++) {
            group.getGadgets().put(gadgets.get(i + 1).get("config_id").toint(), new Gadget(gadgets.get(i + 1)));
        }

        // Done
        this.loadedGroups.put(id, group);
    }
}
