package io.irminsul.game.data.parser;

import com.google.gson.*;
import io.irminsul.common.game.data.avatar.AvatarData;
import io.irminsul.game.data.DataContainer;
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
public class AvatarDataParser {

    private final Logger logger = LoggerFactory.getLogger("Avatar Data Parser");

    private final Gson gson = new Gson();

    private final Map<Integer, JsonObject> data = new HashMap<>();
    static {
        try {
            File excelFile = new File("data/client/ExcelBinOutput/AvatarExcelConfigData.json");
            JsonArray avatarExcel = JsonParser.parseString(Files.readString(excelFile.toPath())).getAsJsonArray();

            for (JsonElement element : avatarExcel) {
                if (element.getAsJsonObject().has("id")) {
                    data.put(element.getAsJsonObject().get("id").getAsInt(), element.getAsJsonObject());
                }
            }

            logger.debug("Successfully loaded avatar config excel!");
        } catch (Exception e) {
            logger.warn("Fatal: Failed to load avatar config excel: {}", e.toString());
            System.exit(1);
        }
    }

    public @NotNull AvatarData parseAvatarData(int avatarId) {

        JsonObject avatarData = data.get(avatarId);

        // Ensure that we have data on this avatar
        if (avatarData == null) {
            logger.warn("Skipping parseAvatarData request for {} as the excel is missing this avatar!", avatarId);
           return new AvatarData(); // fallback
        }

        String name = avatarData.get("iconName").getAsString().substring("UI_AvatarIcon_".length());

        return new AvatarData(
            name,
            avatarData.get("initialWeapon").getAsInt(),
            DataContainer.getOrLoadSkillDepotData(avatarData.get("skillDepotId").getAsInt()),
            List.of(gson.fromJson(avatarData.get("candSkillDepotIds"), Integer[].class)),
            avatarData.get("hpBase").getAsFloat(),
            avatarData.get("attackBase").getAsFloat(),
            avatarData.get("defenseBase").getAsFloat(),
            avatarData.get("critical").getAsFloat(),
            avatarData.get("criticalHurt").getAsFloat(),
            DataContainer.getOrLoadAbilities(name)
        );
    }
}
