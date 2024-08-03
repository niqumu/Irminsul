package io.irminsul.common.game.player;

import org.jetbrains.annotations.NotNull;

/**
 * Representation of a player's social profile
 */
public interface PlayerProfile {

    /**
     * @return This player's UID
     */
    int getUid();

    /**
     * @return This player's profile nickname/display name
     */
    @NotNull String getNickname();

    /**
     * Sets this player's profile nickname/display name
     * @param nickname The new nickname to use
     */
    void setNickname(@NotNull String nickname);

    /**
     * @return This player's profile signature
     */
    @NotNull String getSignature();

    /**
     * Sets this player's profile signature
     * @param signature The new signature to use
     */
    void setSignature(@NotNull String signature);

    /**
     * @return This player's profile avatar
     */
    int getProfilePicture();

    /**
     * Sets this player's profile avatar
     * @param profilePicture The new avatar to use
     */
    void setProfilePicture(int profilePicture);

    /**
     * @return This player's profile name card
     */
    int getNameCard();

    /**
     * Sets this player's profile name card
     * @param nameCard The new name card to use
     */
    void setNameCard(int nameCard);

    /**
     * @return The month of this player's set birthday, or 0 if none is set
     */
    int getBirthdayMonth();

    /**
     * @return The day of this player's set birthday, or 0 if none is set
     */
    int getBirthdayDay();

    /**
     * Sets this player's birthday
     * @param month The month of this player's new birthday
     * @param day The day of this player's new birthday
     */
    void setBirthday(int month, int day);
}
