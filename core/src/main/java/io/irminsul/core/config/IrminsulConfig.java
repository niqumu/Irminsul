package io.irminsul.core.config;

import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;

public class IrminsulConfig {

    private static final String CONFIG_FILE = "settings.properties";

    private final Logger logger = LoggerFactory.getLogger("Config");

    private final HashMap<ConfigEntry, Object> config = new HashMap<>();

    public @NonNull Object getValue(@NonNull ConfigEntry key) {
        return this.config.getOrDefault(key, key.getDefaultValue());
    }

    public void setValue(@NonNull ConfigEntry key, @NonNull Object value) {
        this.config.put(key, value);
    }

    public void load() throws IOException {
        File propertiesFile = new File(CONFIG_FILE);

        if (!propertiesFile.exists()) {
            this.logger.info("Configuration file missing - creating a new one with default values!");
            this.save();
        }

        Properties properties = new Properties();
        properties.load(new FileInputStream(propertiesFile));

        for (ConfigEntry entry : ConfigEntry.values()) {
            Object value = properties.getOrDefault(entry.getKey(), entry.getDefaultValue());
            this.config.put(entry, value);
        }
    }

    public void save() throws IOException {
        File propertiesFile = new File(CONFIG_FILE);
        Properties properties = new Properties();

        // Iterate over each entry, storing either the loaded value or the default value
        for (ConfigEntry entry : ConfigEntry.values()) {
            if (this.config.containsKey(entry)) {
                properties.put(entry.getKey(), String.valueOf(this.config.get(entry)));
            } else {
                properties.put(entry.getKey(), String.valueOf(entry.getDefaultValue()));
            }
        }

        properties.store(new FileOutputStream(propertiesFile), null);
    }
}
