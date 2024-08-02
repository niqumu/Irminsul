package io.irminsul.game.player;

import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.player.PlayerTeam;
import io.irminsul.common.game.property.EntityIdType;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class IrminsulPlayerTeam implements PlayerTeam {

    /**
     * The name of the team
     */
    private String name;

    /**
     * The player that this team belongs to
     */
    private final Player owner;

    /**
     * A list of avatars on the team
     */
    private final List<Avatar> avatars = new ArrayList<>();

    private final int entityId;

    public IrminsulPlayerTeam(Player owner) {
        this.owner = owner;
        this.entityId = this.owner.getWorld().getNextEntityId(EntityIdType.TEAM);
    }
}
