package io.irminsul.common.game.mail;

import io.irminsul.common.game.ServerSystem;
import io.irminsul.common.game.player.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface MailManager extends ServerSystem {

    /**
     * Creates a new instance of a Mail implementation given an optional title, optional sender, message, and recipient.
     * The mail will expire after seven days.
     * @param title The title of the mail. Defaults to "(no subject)".
     * @param sender The sender of the mail. Defaults to "(server)".
     * @param content The content of the mail
     * @param recipient The UID of the recipient of the mail
     */
    @NotNull Mail generateMail(String title, String sender, @NotNull String content, int recipient);

    /**
     * Creates a new instance of a Mail implementation given an optional title, optional sender, message, recipient
     * and expiration time (absolute timestamp in seconds). If the expiration timestamp is invalid (less than the send
     * time), a warning is raised, and the mail will fall back to a 7-day expiry.
     * @param title The title of the mail. Defaults to "(no subject)".
     * @param sender The sender of the mail. Defaults to "(server)".
     * @param content The content of the mail
     * @param recipient The UID of the recipient of the mail
     * @param expireTime The time at which the mail expires
     */
    @NotNull Mail generateMail(String title, String sender, @NotNull String content, int recipient, int expireTime);

    /**
     * Sends mail to a player
     * @param mail The mail to send
     */
    void sendMail(@NotNull Mail mail);

    /**
     * Sends the configured welcome mail to a player
     * @param player The player to send the welcome mail to
     */
    void sendWelcomeMail(@NotNull Player player);

    /**
     * Gets the contents of a player's mailbox
     * @param player The player to fetch the mail of
     * @return A list of unexpired and undeleted mail this player has in their mailbox
     */
    @NotNull List<Mail> getMailbox(@NotNull Player player);

    /**
     * Gets the contents of a player's mailbox
     * @param player The UID of the player to fetch the mail of
     * @return A list of unexpired and undeleted mail this player has in their mailbox
     */
    @NotNull List<Mail> getMailbox(int player);
}
