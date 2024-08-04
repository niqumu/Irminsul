package io.irminsul.game.data;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
        logger.info("Loading scene {}", sceneId);
        SceneData sceneData = new SceneData(Position.ORIGIN());

        // Main scene lua
        File sceneLua = new File("data/lua/scene/" + sceneId + "/scene" + sceneId + ".lua");
        if (sceneLua.exists()) {
            try {
                parseSceneLua(sceneData, sceneLua);
                logger.info("Loaded scene {} main lua", sceneId);
            } catch (Exception e) {
                logger.warn("Failed to load scene lua file for scene {}: {}", sceneId, e.toString());
            }
        } else {
            logger.warn("Missing scene lua file for for scene {}!", sceneId);
        }

        // Scene points
        File scenePoints = new File("data/lua/scene/" + sceneId + "/scene" + sceneId + "_point.json");
        if (scenePoints.exists()) {
            try {
                parseScenePoints(sceneData, scenePoints);
                logger.info("Loaded scene {} scene points", sceneId);
            } catch (Exception e) {
                logger.warn("Failed to load scene points file for scene {}: {}", sceneId, e.toString());
            }
        } else {
            logger.warn("Missing scene points file for for scene {}!", sceneId);
        }

        loadedScenes.put(sceneId, sceneData);
        logger.info("Finished loading scene {}!", sceneId);
        return sceneData;
    }

    private void parseSceneLua(SceneData sceneData, File sceneFile) throws Exception {
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

    private void parseScenePoints(SceneData sceneData, File scenePoints) throws Exception {
        JsonObject object = JsonParser.parseString(Files.readString(scenePoints.toPath())).getAsJsonObject();
        JsonObject points = object.getAsJsonObject("points");

        // Iterate over scene points
        for (Map.Entry<String, JsonElement> entry : points.entrySet()) {
            int pointId = Integer.parseInt(entry.getKey());
            JsonObject entryObject = entry.getValue().getAsJsonObject();

            if (!entryObject.has("$type")) {
                continue;
            }

            // If the scene point is a trans point
            if (entryObject.get("$type").getAsString().equals("SceneTransPoint")) {
                int areaId = entryObject.get("areaId").getAsInt();
                int gadgetId = entryObject.get("gadgetId").getAsInt();
                Position position = Position.ORIGIN();
                Position transPosition = Position.ORIGIN();

                // Position and rotation
                JsonObject posObj = entryObject.getAsJsonObject("pos");
                position.setX(posObj.get("x").getAsFloat());
                position.setY(posObj.get("y").getAsFloat());
                position.setZ(posObj.get("z").getAsFloat());
                JsonObject rotObj = entryObject.getAsJsonObject("rot");
                position.setXRot(rotObj.get("x").getAsFloat());
                position.setYRot(rotObj.get("y").getAsFloat());
                position.setZRot(rotObj.get("z").getAsFloat());

                // Teleport position and rotation
                JsonObject transPosObj = entryObject.getAsJsonObject("tranPos");
                transPosition.setX(transPosObj.get("x").getAsFloat());
                transPosition.setY(transPosObj.get("y").getAsFloat());
                transPosition.setZ(transPosObj.get("z").getAsFloat());
                JsonObject transRotObj = entryObject.getAsJsonObject("tranRot");
                transPosition.setXRot(transRotObj.get("x").getAsFloat());
                transPosition.setYRot(transRotObj.get("y").getAsFloat());
                transPosition.setZRot(transRotObj.get("z").getAsFloat());

                // Add point to scene data
                sceneData.getTransPoints().put(pointId,
                    new SceneData.TransPoint(areaId, gadgetId, position, transPosition));
            }
        }
    }
}
