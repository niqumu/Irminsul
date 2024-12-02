package io.irminsul.common.game.player;

import io.irminsul.common.game.PlayerSystem;
import io.irminsul.common.game.avatar.Avatar;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.List;

public interface PlayerTeamManager extends PlayerSystem {

    /**
     * @return A list of teams this manager's player has
     */
    @NotNull List<PlayerTeam> getTeams();

    /**
     * @return The index of the currently active team within the list of teams
     */
    int getActiveTeamIndex();

    /**
     * @return The player's currently active team
     */
    @NotNull PlayerTeam getActiveTeam();

    /**
     * @return The index of the currently active avatar within the team
     */
    int getActiveAvatarIndex();

    /**
     * @return The player's active avatar
     */
    @NotNull Avatar getActiveAvatar();

    /**
     * Switches the player's current active avatar to the avatar with the provided GUID
     * @param guid The GUID of the avatar to switch to
     */
    void switchActiveAvatar(long guid);

    /**
     * Changes the composition of a party based on a list of avatar GUIDs to use
     * @param teamIndex The <b>zero-indexed</b> ID of the team to modify
     * @param avatarGuids A list of avatar GUIDs to compose the team of
     */
    void handleSetupTeam(int teamIndex, @NotNull List<Long> avatarGuids);
}
