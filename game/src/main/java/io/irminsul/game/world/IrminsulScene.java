package io.irminsul.game.world;

import io.irminsul.common.game.Entity;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.world.Scene;
import io.irminsul.common.game.world.World;
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

    private final List<Player> players = new ArrayList<>();

    private int lastEntityId = 0;

    /**
     * @return The next free entity ID
     */
    @Override
    public int getNextEntityId() {
        return ++this.lastEntityId;
    }

    @Override
    public void addPlayer(@NotNull Player player) {
        player.setSceneId(this.id);
        this.players.add(player);

        this.addEntity(player.getTeamManager().getActiveAvatar());
    }

    @Override
    public void addEntity(@NotNull Entity entity) {
        this.players.forEach(player -> new PacketSceneEntityAppearNotify(player.getSession(), entity).send());
    }
}
