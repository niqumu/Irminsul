package io.irminsul.game.database;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.database.PlayerData;
import io.irminsul.common.game.database.PlayerDataManager;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class IrminsulPlayerDataManager implements PlayerDataManager {

    /**
     * The {@link GameServer} this system belongs to
     */
    @Getter
    private final GameServer server;

    private final File playerDataDirectory;

    public IrminsulPlayerDataManager(@NotNull GameServer server) {
        this.server = server;
        this.playerDataDirectory = new File(server.getConfig().getRunDirectory(), "player_data");

        // Create the save data directory if it doesn't already exist
        if (this.playerDataDirectory.mkdirs()) {
            this.getLogger().debug("Created save data directory at {}", this.playerDataDirectory.getAbsolutePath());
        }
    }

    /**
     * Saves player data
     * @param data The player data to save
     * @param uid The UID of the player to save data for
     */
    @Override
    public void save(@NotNull PlayerData data, int uid) {
        File saveFile = new File(this.playerDataDirectory, String.valueOf(uid));

        try {
            Files.writeString(saveFile.toPath(), data.exportState().toString());
        } catch (IOException e) {
            this.getLogger().error("Failed to export save data for {}! {}", uid, e.toString());
        }
    }

    /**
     * Loads player data
     * @param uid The UID of the player to load data for
     * @return The loaded player data, or {@code null} if none exists
     */
    @Override
    public @Nullable PlayerData load(int uid) {
        File saveFile = new File(this.playerDataDirectory, String.valueOf(uid));

        // Make sure the save file exists
        if (!saveFile.exists() || !saveFile.isFile()) {
            return null;
        }

        try {
            JsonObject parsedSaveFile = JsonParser.parseString(
                String.join("", Files.readAllLines(saveFile.toPath()))).getAsJsonObject();

            PlayerData playerData = new IrminsulPlayerData(uid);
            playerData.loadState(parsedSaveFile);

            return playerData;
        } catch (IOException e) {
            this.getLogger().error("Failed to load save data for {}! {}", uid, e.toString());
            return null;
        }
    }
}
