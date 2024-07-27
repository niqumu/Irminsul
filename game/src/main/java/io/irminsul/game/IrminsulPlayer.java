package io.irminsul.game;

import io.irminsul.common.game.GameConstants;
import io.irminsul.common.game.Player;
import io.irminsul.common.game.Session;
import io.irminsul.common.game.world.Position;
import io.irminsul.game.net.packet.PacketPlayerEnterSceneNotify;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class IrminsulPlayer implements Player {

    private final Session session;

    private String nickname = "Traveler";

    private String signature = "";

    private int avatar = 1001;

    private int nameCard = 210001;

    private List<Integer> chatEmojis = new ArrayList<>();

    private Position position = GameConstants.SPAWN;

    private int sceneID = 3; // todo: why 3?

    @Override
    public void enterWorld() {
        new PacketPlayerEnterSceneNotify(this.session, this.sceneID, this.position).send();
    }
}
