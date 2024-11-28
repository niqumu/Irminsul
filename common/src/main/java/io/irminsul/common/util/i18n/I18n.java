package io.irminsul.common.util.i18n;

import io.irminsul.common.config.LanguageSupplier;
import lombok.NonNull;
import lombok.experimental.UtilityClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

@UtilityClass
public class I18n {

    private final Logger LOGGER = LoggerFactory.getLogger("I18nUtil");

    /**
     * Map of {@code locale name -> (key -> value)}
     */
    private final Map<String, Map<String, String>> translations = new HashMap<>();

    public @NonNull String translate(@NonNull String key, LanguageSupplier supplier) {

        // Check to make sure that the translations have been loaded
        if (translations.isEmpty()) {
            loadTranslations();
        }

        // Get the language to translate to
        String language;
        if (supplier == null) {
            language = Locale.getDefault().getLanguage().equals("zh") ? "zh_CN" : "en_US";
        } else {
            language = supplier.getLanguage();
        }

        // Check to see if the language to translate to is valid
        if (!translations.containsKey(language)) {
            LOGGER.warn("Attempted to translate to an unknown language \"{}\"! Falling back!", language);
            return key;
        }

        return translations.get(language).getOrDefault(key, translations.get("en_US").getOrDefault(key, key));
    }

    private void loadTranslations() {
        for (ServerLocale locale : ServerLocale.values()) {

            // Create entry in translations map
            translations.put(locale.getName(), new HashMap<>());

            // Read translation file
            Properties properties = new Properties();
            InputStream stream = I18n.class.getResourceAsStream("/locale/" + locale.getTranslationFile());

            try {
                properties.load(new InputStreamReader(stream, StandardCharsets.UTF_8));
            } catch (Exception e) {
                LOGGER.error("Failed to load translations for {}! Skipping...", locale.getName(), e);
                continue;
            }

            // Load translations into map
            for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                translations.get(locale.getName()).put(entry.getKey().toString(), entry.getValue().toString());
            }
        }

        if (!translations.containsKey("en_US")) {
            LOGGER.error("No translation file for English was provided! This is required, as it's a fallback!");
        }
    }
}
