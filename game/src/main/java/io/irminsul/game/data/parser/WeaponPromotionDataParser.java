package io.irminsul.game.data.parser;

import com.google.gson.*;
import io.irminsul.common.game.data.DataContainer;
import io.irminsul.common.game.data.weapon.WeaponPromotionData;
import io.irminsul.common.game.data.weapon.WeaponProperty;
import io.irminsul.common.util.Pair;
import io.irminsul.game.data.FightProperty;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeaponPromotionDataParser {

    /**
     * The {@link DataContainer} this parser belongs to
     */
    private final DataContainer parentContainer;

    private final Map<Integer, Map<Integer, JsonObject>> data = new HashMap<>();

    public WeaponPromotionDataParser(@NotNull DataContainer parentContainer) {
        this.parentContainer = parentContainer;

        try {
            File excelFile = new File(this.parentContainer.getDataDirectory(),
                "client/ExcelBinOutput/WeaponPromoteExcelConfigData.json");
            JsonArray promoteExcel = JsonParser.parseString(Files.readString(excelFile.toPath())).getAsJsonArray();

            for (JsonElement element : promoteExcel) {
                JsonObject object = element.getAsJsonObject();

                int weaponId = object.get("weaponPromoteId").getAsInt();
                int promoteLevel = object.has("promoteLevel") ? object.get("promoteLevel").getAsInt() : 0;

                if (!data.containsKey(weaponId)) {
                    data.put(weaponId, new HashMap<>());
                }

                data.get(weaponId).put(promoteLevel, object);
            }

            this.parentContainer.getLogger().debug("Successfully loaded weapon promotion excel!");
        } catch (Exception e) {
            this.parentContainer.getLogger().error("Fatal: Failed to load weapon promotion excel: {}", e.toString());
            System.exit(1);
        }
    }

    public @NotNull Map<Integer, WeaponPromotionData> parsePromotionData(int weaponId) {
        Map<Integer, WeaponPromotionData> map = new HashMap<>();

        if (!data.containsKey(weaponId)) {
            this.parentContainer.getLogger().warn("Skipping parsePromotionData request for {} as the excel is missing this weapon!", weaponId);
            return map; // fallback
        }

        data.get(weaponId).forEach((k, v) -> {

            // Properties
            List<WeaponProperty> properties = new ArrayList<>();
            for (JsonElement element : v.getAsJsonArray("addProps")) {
                JsonObject propJson = element.getAsJsonObject();

                if (!propJson.has("value")) {
                    continue;
                }

                properties.add(new WeaponProperty(
                    FightProperty.of(propJson.get("propType").getAsString()),
                    propJson.get("value").getAsFloat(),
                    null
                ));
            }

            // Item cost
            List<Pair<Integer, Integer>> costItems = new ArrayList<>();
            for (JsonElement element : v.getAsJsonArray("costItems")) {
                JsonObject costJson = element.getAsJsonObject();

                if (!costJson.has("id")) {
                    continue;
                }

                costItems.add(new Pair<>(costJson.get("id").getAsInt(), costJson.get("count").getAsInt()));
            }

            map.put(k, new WeaponPromotionData(
                properties,
                v.has("coinCost") ? v.get("coinCost").getAsInt() : 0,
                costItems
            ));
        });

        return map;
    }
}
