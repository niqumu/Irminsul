package io.irminsul.game.player;

import io.irminsul.common.game.GameConstants;
import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.Session;
import io.irminsul.common.game.SessionState;
import io.irminsul.common.game.world.Position;
import io.irminsul.common.game.world.Scene;
import io.irminsul.common.game.world.World;
import io.irminsul.game.avatar.IrminsulAvatar;
import io.irminsul.game.net.packet.PacketAvatarDataNotify;
import io.irminsul.game.net.packet.PacketPlayerDataNotify;
import io.irminsul.game.net.packet.PacketPlayerEnterSceneNotify;
import io.irminsul.game.world.IrminsulWorld;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class IrminsulPlayer implements Player {

    private final Session session;

    private final int uid;

    private final Map<Integer, Integer> properties = new HashMap<>();

    private String nickname = "Traveler";

    private String signature = "Using Irminsul PS";

    private int profilePicture = 1001;

    private int nameCard = 210001;

    private List<Integer> chatEmojis = new ArrayList<>();

    private List<Integer> ownedFlyCloaks = List.of(140001);

    private List<Integer> ownedCostumes = List.of();

    private List<Integer> ownedNameCards = List.of(210001);

    private Position position = GameConstants.OVERWORLD_SPAWN;

    private int sceneId = GameConstants.OVERWORLD_SCENE;

    private int enterSceneToken = 0;

    private World world;

    private int peerId;

    private int lastGuid = 0;

    private List<Avatar> avatars = new ArrayList<>();

    private final IrminsulPlayerTeamManager teamManager;

    public IrminsulPlayer(Session session, int uid) {
        this.session = session;
        this.uid = uid;

        // Create world
        this.world = new IrminsulWorld(this.session.getServer(), this);
        this.session.getServer().getWorlds().add(this.world);
        this.peerId = this.world.getNextPeerId();

        // Add default avatar
        this.avatars.add(new IrminsulAvatar(GameConstants.FEMALE_TRAVELER_AVATAR_ID, this));

        // Create managers
        this.teamManager = new IrminsulPlayerTeamManager(this);
    }

    @Override
    public void login() {

        // Send player data
        new PacketPlayerDataNotify(this.session).send();
        new PacketAvatarDataNotify(this.session).send();

        // Continue the login process
        this.sendToScene(GameConstants.OVERWORLD_SCENE);
        this.session.setState(SessionState.ACTIVE);
    }

    @Override
    public void sendToScene(int sceneId) {
        this.session.getServer().getLogger().info("Sending player {} from scene {} -> {}", this.uid, this.sceneId, sceneId);

        this.enterSceneToken = 1000 + (int) (Math.random() * 10000);

        this.sceneId = sceneId;
        this.world.getScenes().get(sceneId).addPlayer(this);
        new PacketPlayerEnterSceneNotify(this.session, sceneId, this.position).send(); // todo position: should be scene spawn
    }

    @Override
    public @NotNull Scene getScene() {
        return this.world.getScenes().get(this.sceneId);
    }

    @Override
    public long getNextGuid() {
        return ((long) this.getUid() << 32) + ++this.lastGuid;
    }
}
