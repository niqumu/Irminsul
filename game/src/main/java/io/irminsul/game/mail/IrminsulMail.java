package io.irminsul.game.mail;

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
     * The title/subject of this mail
     */
    private final @NotNull String title;

    /**
     * The sender of this mail
     */
    private final @NotNull String sender;

    /**
     * The content of this mail
     */
    private final @NotNull String content;

    /**
     * The UID of this mail's owner (recipient)
     */
    private final int owner;

    /**
     * The timestamp, in seconds, at which this mail was sent
     */
    private final int sendTime;

    /**
     * The timestamp, in seconds, at which this mail expires
     */
    private final int expireTime;

    /**
     * This mail's persistent ID
     */
    private final int id = (int) (Math.random() * Integer.MAX_VALUE);

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
            Objects.requireNonNullElse(title, "(no subject)"),
            Objects.requireNonNullElse(sender, "(server)"),
            content.replace("\n", "\r\n"), // Thanks guys.
            recipient,
            (int) System.currentTimeMillis() / 1000,
            expireTime < System.currentTimeMillis() / 1000 ?
                (int) System.currentTimeMillis() / 1000 + DEFAULT_MAIL_DURATION :
                expireTime
        );
    }
}
