package io.irminsul.common.game.player;

import io.irminsul.common.game.avatar.Avatar;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface PlayerTeamManager {

    /**
     * @return The {@link Player} this manager belongs to
     */
    @NotNull Player getPlayer();

    /**
     * @return A list of teams this manager's player has
     */
    @NotNull List<PlayerTeam> getTeams();

    /**
     * @return The player's currently active team
     */
    @NotNull PlayerTeam getActiveTeam();

    /**
     * @return The player's active avatar
     */
    @NotNull Avatar getActiveAvatar();
}
