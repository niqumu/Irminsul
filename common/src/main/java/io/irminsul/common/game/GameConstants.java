package io.irminsul.common.game;

import io.irminsul.common.game.world.Position;
import lombok.experimental.UtilityClass;

@UtilityClass
public class GameConstants {

    /**
     * The default spawn location (the beach), as a {@link Position}
     */
    public final Position OVERWORLD_SPAWN = new Position(2747, 194, -1719);

    /**
     * The scene ID of the main world
     */
    public final int OVERWORLD_SCENE = 3;

    /**
     * The avatar ID of the travelers
     */
    public final int MALE_TRAVELER_AVATAR_ID = 10000005;
    public final int FEMALE_TRAVELER_AVATAR_ID = 10000007;
}
