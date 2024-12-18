package io.irminsul.game.player;

import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.player.PlayerTeam;
import io.irminsul.common.game.player.PlayerTeamManager;
import io.irminsul.common.game.event.PlayerSwitchAvatarEvent;
import io.irminsul.game.net.packet.PacketAvatarTeamUpdateNotify;
import io.irminsul.game.net.packet.PacketChangeAvatarRsp;
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

    /**
     * Create a new blank/fresh team manager for the provided player
     * @param player The player the team manager is being created for
     */
    public IrminsulPlayerTeamManager(Player player) {
        this.player = player;
        this.teams.add(new IrminsulPlayerTeam(player));
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

    /**
     * Switches the player's current active avatar to the avatar with the provided GUID
     * @param guid The GUID of the avatar to switch to
     */
    @Override
    public void switchActiveAvatar(long guid) {

        // Find the new avatar (thanks mhy for giving GUID and not index...)
        int newIndex = -1;
        for (int avatar = 0; avatar < this.getActiveTeam().getAvatars().size(); avatar++) {
            if (this.getActiveTeam().getAvatars().get(avatar).getGuid() == guid) {
                newIndex = avatar;
                break;
            }
        }

        // Sanity check
        if (newIndex == -1 || newIndex == this.activeAvatarIndex || this.player.getScene() == null) {
            return;
        }

        // Fire PlayerSwitchAvatarEvent event
        PlayerSwitchAvatarEvent event = new PlayerSwitchAvatarEvent(this.player, this.getActiveAvatar(),
            this.getActiveTeam().getAvatars().get(newIndex));
        if (this.player.getServer().getEventBus().postEvent(event)) {
            return;
        }

        // Make the change
        Avatar oldAvatar = this.getActiveAvatar();
        this.activeAvatarIndex = newIndex;
        this.player.getScene().replaceEntity(oldAvatar, this.getActiveAvatar());

        // Respond
        new PacketChangeAvatarRsp(this.player.getSession(), guid).send();
    }

    /**
     * Changes the composition of a party based on a list of avatar GUIDs to use
     *
     * @param teamIndex   The <b>zero-indexed</b> ID of the team to modify
     * @param avatarGuids A list of avatar GUIDs to compose the team of
     */
    @Override
    public void handleSetupTeam(int teamIndex, @NotNull List<Long> avatarGuids) {

        // Team cannot be empty
        if (avatarGuids.isEmpty()) {
            this.getLogger().warn("{} attempted to set team {} to an empty team!", this.player, teamIndex);
            return;
        }

        // Ensure team index is valid
        if (teamIndex < 0 || teamIndex >= this.getTeams().size()) {
            this.getLogger().warn("{} attempted to setup a non-existent team ({})!", this.player, teamIndex);
            return;
        }

        PlayerTeam team = this.getTeams().get(teamIndex);

        // Clear team and add new avatars
        team.getAvatars().clear();
        avatarGuids.forEach(guid -> team.getAvatars().add(this.player.getAvatar(guid)));

        // Inform the client
        new PacketAvatarTeamUpdateNotify(this.player.getSession()).send();
    }
}
