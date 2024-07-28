package io.irminsul.game.player;

import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.player.PlayerTeam;
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
     * A list of avatars on the team
     */
    private final List<Avatar> avatars = new ArrayList<>();
}
