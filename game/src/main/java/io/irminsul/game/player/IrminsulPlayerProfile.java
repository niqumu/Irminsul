package io.irminsul.game.player;

import io.irminsul.common.game.player.PlayerProfile;
import lombok.Data;

import java.io.Serial;

/**
 * Implementation of {@link PlayerProfile}, representing a player's social profile
 */
@Data
public class IrminsulPlayerProfile implements PlayerProfile {

    @Serial
    private static final long serialVersionUID = 1;

    /**
     * This player's UID
     */
    private final int uid;

    /**
     * This player's profile nickname/display name
     */
    private String nickname = "Traveler";

    /**
     * This player's profile signature
     */
    private String signature = "Using Irminsul PS";

    /**
     * This player's profile avatar
     */
    private int profilePicture = 1001;

    /**
     * This player's profile name card
     */
    private int nameCard = 210001;

    /**
     * The month of this player's set birthday, or 0 if none is set
     */
    private int birthdayMonth;

    /**
     * The day of this player's set birthday, or 0 if none is set
     */
    private int birthdayDay;

    /**
     * Sets this player's birthday
     * @param month The month of this player's new birthday
     * @param day The day of this player's new birthday
     */
    @Override
    public void setBirthday(int month, int day) {
        this.birthdayMonth = month;
        this.birthdayDay = day;
    }
}
