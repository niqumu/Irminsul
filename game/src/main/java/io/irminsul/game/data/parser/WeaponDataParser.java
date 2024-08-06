package io.irminsul.game.data.parser;

import com.google.gson.*;
import io.irminsul.common.game.data.item.WeaponData;
import io.irminsul.common.game.data.item.WeaponProperty;
import io.irminsul.common.game.data.item.WeaponType;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@UtilityClass
public class WeaponDataParser {

    private final Logger logger = LoggerFactory.getLogger("Weapon Data Parser");

    private final Gson gson = new Gson();

    private final Map<Integer, JsonObject> data = new HashMap<>();
    static {
        try {
            File excelFile = new File("data/client/ExcelBinOutput/WeaponExcelConfigData.json");
            JsonArray weaponExcel = JsonParser.parseString(Files.readString(excelFile.toPath())).getAsJsonArray();

            for (JsonElement element : weaponExcel) {
                if (element.getAsJsonObject().has("id")) {
                    data.put(element.getAsJsonObject().get("id").getAsInt(), element.getAsJsonObject());
                }
            }

            logger.info("Successfully loaded weapon data excel!");
        } catch (Exception e) {
            logger.warn("Fatal: Failed to load weapon data excel: {}", e.toString());
            System.exit(1);
        }
    }

    public @NotNull WeaponData parseWeaponData(int weaponId) {

        JsonObject weaponData = data.get(weaponId);

        // Ensure that we have data on this weapon
        if (weaponData == null) {
            logger.warn("SKipped parseWeaponData request for {} as the excel is missing this weapon!", weaponId);
            return new WeaponData(); // fallback
        }

        // Properties
        List<WeaponProperty> properties = new ArrayList<>();
        for (JsonElement element : weaponData.getAsJsonArray("weaponProp")) {
            JsonObject propJson = element.getAsJsonObject();

            properties.add(new WeaponProperty(
                propJson.has("propType") ? propJson.get("propType").getAsString() : "",
                propJson.has("initValue") ? propJson.get("initValue").getAsFloat() : 0,
                propJson.get("type").getAsString()
            ));
        }

        // Skills
        List<Integer> skills = new ArrayList<>(List.of(gson.fromJson(weaponData.get("skillAffix"), Integer[].class)));
        skills.removeIf(e -> e == 0); // why include them in the first place mhy???

        return new WeaponData(
            WeaponType.of(weaponData.get("weaponType").getAsString()),
            weaponData.get("gadgetId").getAsInt(),
            skills,
            properties
        );
    }
}
