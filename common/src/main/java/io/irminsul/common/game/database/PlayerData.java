package io.irminsul.common.game.database;

import com.google.gson.JsonArray;
import io.irminsul.common.game.player.PlayerProfile;
import io.irminsul.common.game.world.Position;
import org.jetbrains.annotations.NotNull;

public interface PlayerData extends StateContainer {

    @NotNull PlayerProfile getProfile();

    void setProfile(@NotNull PlayerProfile profile);

    @NotNull Position getPosition();

    void setPosition(@NotNull Position position);

    int getScene();

    void setScene(int scene);

    @NotNull JsonArray getMailbox();

    void setMailbox(@NotNull JsonArray mailbox);
}
