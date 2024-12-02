package io.irminsul.common.game.database;

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
}
