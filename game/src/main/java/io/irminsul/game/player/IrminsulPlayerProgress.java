package io.irminsul.game.player;

import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.player.PlayerProgress;
import io.irminsul.game.data.OpenStateData;
import io.irminsul.game.net.packet.PacketOpenStateUpdateNotify;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class IrminsulPlayerProgress implements PlayerProgress {

    /**
     * The {@link Player} this manager belongs to
     */
    private final Player player;

    private final Map<Integer, Boolean> openStates = new HashMap<>();

    public IrminsulPlayerProgress(Player player) {
        this.player = player;

        // Load and send default open states
        OpenStateData.DEFAULT_OPEN_STATES.forEach(state -> this.openStates.put(state, true));
    }

    @Override
    public void onLogin() {
        this.sendOpenStates();
    }

    @Override
    public void sendOpenStates() {
        new PacketOpenStateUpdateNotify(this.player.getSession(), this.openStates).send();
    }
}
