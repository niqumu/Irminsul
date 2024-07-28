package io.irminsul.common.game.player;

import io.irminsul.common.game.avatar.Avatar;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface PlayerTeam {

    /**
     * @return The name of the team
     */
    @NotNull String getName();

    /**
     * Set the name of the team
     * @param name The new name of the team
     */
    void setName(@NotNull String name);

    /**
     * @return A list of avatars on the team
     */
    @NotNull List<Avatar> getAvatars();
}
