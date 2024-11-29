package io.irminsul.common.plugin;

import lombok.Getter;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base class for an Irminsul plugin.
 * <p>
 * If you're writing a plugin, you probably don't want to extend this directly. Instead, you should extend either
 * {@link GamePlugin} or {@link HttpPlugin} depending on what you're doing.
 */
@Getter
abstract class BasePlugin {

    private PluginInfo pluginInfo;

    protected Logger logger;

    public void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        this.pluginInfo = pluginInfo;
        this.logger = LoggerFactory.getLogger("Plugin/" + pluginInfo.getName());
    }

    /**
     * Called by the plugin manager when this plugin is enabled by the server
     */
    public abstract void onEnable();

    /**
     * Called by the plugin manager when this plugin is disabled by the server
     */
    public abstract void onDisable();
}
