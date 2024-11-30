package io.irminsul.game.mail;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.mail.Mail;
import io.irminsul.common.game.mail.MailManager;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.util.i18n.I18n;
import io.irminsul.game.net.packet.PacketMailChangeNotify;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.*;

// TODO: mail expiry
public class IrminsulMailManager implements MailManager {

    /**
     * The {@link GameServer} this system belongs to
     */
    @Getter
    private final GameServer server;

    /**
     * A map of player mailboxes, keyed as {@code (UID -> mail list)}
     */
    private final Map<Integer, List<Mail>> mailboxes = new HashMap<>();

    private String welcomeMailContents;

    public IrminsulMailManager(@NotNull GameServer server) {
        this.server = server;

        // Read welcome mail contents
        this.readWelcomeMailContents();
    }

    private void readWelcomeMailContents() {

        // Fallback
        this.welcomeMailContents = I18n.translate("generic.error");

        File welcomeMailFile = new File(this.server.getConfig().getWelcomeMailConfig().getFile());

        // Try to read the welcome mail file
        try {
            // Make sure the welcome mail file exists
            if (!welcomeMailFile.exists() || !welcomeMailFile.isFile()) {

                // If the welcome mail file is the default, copy it from resources
                if (welcomeMailFile.getName().equals("welcome_mail.txt")) {
                    InputStream defaultConfig = Objects.requireNonNull(IrminsulMailManager.class
                        .getResourceAsStream("/default_welcome_mail.txt"));
                    Files.write(welcomeMailFile.toPath(), defaultConfig.readAllBytes());
                }

                // Otherwise, log that the mail file is missing and return.
                else {
                    this.getLogger().error(I18n.translate("game.error.welcome_mail_missing"), welcomeMailFile.getName());
                    return;
                }
            }

            this.welcomeMailContents = String.join("\n", Files.readAllLines(welcomeMailFile.toPath()));
        } catch (Exception e) {
            this.getLogger().error(I18n.translate("game.error.welcome_mail_locked"), welcomeMailFile.getName());
        }
    }

    /**
     * Creates a new instance of a Mail implementation given an optional title, optional sender, message, and recipient.
     * The mail will expire after seven days.
     *
     * @param title     The title of the mail. Defaults to "(no subject)".
     * @param sender    The sender of the mail. Defaults to "(server)".
     * @param content   The content of the mail
     * @param recipient The UID of the recipient of the mail
     */
    @Override
    public @NotNull Mail generateMail(String title, String sender, @NotNull String content, int recipient) {
        return new IrminsulMail(title, sender, content, recipient);
    }

    /**
     * Creates a new instance of a Mail implementation given an optional title, optional sender, message, recipient
     * and expiration time (absolute timestamp in seconds). If the expiration timestamp is invalid (less than the send
     * time), a warning is raised, and the mail will fall back to a 7-day expiry.
     *
     * @param title      The title of the mail. Defaults to "(no subject)".
     * @param sender     The sender of the mail. Defaults to "(server)".
     * @param content    The content of the mail
     * @param recipient  The UID of the recipient of the mail
     * @param expireTime The time at which the mail expires
     */
    @Override
    public @NotNull Mail generateMail(String title, String sender, @NotNull String content, int recipient, int expireTime) {

        // Verify that the expiration time is valid (not less than the send time)
        if (expireTime < System.currentTimeMillis() / 1000) {
            this.getLogger().warn(I18n.translate("game.warn.mail_invalid_expiry"), expireTime);
        }

        return new IrminsulMail(title, sender, content, recipient, expireTime);
    }

    /**
     * Sends mail to a player
     *
     * @param mail The mail to send
     */
    @Override
    public void sendMail(@NotNull Mail mail) {

        // Log the mail
        this.getLogger().info(I18n.translate("game.info.mail"), mail.getSender(), mail.getOwner(), mail.getTitle());

        // Add the mail to the player's mailbox
        this.mailboxes.computeIfAbsent(mail.getOwner(), f -> new ArrayList<>()).add(mail);

        // Inform the player if connected
        if (this.server.getOnlinePlayers().containsKey(mail.getOwner())) {
            new PacketMailChangeNotify(server.getOnlinePlayers().get(mail.getOwner()).getSession(), mail).send();
        }
    }

    /**
     * Sends the configured welcome mail to a player
     *
     * @param player The player to send the welcome mail to
     */
    @Override
    public void sendWelcomeMail(@NotNull Player player) {
        this.sendMail(this.generateMail(
            this.server.getConfig().getWelcomeMailConfig().getSubject(),
            this.server.getConfig().getWelcomeMailConfig().getSender(),
            this.welcomeMailContents,
            player.getUid(),
            Integer.MAX_VALUE // This is going to break in 2038 lol
        ));
    }

    /**
     * Gets the contents of a player's mailbox
     *
     * @param player The player to fetch the mail of
     * @return A list of unexpired and undeleted mail this player has in their mailbox
     */
    @Override
    public @NotNull List<Mail> getMailbox(@NotNull Player player) {
        return this.mailboxes.getOrDefault(player.getUid(), List.of());
    }

    /**
     * Gets the contents of a player's mailbox
     *
     * @param player The UID of the player to fetch the mail of
     * @return A list of unexpired and undeleted mail this player has in their mailbox
     */
    @Override
    public @NotNull List<Mail> getMailbox(int player) {
        return this.mailboxes.getOrDefault(player, List.of());
    }
}
