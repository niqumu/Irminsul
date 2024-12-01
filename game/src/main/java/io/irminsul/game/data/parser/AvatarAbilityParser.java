package io.irminsul.game.data.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.irminsul.common.game.data.DataContainer;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.nio.file.Files;
import java.util.*;

public class AvatarAbilityParser {

    /**
     * The {@link DataContainer} this parser belongs to
     */
    private final DataContainer parentContainer;

    private final Map<String, JsonArray> data = new HashMap<>();


    public AvatarAbilityParser(@NotNull DataContainer parentContainer) {
        this.parentContainer = parentContainer;

        String name = "";
        try {
            File excelDirectory = new File(this.parentContainer.getDataDirectory(),
                "client/BinOutput/Ability/Temp/AvatarAbilities");

            if (!excelDirectory.exists() || !excelDirectory.isDirectory()) {
                this.parentContainer.getLogger().error("Fatal: Missing AvatarAbilities directory!");
                System.exit(1);
            }

            for (File file : Objects.requireNonNull(excelDirectory.listFiles())) {
                name = file.getName().substring("ConfigAbility_Avatar_".length(),
                    file.getName().length() - ".json".length());
                data.put(name, JsonParser.parseString(Files.readString(file.toPath())).getAsJsonArray());
            }

            this.parentContainer.getLogger().debug("Successfully loaded {} avatar ability excels!", data.size());
        } catch (Exception e) {
            this.parentContainer.getLogger().error("Fatal: Failed to load {}'s avatar ability excel: {}", name, e.toString());
            System.exit(1);
        }
    }

    public @NotNull List<String> parseAvatarAbilities(String avatarName) {

        String originalAvatarName = avatarName;
        if (avatarName.equals("PlayerGirl") || avatarName.equals("PlayerBoy")) {
            avatarName = "Player_Common"; // TODO: elements
        }

        // Ensure that we have data on this avatar
        if (!data.containsKey(avatarName)) {
            this.parentContainer.getLogger().warn("Skipping parseAvatarAbilities request for {} as the excels are missing this avatar!", avatarName);
            return List.of(); // fallback
        }

        ArrayList<String> list = new ArrayList<>();

        for (JsonElement element : data.get(avatarName)) {
            JsonObject defaultObj = element.getAsJsonObject().getAsJsonObject("Default");
            String abilityName = defaultObj.get("abilityName").getAsString();

            // Stupid thing I have to do to avoid duplicate abilities on the traveler
            if ((originalAvatarName.equals("PlayerGirl") && abilityName.contains("PlayerBoy")) ||
                    (originalAvatarName.equals("PlayerBoy") && abilityName.contains("PlayerGirl"))) {
                continue;
            }

            list.add(abilityName);
        }

        return list;
    }
}
