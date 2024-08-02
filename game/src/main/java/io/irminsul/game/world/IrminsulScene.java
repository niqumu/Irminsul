package io.irminsul.game.world;

import io.irminsul.common.game.Entity;
import io.irminsul.common.game.data.SceneData;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.world.Scene;
import io.irminsul.common.game.world.World;
import io.irminsul.game.data.DataContainer;
import io.irminsul.game.net.packet.PacketSceneEntityAppearNotify;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class IrminsulScene implements Scene {

    /**
     * The {@link World} that this scene belongs to
     */
    private final World world;

    /**
     * This scene's ID
     */
    private final int id;

    private final SceneData sceneData;

    private final List<Player> players = new ArrayList<>();

    private final List<Entity> entities = new ArrayList<>();

    public IrminsulScene(@NotNull World world, int id) {
        this.world = world;
        this.id = id;
        this.sceneData = DataContainer.getOrLoadSceneData(this.id);
    }

    @Override
    public void addPlayer(@NotNull Player player) {
        player.setSceneId(this.id);
        this.players.add(player);

        this.addEntity(player.getTeamManager().getActiveAvatar());
    }

    @Override
    public void addEntity(@NotNull Entity entity) {
        this.entities.add(entity);
        this.players.forEach(player -> new PacketSceneEntityAppearNotify(player.getSession(), entity).send());
    }

    @Override
    public void removeEntity(@NotNull Entity entity) {
        this.entities.remove(entity);
        // todo broadcast remove packet
    }

    @Override
    public void addEntitiesFor(@NotNull Player player) {
        this.entities.forEach(entity -> new PacketSceneEntityAppearNotify(player.getSession(), entity).send());
    }
}
