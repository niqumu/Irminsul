package io.irminsul.common;

import lombok.Data;

@Data
public class GameClient {
    private final String version;
    private final String lang;
    private final String platform;
    private final String binary;
    private final String channelID;
    private final String subChannelID;
}
