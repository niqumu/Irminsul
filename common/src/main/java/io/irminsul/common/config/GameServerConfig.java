package io.irminsul.common.config;

import lombok.Data;

import java.util.List;

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
     * Configuration for in-game server account, a way for users to execute commands in-game
     */
    private final ServerAccountConfig serverAccountConfig;

    /**
     * List of enabled plugins on this server
     */
    private final List<String> plugins;

    @Override
    public String getLanguage() {
        return this.globalConfig.getLanguage();
    }
}
