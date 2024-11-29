package io.irminsul.game;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.ServerSystem;
import io.irminsul.common.plugin.GamePlugin;
import io.irminsul.common.plugin.PluginInfo;
import io.irminsul.common.util.i18n.I18n;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;
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

        // Create the plugins directory if it doesn't exist
        if (new File("plugins").mkdirs()) {
            this.server.getLogger().debug("Created plugins folder");
        }

        // Iterate over listed plugins in the server config
        for (String plugin : this.server.getConfig().getPlugins()) {

            // Add .jar to the end of the plugin name if it's not already there
            String pluginName = plugin.endsWith(".jar") ? plugin : plugin + ".jar";

            File pluginFile = new File("plugins/" + pluginName);

            // Verify that the plugin exists
            if (!pluginFile.exists()) {
                this.server.getLogger().warn(I18n.translate("game.plugin.missing", this.server.getConfig()), plugin);
                continue;
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
            this.server.getLogger().info("Disabled plugin {}", plugin.getPluginInfo().toString());
        }
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
            this.server.getLogger().error(I18n.translate("game.plugin.restricted", this.server.getConfig()),
                file.getName());
            return; // Failed to read the file, return early
        }

        // Read plugin properties file and verify that it exists
        ZipEntry propertiesEntry = plugin.getEntry("plugin.properties");
        if (propertiesEntry == null) {
            this.server.getLogger().error(I18n.translate("game.plugin.no_properties", this.server.getConfig()),
                file.getName());
            return; // Plugin doesn't have a plugin.properties, return early
        }

        InputStream propertiesStream;
        Properties properties = new Properties();
        try {
            propertiesStream = plugin.getInputStream(propertiesEntry);
            properties.load(propertiesStream);
        } catch (IOException e) {
            this.server.getLogger().error(I18n.translate("game.plugin.properties_locked", this.server.getConfig()),
                file.getName());
            return; // Can't read plugin.properties, return early
        }

        // Verify that the properties file contains required keys
        if (!properties.containsKey("id")) {
            this.server.getLogger().error(I18n.translate("game.plugin.no_id", this.server.getConfig()), file.getName());
            return; // No ID declared, return early
        } else if (!properties.containsKey("main")) {
            this.server.getLogger().error(I18n.translate("game.plugin.no_main", this.server.getConfig()),
                properties.getOrDefault("name", properties.get("id")));
            return; // No main declared, return early
        }

        // Verify that the plugin ID is unique
        if (this.loadedPlugins.containsKey(properties.getProperty("key"))) {
            this.server.getLogger().error(I18n.translate("game.plugin.duplicate", this.server.getConfig()),
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
            this.server.getLogger().error(I18n.translate("game.plugin.classloader", this.server.getConfig()),
                properties.getOrDefault("name", properties.get("id")), e);
            return; // Can't add the plugin to the class loader, return early
        }

        // Capture loaded main class
        Class<?> pluginMain;
        try {
            pluginMain = Class.forName(properties.getProperty("main"), true, this.pluginClassLoader);
        } catch (Exception e) {
            this.server.getLogger().error(I18n.translate("game.plugin.missing_main", this.server.getConfig()),
                properties.getOrDefault("name", properties.get("id")), properties.getProperty("main"));
            return; // Plugin main doesn't exist, return early
        }

        // Verify that the main class is valid
        if (!GamePlugin.class.isAssignableFrom(pluginMain)) {
            this.server.getLogger().error(I18n.translate("game.plugin.bad_main", this.server.getConfig()),
                properties.getOrDefault("name", properties.get("id")), properties.getProperty("main"));
            return; // Plugin main isn't valid, return early
        }

        // Instantiate the plugin
        GamePlugin pluginInstance;
        try {
            Constructor<?> constructor = pluginMain.getConstructor();
            pluginInstance = (GamePlugin) constructor.newInstance();
        } catch (Exception e) {
            this.server.getLogger().error(I18n.translate("game.plugin.instantiation", this.server.getConfig()),
                properties.getOrDefault("name", properties.get("id")), e);
            return; // Couldn't instantiate plugin, return early
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
            file.getName()
        ));

        // Done
        this.loadedPlugins.put(pluginInstance.getPluginInfo().getId(), pluginInstance);
    }

}
