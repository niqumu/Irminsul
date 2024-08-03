package io.irminsul.game.data;

import io.irminsul.common.game.data.SceneData;
import io.irminsul.common.game.world.Position;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Container class for game data
 */
@UtilityClass
public class DataContainer {

    private final Logger logger = LoggerFactory.getLogger("Data Container");

    /**
     * A map of loaded scenes and their {@link SceneData}, keyed by scene IDs
     */
    private final Map<Integer, SceneData> loadedScenes = new HashMap<>();

    /**
     * Gets a scene's {@link SceneData} by scene ID, attempting to load the scene data if not already loaded
     * @param sceneId The ID of the scene to load the data for
     * @return The scene's {@link SceneData}, or a fallback {@link SceneData} if something went wrong
     */
    public @NotNull SceneData getOrLoadSceneData(int sceneId) {
        if (loadedScenes.containsKey(sceneId)) {
            return loadedScenes.get(sceneId);
        }
        return loadSceneData(sceneId);
    }

    private @NotNull SceneData loadSceneData(int sceneId) {
        SceneData sceneData = new SceneData(Position.ORIGIN());

        File sceneFile = new File("data/lua/scene/" + sceneId + "/scene" + sceneId + ".lua");

        if (sceneFile.exists()) {
            try {
                parseSceneData(sceneData, sceneFile);
                logger.info("Loaded scene {}", sceneId);
            } catch (Exception e) {
                logger.warn("Failed to load lua file for scene {}: {}", sceneId, e.toString());
            }
        } else {
            logger.warn("Missing scene lua file for for scene {}!", sceneId);
        }

        loadedScenes.put(sceneId, sceneData);
        return sceneData;
    }

    private void parseSceneData(SceneData sceneData, File sceneFile) throws Exception {
        Pattern pattern = Pattern.compile("-?\\d+\\.\\d+");

        for (String line : Files.readAllLines(sceneFile.toPath())) {
            if (line.startsWith("\tborn_pos")) {
                Matcher matcher = pattern.matcher(line);
                ArrayList<Float> numbers = new ArrayList<>();

                while (matcher.find()) {
                    numbers.add(Float.parseFloat(matcher.group()));
                }

                sceneData.getSpawn().setX(numbers.getFirst());
                sceneData.getSpawn().setY(numbers.get(1));
                sceneData.getSpawn().setZ(numbers.get(2));
                return;
            }
        }
    }
}
