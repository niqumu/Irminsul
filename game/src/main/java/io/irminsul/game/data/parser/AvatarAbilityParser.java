package io.irminsul.game.data.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Files;
import java.util.*;

@UtilityClass
public class AvatarAbilityParser {

    private final Logger logger = LoggerFactory.getLogger("Avatar Ability Parser");

    private final Map<String, JsonArray> data = new HashMap<>();
    static {
        String name = "";
        try {
            File excelDirectory = new File("data/client/BinOutput/Ability/Temp/AvatarAbilities");
            if (!excelDirectory.exists() || !excelDirectory.isDirectory()) {
                logger.error("Fatal: Missing AvatarAbilities directory!");
                System.exit(1);
            }

            for (File file : Objects.requireNonNull(excelDirectory.listFiles())) {
                name = file.getName().substring("ConfigAbility_Avatar_".length(),
                    file.getName().length() - ".json".length());
                data.put(name, JsonParser.parseString(Files.readString(file.toPath())).getAsJsonArray());
            }

            logger.info("Successfully loaded {} avatar ability excels!", data.size());
        } catch (Exception e) {
            logger.error("Fatal: Failed to load {}'s avatar ability excel: {}", name, e.toString());
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
            logger.warn("Skipping parseAvatarAbilities request for {} as the excels are missing this avatar!", avatarName);
            return List.of(); // fallback
        }

        ArrayList<String> list = new ArrayList<>();

        for (JsonElement element : data.get(avatarName)) {
            JsonObject defaultObj = element.getAsJsonObject().getAsJsonObject("Default");
            String abilityName = defaultObj.get("abilityName").toString();

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
