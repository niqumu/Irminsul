package io.irminsul.common.plugin;

import lombok.Data;
import lombok.NonNull;

/**
 * Data class for basic plugin information such as name, version, and author.
 */
@Data
public class PluginInfo {

    /**
     * The internal ID of this plugin
     */
    private final @NonNull String id;

    /**
     * The version of this plugin
     */
    private final @NonNull String version;

    /**
     * The display name of this plugin
     */
    private final @NonNull String name;

    /**
     * A brief description of this plugin
     */
    private final @NonNull String description;

    /**
     * The author(s) of this plugin
     */
    private final @NonNull String author;

    /**
     * A website associated with this plugin, such as a Git repository
     */
    private final @NonNull String website;

    /**
     * The name of the file from which this plugin was loaded
     */
    private final @NonNull String filename;

    @Override
    public String toString() {
        return "\"%s\" by %s (version %s)".formatted(this.name, this.author, this.version);
    }
}
