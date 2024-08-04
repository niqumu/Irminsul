package io.irminsul.game.player;

import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.player.PlayerTeam;
import io.irminsul.common.game.player.PlayerTeamManager;
import io.irminsul.game.net.packet.PacketChangeAvatarRsp;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

@Getter
public class IrminsulPlayerTeamManager implements PlayerTeamManager {

    @Serial
    private final static long serialVersionUID = 1;

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

        // Make the change
        Avatar oldAvatar = this.getActiveAvatar();
        this.activeAvatarIndex = newIndex;
        this.player.getScene().replaceEntity(oldAvatar, this.getActiveAvatar());

        // Respond
        new PacketChangeAvatarRsp(this.player.getSession(), guid).send();
    }
}
