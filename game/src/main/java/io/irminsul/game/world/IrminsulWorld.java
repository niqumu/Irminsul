package io.irminsul.game.world;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.world.World;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class IrminsulWorld implements World {

    /**
     * The {@link GameServer} that this world belongs to
     */
    private final GameServer server;

    /**
     * The {@link Player} hosting this world
     */
    private final Player host;

    /**
     * A list of {@link Player}s in this world
     */
    private final List<Player> players = new ArrayList<>();

    /**
     * Whether this world is mutiplayer
     */
    private boolean multiplayer = false;

    /**
     * The world level of this world
     */
    private int worldLevel = 1;

    /**
     * Whether this world is currently paused/frozen
     */
    private boolean paused = false;

    private int lastEntityId = 0;

    private int lastPeerId = 0;

    public IrminsulWorld(GameServer server, Player host) {
        this.server = server;
        this.host = host;

        this.players.add(host);
    }

    /**
     * @return The next free entity ID
     * TODO: this should be per scene!
     */
    @Override
    public int getNextEntityId() {
        return ++this.lastEntityId;
    }

    /**
     * @return The next free connection/peer ID
     */
    @Override
    public int getNextPeerId() {
        return ++this.lastPeerId;
    }
}
