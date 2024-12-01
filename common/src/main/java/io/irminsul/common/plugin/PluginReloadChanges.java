package io.irminsul.common.plugin;

import lombok.Data;

/**
 * Data class for storing the result of a plugin reload
 */
@Data
public class PluginReloadChanges {

    /**
     * The number of new plugins added by the reload
     */
    private final int added;

    /**
     * The number of old plugins removed by the reload
     */
    private final int removed;

    /**
     * The number of plugins changed by the reload (using the plugin's MD5 hash)
     */
    private final int changed;
}
