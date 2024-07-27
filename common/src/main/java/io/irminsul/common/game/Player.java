package io.irminsul.common.game;

import io.irminsul.common.game.world.Position;
import org.jetbrains.annotations.NotNull;

import java.util.List;

// todo javadocs
public interface Player {

    @NotNull Session getSession();

    @NotNull String getNickname();

    void setNickname(@NotNull String nickname);

    @NotNull String getSignature();

    void setSignature(@NotNull String signature);

    int getAvatar();

    void setAvatar(int avatar);

    int getNameCard();

    void setNameCard(int nameCard);

    @NotNull List<Integer> getChatEmojis();

    @NotNull Position getPosition();

    int getSceneID();

    int getEnterSceneToken();

    void setEnterSceneToken(int enterSceneToken);

    void enterWorld();
}
