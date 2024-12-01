package io.irminsul.game.data.parser;

import com.google.gson.*;
import io.irminsul.common.game.data.DataContainer;
import io.irminsul.common.game.data.dungeon.DungeonData;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class DungeonDataParser {

    /**
     * The {@link DataContainer} this parser belongs to
     */
    private final DataContainer parentContainer;

    private final Map<Integer, JsonObject> data = new HashMap<>();

    public DungeonDataParser(@NotNull DataContainer parentContainer) {
        this.parentContainer = parentContainer;

        try {
            File excelFile = new File(this.parentContainer.getDataDirectory(), "client/ExcelBinOutput/DungeonExcelConfigData.json");
            JsonArray dungeonExcel = JsonParser.parseString(Files.readString(excelFile.toPath())).getAsJsonArray();

            for (JsonElement element : dungeonExcel) {
                if (element.getAsJsonObject().has("id")) {
                    data.put(element.getAsJsonObject().get("id").getAsInt(), element.getAsJsonObject());
                }
            }

            this.parentContainer.getLogger().debug("Successfully loaded dungeon data excel!");
        } catch (Exception e) {
            this.parentContainer.getLogger().error("Fatal: Failed to load dungeon data excel: {}", e.toString());
            System.exit(1);
        }
    }

    public @NotNull DungeonData parseDungeonData(int dungeonId) {

        JsonObject dungeonData = data.get(dungeonId);

        // Ensure that we have data on this dungeon
        if (dungeonData == null) {
            this.parentContainer.getLogger().warn("Skipped parseDungeonData request for {} as the excel is missing this dungeon!", dungeonId);
            return new DungeonData(); // fallback
        }

        return new DungeonData(
            dungeonData.get("sceneId").getAsInt()
        );
    }
}
