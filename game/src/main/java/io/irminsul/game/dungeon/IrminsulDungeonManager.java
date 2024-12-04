package io.irminsul.game.dungeon;

import io.irminsul.common.event.EventHandler;
import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.data.scene.TransPoint;
import io.irminsul.common.game.dungeon.DungeonManager;
import io.irminsul.common.game.event.PlayerLogoutEvent;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.world.Scene;
import io.irminsul.common.game.world.Teleport;
import io.irminsul.common.proto.EnterTypeOuterClass;
import io.irminsul.common.util.Pair;
import io.irminsul.game.GameConstants;
import io.irminsul.game.data.EnterReason;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

@Getter
public class IrminsulDungeonManager implements DungeonManager {

    /**
     * The {@link GameServer} this system belongs to
     */
    private final GameServer server;

    /**
     * A map of players and a nullable (point, dungeon ID) pair representing their current dungeon
     */
    private final Map<Player, Pair<Integer, Integer>> currentDungeons = new HashMap<>();

    public IrminsulDungeonManager(@NotNull GameServer server) {
        this.server = server;

        // Used for player logout event
        this.getServer().getEventBus().registerSubscriber(this);
    }

    /**
     * Sends the provided player to a new instance of the provided dungeon within their current world
     * @param player  The player to send to a dungeon
     * @param point   The point ID of the requested dungeon's entrance
     * @param dungeon The ID of the requested dungeon
     */
    @Override
    public void enterDungeon(Player player, int point, int dungeon) {
        int sceneId = player.getServer().getDataContainer().getOrLoadDungeonData(dungeon).getSceneId();
        Scene scene = player.getWorld().getOrCreateScene(sceneId);

        // Sanity check
        if (sceneId == 0) {
            this.getLogger().warn("{} attempted to enter dungeon ID {}, but the dungeon is missing data!", player, dungeon);
            return;
        }

        this.getLogger().info("{} is entering dungeon ID {}!", player, dungeon);
        this.currentDungeons.put(player, new Pair<>(point, dungeon));
        player.sendToScene(new Teleport(sceneId, scene.getSpawnPoint(),
            EnterTypeOuterClass.EnterType.ENTER_TYPE_DUNGEON, EnterReason.DUNGEON_ENTER, dungeon));
    }

    /**
     * Sends the provided player back to the overworld from a dungeon
     * @param player The player to send back to the overworld
     * @param point  The point ID of the player's current dungeon's exit
     */
    @Override
    public void quitDungeon(Player player, int point) {
        Scene overworld = player.getWorld().getOrCreateScene(GameConstants.OVERWORLD_SCENE);
        TransPoint dungeonExit = overworld.getSceneData().getTransPoints().get(point);

        // Some older domains don't have exit points. In that case, send the player to the entrance instead
        if (dungeonExit == null) {
            int entrancePoint = this.currentDungeons.get(player).getLeft();
            TransPoint dungeonEntrance = overworld.getSceneData().getTransPoints().get(entrancePoint);

            this.getLogger().info("{} is returning from their dungeon to entrance point {}!", player, entrancePoint);
            this.currentDungeons.remove(player);
            player.sendToScene(new Teleport(overworld.getId(), dungeonEntrance.getTransPosition(),
                EnterTypeOuterClass.EnterType.ENTER_TYPE_BACK, EnterReason.DUNGEON_QUIT));
            return;
        }

        this.getLogger().info("{} is returning from their dungeon to exit point {}!", player, point);
        this.currentDungeons.remove(player);
        player.sendToScene(new Teleport(overworld.getId(), dungeonExit.getTransPosition(),
            EnterTypeOuterClass.EnterType.ENTER_TYPE_BACK, EnterReason.DUNGEON_QUIT));
    }

    @EventHandler
    public void onPlayerLogout(PlayerLogoutEvent event) {

        // When a player disconnects, remove them from a dungeon if they're in one
        if (this.currentDungeons.containsKey(event.getPlayer()) && this.currentDungeons.get(event.getPlayer()) != null) {
            this.getLogger().info("Removing {} from dungeon {} as they disconnected!",
                event.getPlayer(), this.currentDungeons.get(event.getPlayer()).getRight());
            this.currentDungeons.remove(event.getPlayer());
        }
    }
}
