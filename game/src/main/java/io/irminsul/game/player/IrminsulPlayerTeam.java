package io.irminsul.game.player;

import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.player.PlayerTeam;
import io.irminsul.common.game.property.EntityIdType;
import io.irminsul.common.proto.SceneEntityInfoOuterClass;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

@Data
public class IrminsulPlayerTeam implements PlayerTeam {

    @Serial
    private final static long serialVersionUID = 1;

    /**
     * The name of the team
     */
    private String name = "New Team";

    /**
     * The player that this team belongs to
     */
    private final Player owner;

    /**
     * A list of avatars on the team
     */
    private final List<Avatar> avatars = new ArrayList<>();

    /**
     * The entity id of this entity
     */
    private final int entityId;

    public IrminsulPlayerTeam(Player owner) {
        this.owner = owner;
        this.entityId = this.owner.getWorld().getNextEntityId(EntityIdType.TEAM);
    }
}
