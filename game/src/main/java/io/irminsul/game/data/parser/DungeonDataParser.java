package io.irminsul.game.data.parser;

import com.google.gson.*;
import io.irminsul.common.game.data.dungeon.DungeonData;
import io.irminsul.common.game.data.weapon.WeaponData;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

@UtilityClass
public class DungeonDataParser {

    private final Logger logger = LoggerFactory.getLogger("Dungeon Data Parser");

    private final Gson gson = new Gson();

    private final Map<Integer, JsonObject> data = new HashMap<>();
    static {
        try {
            File excelFile = new File("data/client/ExcelBinOutput/DungeonExcelConfigData.json");
            JsonArray dungeonExcel = JsonParser.parseString(Files.readString(excelFile.toPath())).getAsJsonArray();

            for (JsonElement element : dungeonExcel) {
                if (element.getAsJsonObject().has("id")) {
                    data.put(element.getAsJsonObject().get("id").getAsInt(), element.getAsJsonObject());
                }
            }

            logger.debug("Successfully loaded dungeon data excel!");
        } catch (Exception e) {
            logger.error("Fatal: Failed to load dungeon data excel: {}", e.toString());
            System.exit(1);
        }
    }

    public @NotNull DungeonData parseDungeonData(int dungeonId) {

        JsonObject dungeonData = data.get(dungeonId);

        // Ensure that we have data on this dungeon
        if (dungeonData == null) {
            logger.warn("Skipped parseDungeonData request for {} as the excel is missing this dungeon!", dungeonId);
            return new DungeonData(); // fallback
        }

        return new DungeonData(
            dungeonData.get("sceneId").getAsInt()
        );
    }
}
