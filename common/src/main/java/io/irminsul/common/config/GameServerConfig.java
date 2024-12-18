package io.irminsul.common.config;

import io.irminsul.common.config.game.ServerAccountConfig;
import io.irminsul.common.config.game.WelcomeMailConfig;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.io.File;

@Data
public class GameServerConfig {

    /**
     * The global config this config is under
     */
    private final @NotNull GlobalConfig globalConfig;



    /**
     * The port this game server will run on
     */
    private final int port;

    /**
     * Whether this game server will operate in sandbox mode, unlocking all avatars, areas, features, etc.
     */
    private final boolean sandbox;

    /**
     * The run directory of this game server
     */
    private final @NotNull File runDirectory;

    /**
     * Configuration for in-game server account, a way to provide an interactive message bot for users
     */
    private final @NotNull ServerAccountConfig serverAccountConfig;

    /**
     * Configuration for mail sent to players when they join the server for the first time
     */
    private final @NotNull WelcomeMailConfig welcomeMailConfig;
}
