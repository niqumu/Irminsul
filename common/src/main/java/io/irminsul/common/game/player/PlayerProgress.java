package io.irminsul.common.game.player;

import io.irminsul.common.game.PlayerManager;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface PlayerProgress extends PlayerManager {

    @NotNull Map<Integer, Boolean> getOpenStates();

    void onLogin();

    void sendOpenStates();
}
