package io.irminsul.game.player;

import io.irminsul.common.game.GameConstants;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.Session;
import io.irminsul.common.game.SessionState;
import io.irminsul.common.game.world.Position;
import io.irminsul.common.game.world.World;
import io.irminsul.game.net.packet.PacketPlayerEnterSceneNotify;
import io.irminsul.game.world.IrminsulWorld;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class IrminsulPlayer implements Player {

    private final Session session;

    private final int uid;

    private String nickname = "Traveler";

    private String signature = "Using Irminsul PS";

    private int profilePicture = 1001;

    private int nameCard = 210001;

    private List<Integer> chatEmojis = new ArrayList<>();

    private Position position = GameConstants.SPAWN;

    private int sceneID = 3; // todo: why 3?

    private int enterSceneToken = 0;

    private World world;

    private int peerId;

    /**
     * Managers
     */
    private final IrminsulPlayerTeamManager teamManager;

    public IrminsulPlayer(Session session, int uid) {
        this.session = session;
        this.uid = uid;

        // Create world
        this.world = new IrminsulWorld(this.session.getServer(), this);
        this.session.getServer().getWorlds().add(this.world);
        this.peerId = this.world.getNextPeerId();

        this.teamManager = new IrminsulPlayerTeamManager(this);
    }

    @Override
    public void login() {

        // Continue the login process
        new PacketPlayerEnterSceneNotify(this.session, this.sceneID, this.position).send();
        this.session.setState(SessionState.ACTIVE);
    }
}
