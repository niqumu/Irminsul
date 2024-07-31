package io.irminsul.common.game.player;

import io.irminsul.common.game.Session;
import io.irminsul.common.game.world.Position;
import io.irminsul.common.game.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.List;

// todo javadocs
public interface Player {

    @NotNull
    Session getSession();

    int getUid();

    @NotNull String getNickname();

    void setNickname(@NotNull String nickname);

    @NotNull String getSignature();

    void setSignature(@NotNull String signature);

    int getProfilePicture();

    void setProfilePicture(int profilePicture);

    int getNameCard();

    void setNameCard(int nameCard);

    @NotNull List<Integer> getChatEmojis();

    @NotNull Position getPosition();

    int getSceneID();

    int getEnterSceneToken();

    void setEnterSceneToken(int enterSceneToken);

    @NotNull World getWorld();

    int getPeerId();

    @NotNull PlayerTeamManager getTeamManager();

    void login();
}
