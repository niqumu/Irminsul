package io.irminsul.common.game;

import org.jetbrains.annotations.NotNull;

import java.util.List;

// todo javadocs
public interface Player {

    @NotNull String getNickname();

    void setNickname(@NotNull String nickname);

    @NotNull String getSignature();

    void setSignature(@NotNull String signature);

    int getAvatar();

    void setAvatar(int avatar);

    int getNameCard();

    void setNameCard(int nameCard);

    List<Integer> getChatEmojis();
}
