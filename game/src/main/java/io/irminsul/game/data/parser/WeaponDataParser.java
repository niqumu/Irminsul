package io.irminsul.game.data.parser;

import com.google.gson.*;
import io.irminsul.common.game.data.DataContainer;
import io.irminsul.common.game.data.weapon.WeaponData;
import io.irminsul.common.game.data.weapon.WeaponProperty;
import io.irminsul.common.game.data.weapon.WeaponType;
import io.irminsul.game.data.FightProperty;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeaponDataParser {

    /**
     * The {@link DataContainer} this parser belongs to
     */
    private final DataContainer parentContainer;

    private final Gson gson = new Gson();

    private final Map<Integer, JsonObject> data = new HashMap<>();

    public WeaponDataParser(@NotNull DataContainer parentContainer) {
        this.parentContainer = parentContainer;

        try {
            File excelFile = new File(this.parentContainer.getDataDirectory(), "client/ExcelBinOutput/WeaponExcelConfigData.json");
            JsonArray weaponExcel = JsonParser.parseString(Files.readString(excelFile.toPath())).getAsJsonArray();

            for (JsonElement element : weaponExcel) {
                if (element.getAsJsonObject().has("id")) {
                    data.put(element.getAsJsonObject().get("id").getAsInt(), element.getAsJsonObject());
                }
            }

            this.parentContainer.getLogger().debug("Successfully loaded weapon data excel!");
        } catch (Exception e) {
            this.parentContainer.getLogger().error("Fatal: Failed to load weapon data excel: {}", e.toString());
            System.exit(1);
        }
    }

    public @NotNull WeaponData parseWeaponData(int weaponId) {

        JsonObject weaponData = data.get(weaponId);

        // Ensure that we have data on this weapon
        if (weaponData == null) {
            this.parentContainer.getLogger().warn("Skipped parseWeaponData request for {} as the excel is missing this weapon!", weaponId);
            return new WeaponData(); // fallback
        }

        // Properties
        List<WeaponProperty> properties = new ArrayList<>();
        for (JsonElement element : weaponData.getAsJsonArray("weaponProp")) {
            JsonObject propJson = element.getAsJsonObject();

            if (!propJson.has("initValue")) {
                // everything is multiplicative; if there's no base value, skip this property
                // (why include them in the first place then??? we may never know...)
                continue;
            }

            properties.add(new WeaponProperty(
                FightProperty.of(propJson.get("propType").getAsString()),
                propJson.get("initValue").getAsFloat(),
                propJson.get("type").getAsString()
            ));
        }

        // Skills
        List<Integer> skills = new ArrayList<>(List.of(gson.fromJson(weaponData.get("skillAffix"), Integer[].class)));
        skills.removeIf(e -> e == 0); // why include them in the first place mhy???

        return new WeaponData(
            WeaponType.of(weaponData.get("weaponType").getAsString()),
            weaponData.get("rankLevel").getAsInt() > 2 ? 90 : 70,
            weaponData.get("gadgetId").getAsInt(),
            skills,
            properties
        );
    }
}
