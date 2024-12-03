package io.irminsul.game.mail;

import com.google.gson.JsonObject;
import io.irminsul.common.game.database.StateContainer;
import io.irminsul.common.game.mail.Mail;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Simple implementation of {@link Mail}
 */
@Data
@AllArgsConstructor
public class IrminsulMail implements Mail {

    /**
     * Default mail duration of seven days
     */
    private static final int DEFAULT_MAIL_DURATION = (60 * 60 * 24 * 7);

    /**
     * This mail's persistent ID
     */
    private int id;

    /**
     * The title/subject of this mail
     */
    private @NotNull String title;

    /**
     * The sender of this mail
     */
    private @NotNull String sender;

    /**
     * The content of this mail
     */
    private @NotNull String content;

    /**
     * The UID of this mail's owner (recipient)
     */
    private int owner;

    /**
     * The timestamp, in seconds, at which this mail was sent
     */
    private int sendTime;

    /**
     * The timestamp, in seconds, at which this mail expires
     */
    private int expireTime;

    /**
     * Creates a new IrminsulMail instance given an optional title, optional sender, message, and recipient. The
     * mail will expire after seven days.
     * @param title The title of the mail. Defaults to "(no subject)".
     * @param sender The sender of the mail. Defaults to "(server)".
     * @param content The content of the mail
     * @param recipient The UID of the recipient of the mail
     */
    IrminsulMail(String title, String sender, @NotNull String content, int recipient) {
        this(title, sender, content, recipient, (int) System.currentTimeMillis() / 1000 + DEFAULT_MAIL_DURATION);
    }

    /**
     * Creates a new IrminsulMail instance given an optional title, optional sender, message, recipient and expiration
     * time (absolute timestamp in seconds). If the expiration timestamp is invalid (less than the send time), a
     * warning is raised, and the mail will fall back to a 7-day expiry.
     * @param title The title of the mail. Defaults to "(no subject)".
     * @param sender The sender of the mail. Defaults to "(server)".
     * @param content The content of the mail
     * @param recipient The UID of the recipient of the mail
     * @param expireTime The time at which the mail expires
     */
    IrminsulMail(String title, String sender, @NotNull String content, int recipient, int expireTime) {
        this(
            (int) (Math.random() * Integer.MAX_VALUE),
            Objects.requireNonNullElse(title, "(no subject)"),
            Objects.requireNonNullElse(sender, "(server)"),
            content.replace("\n", "\r\n"), // Thanks, Unity.
            recipient,
            (int) (System.currentTimeMillis() / 1000),
            expireTime < System.currentTimeMillis() / 1000 ?
                (int) (System.currentTimeMillis() / 1000) + DEFAULT_MAIL_DURATION :
                expireTime
        );
    }

    /**
     * Load the state of this object from a json object, as exported by {@link StateContainer#exportState()}
     *
     * @param state The state to load, as a json object
     */
    @Override
    public void loadState(@NotNull JsonObject state) {
        this.id = state.get("id").getAsInt();
        this.title = state.get("title").getAsString();
        this.sender = state.get("sender").getAsString();
        this.content = state.get("content").getAsString();
        this.owner = state.get("owner").getAsInt();
        this.sendTime = state.get("send_time").getAsInt();
        this.expireTime = state.get("expire_time").getAsInt();
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
        state.addProperty("id", this.id);
        state.addProperty("title", this.title);
        state.addProperty("sender", this.sender);
        state.addProperty("content", this.content);
        state.addProperty("owner", this.owner);
        state.addProperty("send_time", this.sendTime);
        state.addProperty("expire_time", this.expireTime);
        return state;
    }
}
