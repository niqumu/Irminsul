package io.irminsul.game.world;

import io.irminsul.game.GameConstants;
import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.property.EntityIdType;
import io.irminsul.common.game.world.Scene;
import io.irminsul.common.game.world.World;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class IrminsulWorld implements World {

    /**
     * The entity id of this entity
     */
    private final int entityId;

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
     * A map of loaded {@link Scene}s in this World, keyed by scene ID
     */
    private final Map<Integer, Scene> scenes = new HashMap<>();

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
        this.entityId = this.getNextEntityId(EntityIdType.MPLEVEL);

        // Add overworld scene
        this.registerScene(new IrminsulScene(this, GameConstants.OVERWORLD_SCENE));

        this.players.add(host);
    }

    /**
     * @return The next free entity ID
     */
    @Override
    public int getNextEntityId(EntityIdType type) {
        return (type.getId() << 24) + ++this.lastEntityId;
    }

    /**
     * @return The next free connection/peer ID
     */
    @Override
    public int getNextPeerId() {
        return ++this.lastPeerId;
    }

    /**
     * Gets a {@link Scene} by its scene ID, creating it if it doesn't already exist
     * @param sceneId The ID of the scene to get
     * @return The scene with the provided ID within this world
     */
    @Override
    public @NotNull Scene getOrCreateScene(int sceneId) {
        if (!this.scenes.containsKey(sceneId)) {
            this.registerScene(new IrminsulScene(this, sceneId));
        }
        return this.scenes.get(sceneId);
    }

    private void registerScene(Scene scene) {
        this.scenes.put(scene.getId(), scene);
    }

    /**
     * Called at a regular interval by the server; update this object in some way
     */
    @Override
    public void tick() {
        this.scenes.values().forEach(Scene::tick);
    }
}
