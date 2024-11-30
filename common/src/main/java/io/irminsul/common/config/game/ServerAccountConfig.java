package io.irminsul.common.config.game;

import lombok.Data;

/**
 * Configuration for in-game server account, a way to provide an interactive message bot for users
 */
@Data
public class ServerAccountConfig {

    /**
     * Used to enable/disable the entire in-game server account
     */
    private final boolean enabled;

    /**
     * The in-game display name of the server account
     */
    private final String nickname;

    /**
     * The in-game signature of the server account
     */
    private final String signature;

    /**
     * Message sent to players upon joining. Blank to disable.
     */
    private final String welcomeMessage;

    /**
     * Emote sent to players upon joining. Zero to disable.
     */
    private final int welcomeEmote;

    /**
     * Toggle the ability to execute commands via the account
     */
    private final boolean commandsEnabled;
}
