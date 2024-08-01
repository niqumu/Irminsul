package io.irminsul.game.player;

import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.player.PlayerTeam;
import io.irminsul.common.game.player.PlayerTeamManager;
import io.irminsul.game.avatar.IrminsulAvatar;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@Getter
public class IrminsulPlayerTeamManager implements PlayerTeamManager {

    /**
     * The {@link Player} this manager belongs to
     */
    private final Player player;

    /**
     * A list of teams this manager's player has
     */
    private final List<PlayerTeam> teams = new ArrayList<>();

    /**
     * The index of the currently active team within the list of teams
     */
    private int activeTeamIndex = 0;

    /**
     * The index of the currently active avatar within the team
     */
    private int activeAvatarIndex = 0;

    public IrminsulPlayerTeamManager(Player player) {
        this.player = player;
        this.teams.add(new IrminsulPlayerTeam(player));
        this.getActiveTeam().getAvatars().add(player.getAvatars().getFirst());
    }

    /**
     * @return The player's currently active team
     */
    @Override
    public @NotNull PlayerTeam getActiveTeam() {
        return this.teams.get(activeTeamIndex);
    }

    /**
     * @return The player's active avatar
     */
    @Override
    public @NotNull Avatar getActiveAvatar() {
        return this.getActiveTeam().getAvatars().get(this.activeAvatarIndex);
    }
}