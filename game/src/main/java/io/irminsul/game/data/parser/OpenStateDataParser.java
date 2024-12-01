package io.irminsul.game.data.parser;

import com.google.gson.*;
import io.irminsul.common.game.data.DataContainer;
import io.irminsul.common.game.data.misc.OpenStateCondition;
import io.irminsul.common.game.data.misc.OpenStateData;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class OpenStateDataParser {

    /**
     * The {@link DataContainer} this parser belongs to
     */
    private final DataContainer parentContainer;

    public @NotNull List<OpenStateData> loadOpenStates() {
        try {
            File excelFile = new File(this.parentContainer.getDataDirectory(), "client/ExcelBinOutput/OpenStateConfigData.json");
            JsonArray stateExcel = JsonParser.parseString(Files.readString(excelFile.toPath())).getAsJsonArray();

            List<OpenStateData> list = new ArrayList<>();

            for (JsonElement element : stateExcel) {
                JsonObject stateObject = element.getAsJsonObject();

                List<OpenStateCondition> conditions = new ArrayList<>();

                for (JsonElement condition : stateObject.getAsJsonArray("cond")) {
                    JsonObject conditionObject = condition.getAsJsonObject();

                    if (!conditionObject.has("condType")) {
                        continue;
                    }

                    conditions.add(new OpenStateCondition(
                        conditionObject.get("condType").getAsString(),
                        conditionObject.get("param").getAsInt(),
                        conditionObject.has("param2") ? conditionObject.get("param2").getAsInt() : 0
                    ));
                }

                list.add(new OpenStateData(
                    stateObject.get("id").getAsInt(),
                    stateObject.has("defaultState"),
                    stateObject.has("allowClientOpen"),
                    conditions,
                    stateObject.has("systeemOpenUidId") ? stateObject.get("systemOpenUiId").getAsInt() : 0
                ));
            }

            return list;
        } catch (Exception e) {
            this.parentContainer.getLogger().error("Fatal: Failed to load open state data excel: {}", e.toString());
            System.exit(1);
            return new ArrayList<>(); // really java?
        }
    }
}
