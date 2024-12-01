package io.irminsul.game.data.parser;

import com.google.gson.*;
import io.irminsul.common.game.data.DataContainer;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class WeaponCurveDataParser {

    /**
     * The {@link DataContainer} this parser belongs to
     */
    private final DataContainer parentContainer;

    private final Map<Integer, JsonObject> data = new HashMap<>();

    public WeaponCurveDataParser(@NotNull DataContainer parentContainer) {
        this.parentContainer = parentContainer;

        try {
            File excelFile = new File(this.parentContainer.getDataDirectory(),
                "client/ExcelBinOutput/WeaponCurveExcelConfigData.json");
            JsonArray curveExcel = JsonParser.parseString(Files.readString(excelFile.toPath())).getAsJsonArray();

            for (JsonElement element : curveExcel) {
                if (element.getAsJsonObject().has("level")) {
                    data.put(element.getAsJsonObject().get("level").getAsInt(), element.getAsJsonObject());
                }
            }

            this.parentContainer.getLogger().debug("Successfully loaded weapon curve excel!");
        } catch (Exception e) {
            this.parentContainer.getLogger().error("Fatal: Failed to load weapon curve excel: {}", e.toString());
            System.exit(1);
        }
    }

    // This is extremely heavy and slow because the way I'm storing weapon curve data (curve -> (level -> multiplier))
    // is the exact opposite of how it's stored in the data (level -> (curve -> multiplier)), so we have to iterate over
    // the entire thing to build this information. I still think it's better to store curves this way.
    public @NotNull Map<Integer, Float> parseWeaponCurve(String curveType) {
        Map<Integer, Float> map = new HashMap<>();

        for (int level = 1; level <= 100; level++) {
            map.put(level, getMultiplier(curveType, level));
        }

        return map;
    }

    private float getMultiplier(String curveType, int level) {
        JsonObject levelData = data.get(level);

        // Sanity check
        if (levelData == null) {
            this.parentContainer.getLogger().warn("Skipping parseWeaponCurve request for {} as the excel is " +
                "missing data for the provided level of {}", curveType, level);
            return 1; // fallback
        }

        // Iterate over curve -> multiplier entries to find this curve
        for (JsonElement curve : levelData.getAsJsonArray("curveInfos")) {
            if (curve.getAsJsonObject().get("type").getAsString().equals(curveType)) {
                return curve.getAsJsonObject().get("value").getAsFloat();
            }
        }

        return 1; // fallback
    }
}
