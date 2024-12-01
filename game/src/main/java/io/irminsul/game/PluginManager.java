package io.irminsul.game;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.ServerSystem;
import io.irminsul.common.plugin.GamePlugin;
import io.irminsul.common.plugin.PluginInfo;
import io.irminsul.common.plugin.PluginReloadChanges;
import io.irminsul.common.util.i18n.I18n;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

@RequiredArgsConstructor
public class PluginManager implements ServerSystem {

    /**
     * The server that this plugin manager belongs to
     */
    @Getter
    private final GameServer server;

    /**
     * A map of loaded and fully enabled plugins, keyed as plugin ID -> plugin instance
     */
    @Getter
    private final Map<String, GamePlugin> loadedPlugins = new HashMap<>();

    private final URLClassLoader pluginClassLoader = new URLClassLoader(new URL[]{});

    public void loadPlugins() {

        File pluginsDir = new File(this.server.getConfig().getRunDirectory(), "plugins");

        // Create the plugins directory if it doesn't exist
        if (pluginsDir.mkdirs()) {
            this.server.getLogger().debug("Created plugins folder");
        }

        // Iterate over file in the plugins directory
        for (File pluginFile : Objects.requireNonNull(pluginsDir.listFiles())) {

            if (!pluginFile.isFile() || !pluginFile.getName().endsWith(".jar")) {
                continue; // Not a plugin
            }

            // Try to load the plugin
            this.tryLoadPlugin(pluginFile);
        }
    }

    public void enablePlugins() {
        for (GamePlugin plugin : this.loadedPlugins.values()) {
            plugin.onEnable();
            this.server.getLogger().info("Enabled plugin {}", plugin.getPluginInfo().toString());
        }
    }

    public void disablePlugins() {
        for (GamePlugin plugin : this.loadedPlugins.values()) {
            plugin.onDisable();

            // Remove any commands the plugin may have registered
            this.server.getCommandManager().getRegisteredCommands().values()
                .removeIf(c -> c.getRegistrar().equals(plugin.getPluginInfo().getId()));

            this.server.getLogger().info("Disabled plugin {}", plugin.getPluginInfo().toString());
        }
    }

    public @NonNull PluginReloadChanges reloadPlugins() {

        // Save a list of old plugin hashes
        Map<String, String> oldPluginHashes = new HashMap<>();
        for (GamePlugin plugin : this.loadedPlugins.values()) {
            oldPluginHashes.put(plugin.getPluginInfo().getId(), plugin.getPluginInfo().getHash());
        }

        // Disable and deregister all plugins
        this.disablePlugins();
        this.loadedPlugins.clear();

        // Rescan and reload plugins
        this.loadPlugins();
        this.enablePlugins();

        // Get a list of post-reload plugin hashes
        Map<String, String> newPluginHashes = new HashMap<>();
        for (GamePlugin plugin : this.loadedPlugins.values()) {
            newPluginHashes.put(plugin.getPluginInfo().getId(), plugin.getPluginInfo().getHash());
        }

        // Check for differences
        int added = 0, removed = 0, changed = 0;

        for (Map.Entry<String, String> entry : oldPluginHashes.entrySet()) { // iterate over old plugins
            if (!newPluginHashes.containsKey(entry.getKey())) {
                removed++;
            } else if (!newPluginHashes.get(entry.getKey()).equals(entry.getValue())) {
                changed++;
            }
        }

        for (Map.Entry<String, String> entry : newPluginHashes.entrySet()) { // iterate over new plugins
            if (!oldPluginHashes.containsKey(entry.getKey())) {
                added++;
            }
        }

        // Done
        this.getLogger().info(I18n.translate("game.plugin.hotswap_done"), added, removed, changed);
        return new PluginReloadChanges(added, removed, changed);
    }

    /**
     * Attempts to load a plugin
     * @param file The plugin to load, as a {@link File}
     */
    private void tryLoadPlugin(File file) {

        JarFile plugin;
        try {
            plugin = new JarFile(file);
        } catch (IOException e) {
            this.server.getLogger().error(I18n.translate("game.plugin.restricted"),
                file.getName());
            return; // Failed to read the file, return early
        }

        // Read plugin properties file and verify that it exists
        ZipEntry propertiesEntry = plugin.getEntry("plugin.properties");
        if (propertiesEntry == null) {
            this.server.getLogger().error(I18n.translate("game.plugin.no_properties"),
                file.getName());
            return; // Plugin doesn't have a plugin.properties, return early
        }

        InputStream propertiesStream;
        Properties properties = new Properties();
        try {
            propertiesStream = plugin.getInputStream(propertiesEntry);
            properties.load(propertiesStream);
        } catch (IOException e) {
            this.server.getLogger().error(I18n.translate("game.plugin.properties_locked"),
                file.getName());
            return; // Can't read plugin.properties, return early
        }

        // Verify that the properties file contains required keys
        if (!properties.containsKey("id")) {
            this.server.getLogger().error(I18n.translate("game.plugin.no_id"), file.getName());
            return; // No ID declared, return early
        } else if (!properties.containsKey("main")) {
            this.server.getLogger().error(I18n.translate("game.plugin.no_main"),
                properties.getOrDefault("name", properties.get("id")));
            return; // No main declared, return early
        }

        // Verify that the plugin ID is unique
        if (this.loadedPlugins.containsKey(properties.getProperty("key"))) {
            this.server.getLogger().error(I18n.translate("game.plugin.duplicate"),
                properties.getOrDefault("name", properties.get("id")), properties.get("id"),
                this.loadedPlugins.get(properties.getProperty("key")).getPluginInfo().getFilename());
            return; // Duplicate plugin, return early
        }

        // Register the plugin with the plugin class loader
        try {
            java.lang.reflect.Method method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
            method.setAccessible(true);
            method.invoke(this.pluginClassLoader, file.toURI().toURL());
        } catch (Exception e) {
            this.server.getLogger().error(I18n.translate("game.plugin.classloader"),
                properties.getOrDefault("name", properties.get("id")), e);
            return; // Can't add the plugin to the class loader, return early
        }

        // Capture loaded main class
        Class<?> pluginMain;
        try {
            pluginMain = Class.forName(properties.getProperty("main"), true, this.pluginClassLoader);
        } catch (Exception e) {
            this.server.getLogger().error(I18n.translate("game.plugin.missing_main"),
                properties.getOrDefault("name", properties.get("id")), properties.getProperty("main"));
            return; // Plugin main doesn't exist, return early
        }

        // Verify that the main class is valid
        if (!GamePlugin.class.isAssignableFrom(pluginMain)) {
            this.server.getLogger().error(I18n.translate("game.plugin.bad_main"),
                properties.getOrDefault("name", properties.get("id")), properties.getProperty("main"));
            return; // Plugin main isn't valid, return early
        }

        // Instantiate the plugin
        GamePlugin pluginInstance;
        try {
            Constructor<?> constructor = pluginMain.getConstructor();
            pluginInstance = (GamePlugin) constructor.newInstance();
        } catch (Exception e) {
            this.server.getLogger().error(I18n.translate("game.plugin.instantiation"),
                properties.getOrDefault("name", properties.get("id")), e);
            return; // Couldn't instantiate plugin, return early
        }

        // Compute hash
        String hash = "(unknown)";
        try {
            hash = new String(MessageDigest.getInstance("MD5").digest(Files.readAllBytes(file.toPath())));
        } catch (Exception e) {
            this.server.getLogger().error(I18n.translate("game.plugin.hashing"),
                properties.getOrDefault("name", properties.get("id")), e);
        }

        // Finish setting up the plugin
        pluginInstance.setServer(this.server);
        pluginInstance.setPluginInfo(new PluginInfo(
            properties.get("id").toString(),
            properties.getOrDefault("version", "(unknown)").toString(),
            properties.getOrDefault("name", properties.get("id")).toString(),
            properties.getOrDefault("description", "(none)").toString(),
            properties.getOrDefault("author", "(unknown)").toString(),
            properties.getOrDefault("website", "(none)").toString(),
            file.getName(),
            hash
        ));

        // Done
        this.loadedPlugins.put(pluginInstance.getPluginInfo().getId(), pluginInstance);
    }

}
