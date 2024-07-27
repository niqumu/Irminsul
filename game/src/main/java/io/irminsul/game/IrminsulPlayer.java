package io.irminsul.game;

import io.irminsul.common.game.Player;
import lombok.Data;

@Data
public class IrminsulPlayer implements Player {

    private String nickname = "Traveler";

    private String signature = "";

    private int avatar = 1001;

    private int nameCard = 210001;
}
