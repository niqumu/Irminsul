package io.irminsul.common.config;

import lombok.Data;

@Data
public class GameServerConfig implements LanguageSupplier {

    /**
     * The global config this config is under
     */
    private final GlobalConfig globalConfig;



    /**
     * The port this game server will run on
     */
    private final int port;

    /**
     * Whether this game server will operate in sandbox mode, unlocking all avatars, areas, features, etc.
     */
    private final boolean sandbox;

    /**
     * Whether this game server will provide a way for users to execute commands in-game
     */
    private final boolean commands;

    @Override
    public String getLanguage() {
        return this.globalConfig.getLanguage();
    }
}
