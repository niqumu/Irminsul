package io.irminsul.common.game;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class GameServerContainer {

    @Getter
    @Setter
    private GameServer server;
}
