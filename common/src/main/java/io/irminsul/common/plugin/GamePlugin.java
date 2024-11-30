package io.irminsul.common.plugin;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.command.CommandHandler;
import lombok.NonNull;
import lombok.Setter;

/**
 * Base class for an Irminsul game server plugin
 */
@Setter
public abstract class GamePlugin extends BasePlugin {

    /**
     * The {@link GameServer} that this plugin belongs to
     */
    protected GameServer server;

    // ================================
    // Shortcuts
    // ================================

    /**
     * Registers the provided object as an event subscriber with the event bus of this plugin's server
     * @param object The object to register as an event subscriber
     */
    protected void registerEventSubscriber(@NonNull Object object) {
        this.server.getEventBus().registerSubscriber(object);
    }

    /**
     * Registers the provided command handler with the command manager of this plugin's server
     * @param handler The {@link CommandHandler} to register with the server
     */
    protected void registerCommand(@NonNull CommandHandler handler) {
        this.server.getCommandManager().registerCommand(handler, this.getPluginInfo().getId());
    }
}
