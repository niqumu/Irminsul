package io.irminsul.common.game.dungeon;

import io.irminsul.common.game.ServerSystem;
import io.irminsul.common.game.player.Player;

public interface DungeonManager extends ServerSystem {

    /**
     * Sends the provided player to a new instance of the provided dungeon within their current world
     * @param player The player to send to a dungeon
     * @param point The point ID of the requested dungeon's entrance
     * @param dungeon The ID of the requested dungeon
     */
    void enterDungeon(Player player, int point, int dungeon);

    /**
     * Sends the provided player back to the overworld from a dungeon
     * @param player The player to send back to the overworld
     * @param point The point ID of the player's current dungeon's exit
     */
    void quitDungeon(Player player, int point);
}
