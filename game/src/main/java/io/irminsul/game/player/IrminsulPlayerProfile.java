package io.irminsul.game.player;

import com.google.gson.JsonObject;
import io.irminsul.common.game.database.StateContainer;
import io.irminsul.common.game.player.PlayerProfile;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * Implementation of {@link PlayerProfile}, representing a player's social profile
 */
@Data
public class IrminsulPlayerProfile implements PlayerProfile {

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

    /**
     * Load the state of this object from a json object, as exported by {@link StateContainer#exportState()}
     *
     * @param state The state to load, as a json object
     */
    @Override
    public void loadState(@NotNull JsonObject state) {
        this.nickname = state.get("nickname").getAsString();
        this.signature = state.get("signature").getAsString();
        this.profilePicture = state.get("profile_picture").getAsInt();
        this.nameCard = state.get("name_card").getAsInt();
        this.birthdayMonth = Integer.parseInt(state.get("birthday").getAsString().split("/")[0]);
        this.birthdayDay = Integer.parseInt(state.get("birthday").getAsString().split("/")[1]);
    }

    /**
     * Exports the state of this object to a json object, which can be imported by
     * {@link StateContainer#loadState(JsonObject)}
     *
     * @return The state of this object, exported as a json object
     */
    @Override
    public @NotNull JsonObject exportState() {
        JsonObject state = new JsonObject();

        state.addProperty("nickname", this.nickname);
        state.addProperty("signature", this.signature);
        state.addProperty("profile_picture", this.profilePicture);
        state.addProperty("name_card", this.nameCard);
        state.addProperty("birthday", "%d/%d".formatted(this.birthdayMonth, this.birthdayDay));

        return state;
    }
}
