package io.irminsul.common.game;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.UtilityClass;

// TODO: pretty urgently get rid of this. irminsul is designed to not be monolithic/static in any way, and this ruins
// that by forcing a single instance
@UtilityClass
public class GameServerContainer {

    @Getter
    @Setter
    private GameServer server;
}
