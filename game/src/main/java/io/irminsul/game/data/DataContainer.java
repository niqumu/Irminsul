package io.irminsul.game.data;

import io.irminsul.common.game.data.scene.SceneData;
import io.irminsul.game.data.parser.SceneDataParser;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

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
        logger.info("Loading scene {}", sceneId);

        SceneData sceneData = SceneDataParser.parseSceneData(sceneId);
        loadedScenes.put(sceneId, sceneData);

        logger.info("Finished loading scene {}!", sceneId);
        return sceneData;
    }
}
