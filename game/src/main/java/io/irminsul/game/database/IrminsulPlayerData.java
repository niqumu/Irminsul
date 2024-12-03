package io.irminsul.game.database;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.irminsul.common.game.database.PlayerData;
import io.irminsul.common.game.database.StateContainer;
import io.irminsul.common.game.mail.Mail;
import io.irminsul.common.game.player.PlayerProfile;
import io.irminsul.common.game.world.Position;
import io.irminsul.game.mail.IrminsulMail;
import io.irminsul.game.player.IrminsulPlayerProfile;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class IrminsulPlayerData implements PlayerData {

    private final int uid;

    private PlayerProfile profile;

    private Position position;

    private int scene;

    private JsonArray mailbox;

    /**
     * Load the state of this object from a json object, as exported by {@link StateContainer#exportState()}
     *
     * @param state The state to load, as a json object
     */
    @Override
    public void loadState(@NotNull JsonObject state) {
        this.profile = new IrminsulPlayerProfile(this.uid);
        this.profile.loadState(state.getAsJsonObject("profile"));
        this.position = Position.ORIGIN();
        this.position.loadState(state.getAsJsonObject("position"));
        this.scene = state.get("scene").getAsInt();
        this.mailbox = state.getAsJsonArray("mailbox");
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

        state.add("profile", this.profile.exportState());
        state.add("position", this.position.exportState());
        state.addProperty("scene", this.scene);
        state.add("mailbox", this.mailbox);

        return state;
    }
}
