package io.irminsul.common.config;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.irminsul.common.config.game.ServerAccountConfig;
import io.irminsul.common.config.game.WelcomeMailConfig;
import io.irminsul.common.util.i18n.I18n;
import lombok.experimental.UtilityClass;
import org.hjson.JsonValue;
import org.slf4j.Logger;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Objects;
import java.util.stream.Collectors;

@UtilityClass
public class ConfigLoader {

    public GameServerConfig readGameServerConfig(int id, Logger logger, GlobalConfig globalConfig) {
        try {
            File configFile = new File("config.hjson");

            // If the config file doesn't exit, create a copy of the default one stored internally
            if (!configFile.exists()) {
                logger.warn(I18n.translate("core.warn.config_cloned"));

                InputStream defaultConfig = Objects.requireNonNull(ConfigLoader.class.getResourceAsStream("/default.hjson"));
                Files.write(configFile.toPath(), defaultConfig.readAllBytes());
            }

            // Read the config file
            String configContents = String.join("\n", Files.readAllLines(configFile.toPath()));

            // Convert from HJson to JSON
            String rawJsonContents = JsonValue.readHjson(configContents).toString();
            JsonObject jsonContents = JsonParser.parseString(rawJsonContents).getAsJsonObject();

            // Read game server configs
            JsonArray gameServersArray = jsonContents.getAsJsonArray("game_servers");

            JsonObject server = gameServersArray.get(id).getAsJsonObject();
            JsonObject serverAccount = server.getAsJsonObject("server_account");
            JsonObject welcomeMail = server.getAsJsonObject("welcome_mail");

            // Create run directory if needed
            File gameRunDirectory = new File(server.get("run_directory").getAsString());
            gameRunDirectory.mkdirs();

            return new GameServerConfig(
                globalConfig,
                server.get("port").getAsInt(),
                server.get("sandbox").getAsBoolean(),
                gameRunDirectory,
                new ServerAccountConfig(
                    serverAccount.get("enabled").getAsBoolean(),
                    serverAccount.get("account_nickname").getAsString(),
                    serverAccount.get("account_signature").getAsString(),
                    serverAccount.get("welcome_message").getAsString(),
                    serverAccount.get("welcome_emote").getAsInt(),
                    serverAccount.get("commands_enabled").getAsBoolean()
                ),
                new WelcomeMailConfig(
                    welcomeMail.get("enabled").getAsBoolean(),
                    welcomeMail.get("file").getAsString(),
                    welcomeMail.get("subject").getAsString(),
                    welcomeMail.get("sender").getAsString()
                )
            );
        } catch (Exception e) {
            logger.error(I18n.translate("core.error.config_load_failed"), e);
            return null;
        }
    }
}
