package io.irminsul.common.game.mail;

import org.jetbrains.annotations.NotNull;

/**
 * Represents an entry in a player's mailbox
 */
public interface Mail {

    /**
     * @return The title/subject of this mail
     */
    @NotNull String getTitle();

    /**
     * @return The sender of this mail
     */
    @NotNull String getSender();

    /**
     * @return The content of this mail
     */
    @NotNull String getContent();

    /**
     * @return The UID of this mail's owner (recipient)
     */
    int getOwner();

    /**
     * @return The timestamp, in seconds, at which this mail was sent
     */
    int getSendTime();

    /**
     * @return The timestamp, in seconds, at which this mail expires
     */
    int getExpireTime();

    /**
     * @return This mail's persistent ID
     */
    int getId();
}