package io.irminsul.game.data.parser;

import com.google.gson.*;
import io.irminsul.common.game.data.avatar.AvatarData;
import io.irminsul.common.game.data.avatar.AvatarSkillDepotData;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// todo ensure the resources exist ahead of time so the server crashes at startup rather than randomly
@UtilityClass
public class AvatarSkillDepotDataParser {

    private final Logger logger = LoggerFactory.getLogger("Avatar Skill Depot Data Parser");

    private final Gson gson = new Gson();

    private final Map<Integer, JsonObject> data = new HashMap<>();
    static {
        try {
            File excelFile = new File("data/client/ExcelBinOutput/AvatarSkillDepotExcelConfigData.json");
            JsonArray avatarExcel = JsonParser.parseString(Files.readString(excelFile.toPath())).getAsJsonArray();

            for (JsonElement element : avatarExcel) {
                if (element.getAsJsonObject().has("id")) {
                    data.put(element.getAsJsonObject().get("id").getAsInt(), element.getAsJsonObject());
                }
            }

            logger.info("Successfully loaded avatar skill depot config excel!");
        } catch (Exception e) {
            logger.warn("Fatal: Failed to load avatar skill depot config excel: {}", e.toString());
            System.exit(1);
        }
    }

    public @NotNull AvatarSkillDepotData parseSkillDepotData(int skillDepotId) {

        JsonObject skillDepotData = data.get(skillDepotId);

        // Ensure that we have data on this skill depot
        if (skillDepotData == null) {
            logger.warn("Skipping parseSkillDepotData request for {} as the excel is missing this ID!", skillDepotId);
            return new AvatarSkillDepotData(); // fallback
        }

        return new AvatarSkillDepotData(
            skillDepotId,
            skillDepotData.has("energySkill") ? skillDepotData.get("energySkill").getAsInt() : 0,
            List.of(gson.fromJson(skillDepotData.get("skills"), Integer[].class)),
            List.of(gson.fromJson(skillDepotData.get("subSkills"), Integer[].class)),
            List.of(gson.fromJson(skillDepotData.get("extraAbilities"), String[].class)),
            List.of(gson.fromJson(skillDepotData.get("talents"), Integer[].class))
        );
    }
}
