package io.irminsul.common;

import lombok.Data;

/**
 * Represents a game client connecting to the server
 */
@Data
public class GameClient {

    /**
     * The game version the client is running on. Includes the channel and platform.
     * <br>
     * Example: OSRELWin4.0.0
     */
    private final String version;

    /**
     * The language of the client
     * TODO values
     */
    private final String lang;

    /**
     * The platform the client is running on
     * TODO values
     */
    private final String platform;

    /**
     * TODO research
     */
    private final String binary;

    /**
     * TODO research
     */
    private final String channelID;

    /**
     * TODO research
     */
    private final String subChannelID;
}
