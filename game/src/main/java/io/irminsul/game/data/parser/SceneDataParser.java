package io.irminsul.game.data.parser;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.irminsul.common.game.data.scene.DungeonEntryPoint;
import io.irminsul.common.game.data.scene.SceneData;
import io.irminsul.common.game.data.scene.TransPoint;
import io.irminsul.common.game.data.scene.TransPointType;
import io.irminsul.common.game.world.Position;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// todo ensure the resources exist ahead of time so the server crashes at startup rather than randomly
@UtilityClass
public class SceneDataParser {

    private final Logger logger = LoggerFactory.getLogger("Scene Data Parser");

    private final Gson gson = new Gson();

    public @NotNull SceneData parseSceneData(int sceneId) {
        SceneData sceneData = new SceneData(Position.ORIGIN());

        // Main scene lua
        File sceneLua = new File("data/lua/scene/" + sceneId + "/scene" + sceneId + ".lua");
        if (sceneLua.exists()) {
            try {
                parseSceneLua(sceneData, sceneLua);
                logger.info("Parsed and loaded data from {}", sceneLua.getName());
            } catch (Exception e) {
                logger.error("Fatal: Failed to load scene lua file for scene {}: {}", sceneId, e.toString());
                System.exit(1);
            }
        } else {
            logger.error("Fatal: Missing scene lua file for for scene {}!", sceneId);
            System.exit(1);
        }

        // Scene points
        File scenePoints = new File("data/lua/scene/" + sceneId + "/scene" + sceneId + "_point.json");
        if (scenePoints.exists()) {
            try {
                parseScenePoints(sceneData, scenePoints);
                logger.info("Parsed and loaded scene points from {}", scenePoints.getName());
            } catch (Exception e) {
                logger.error("Fatal: Failed to load scene points file for scene {}: {}", sceneId, e.toString());
                System.exit(1);
            }
        } else {
            logger.error("Fatal: Missing scene points file for for scene {}!", sceneId);
            System.exit(1);
        }

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

            switch (entryObject.get("$type").getAsString()) {
                case "SceneTransPoint" -> parseTransPoint(sceneData, pointId, entryObject);
                case "DungeonEntry" -> parseDungeonEntry(sceneData, pointId, entryObject);
            }
        }
    }

    private void parseTransPoint(SceneData sceneData, int pointId, JsonObject point) {

        // IDs
        int areaId = point.get("areaId").getAsInt();
        int gadgetId = point.get("gadgetId").getAsInt();

        // Position and rotation
        Position position = Position.ORIGIN();
        JsonObject posObj = point.getAsJsonObject("pos");
        position.setX(posObj.get("x").getAsFloat());
        position.setY(posObj.get("y").getAsFloat());
        position.setZ(posObj.get("z").getAsFloat());
        JsonObject rotObj = point.getAsJsonObject("rot");
        position.setXRot(rotObj.get("x").getAsFloat());
        position.setYRot(rotObj.get("y").getAsFloat());
        position.setZRot(rotObj.get("z").getAsFloat());

        // Teleport position and rotation
        Position transPosition = Position.ORIGIN();
        JsonObject transPosObj = point.getAsJsonObject("tranPos");
        transPosition.setX(transPosObj.get("x").getAsFloat());
        transPosition.setY(transPosObj.get("y").getAsFloat());
        transPosition.setZ(transPosObj.get("z").getAsFloat());
        JsonObject transRotObj = point.getAsJsonObject("tranRot");
        transPosition.setXRot(transRotObj.get("x").getAsFloat());
        transPosition.setYRot(transRotObj.get("y").getAsFloat());
        transPosition.setZRot(transRotObj.get("z").getAsFloat());

        // Type
        TransPointType type = TransPointType.of(point.get("pointType").getAsString());

        // Add point to scene data
        sceneData.getTransPoints().put(pointId, new TransPoint(areaId, gadgetId, position, transPosition, type));
    }

    private void parseDungeonEntry(SceneData sceneData, int pointId, JsonObject point) {

        // IDs
        int areaId = point.get("areaId").getAsInt();
        int gadgetId = point.get("gadgetId").getAsInt();

        // Position and rotation
        Position position = Position.ORIGIN();
        JsonObject posObj = point.getAsJsonObject("pos");
        position.setX(posObj.get("x").getAsFloat());
        position.setY(posObj.get("y").getAsFloat());
        position.setZ(posObj.get("z").getAsFloat());
        JsonObject rotObj = point.getAsJsonObject("rot");
        position.setXRot(rotObj.get("x").getAsFloat());
        position.setYRot(rotObj.get("y").getAsFloat());
        position.setZRot(rotObj.get("z").getAsFloat());

        // Teleport position and rotation
        Position transPosition = Position.ORIGIN();
        JsonObject transPosObj = point.getAsJsonObject("tranPos");
        transPosition.setX(transPosObj.get("x").getAsFloat());
        transPosition.setY(transPosObj.get("y").getAsFloat());
        transPosition.setZ(transPosObj.get("z").getAsFloat());
        JsonObject transRotObj = point.getAsJsonObject("tranRot");
        transPosition.setXRot(transRotObj.get("x").getAsFloat());
        transPosition.setYRot(transRotObj.get("y").getAsFloat());
        transPosition.setZRot(transRotObj.get("z").getAsFloat());

        // Type
        TransPointType type = TransPointType.of(point.get("pointType").getAsString());

        // Dungeon IDs
        List<Integer> dungeonIds = List.of(gson.fromJson(point.get("dungeonIds"), Integer[].class));

        // Add point to scene data
        sceneData.getTransPoints().put(pointId,
            new TransPoint(areaId, gadgetId, position, transPosition, type));
        sceneData.getDungeonEntryPoints().put(pointId,
            new DungeonEntryPoint(areaId, gadgetId, position, transPosition, type, dungeonIds));
    }
}
