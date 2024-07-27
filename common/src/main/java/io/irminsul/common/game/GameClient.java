package io.irminsul.common.game;

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
     * <pre>
     *     Editor: 0,
     *     IOS: 1,
     *     Android: 2,
     *     PC: 3,
     *     PS4: 4,
     *     Server: 5,
     *     CloudAndroid: 6,
     *     CloudIOS: 7,
     *     PS5: 8,
     *     CloudWeb: 9,
     *     CloudTV: 10,
     *     CloudMAC: 11,
     *     CloudPC: 12,
     *     Cloud3rdPartyMobile: 13,
     *     Cloud3rdPartyPC: 14</pre>
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
