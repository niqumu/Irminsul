package io.irminsul.common.game.database;

import io.irminsul.common.game.ServerSystem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface PlayerDataManager extends ServerSystem {

    /**
     * Saves player data
     * @param data The player data to save
     * @param uid The UID of the player to save data for
     */
    void save(@NotNull PlayerData data, int uid);

    /**
     * Loads player data
     * @param uid The UID of the player to load data for
     * @return The loaded player data, or {@code null} if none exists
     */
    @Nullable PlayerData load(int uid);
}
