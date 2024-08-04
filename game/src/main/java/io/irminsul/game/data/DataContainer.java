package io.irminsul.game.data;

import io.irminsul.common.game.data.avatar.AvatarData;
import io.irminsul.common.game.data.avatar.AvatarSkillDepotData;
import io.irminsul.common.game.data.scene.SceneData;
import io.irminsul.game.data.parser.AvatarDataParser;
import io.irminsul.game.data.parser.AvatarSkillDepotDataParser;
import io.irminsul.game.data.parser.SceneDataParser;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
     * A map of loaded avatars and their {@link AvatarData}, keyed by avatar IDs
     */
    private final Map<Integer, AvatarData> loadedAvatars = new HashMap<>();

    /**
     * A map of loaded skill depots and their {@link AvatarSkillDepotData}, keyed by skill depot ID
     */
    private final Map<Integer, AvatarSkillDepotData> loadedSkillDepots = new HashMap<>();

    /**
     * Gets a scene's {@link SceneData} by scene ID, attempting to load the scene data if not already loaded
     * @param sceneId The ID of the scene to load the data for
     * @return The scene's {@link SceneData}
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

    /**
     * Gets an avatar's {@link AvatarData} by avatar ID, attempting to load the avatar data if not already loaded
     * @param avatarId The ID of the avatar to load the data for
     * @return The avatar's {@link AvatarData}
     */
    public @NotNull AvatarData getOrLoadAvatarData(int avatarId) {
        if (loadedAvatars.containsKey(avatarId)) {
            return loadedAvatars.get(avatarId);
        }
        return loadAvatarData(avatarId);
    }

    private @NotNull AvatarData loadAvatarData(int avatarId) {
        logger.info("Loading avatar {}", avatarId);

        AvatarData avatarData = AvatarDataParser.parseAvatarData(avatarId);
        loadedAvatars.put(avatarId, avatarData);

        logger.info("Finished loading avatar {}!", avatarId);
        return avatarData;
    }

    /**
     * Gets a skill depot's {@link AvatarSkillDepotData} by skill depot ID, attempting to load the skill depot data
     * if not already loaded
     * @param skillDepotId The ID of the skill depot to load the data for
     * @return The skill depot's {@link AvatarSkillDepotData}
     */
    public @NotNull AvatarSkillDepotData getOrLoadSkillDepotData(int skillDepotId) {
        if (loadedSkillDepots.containsKey(skillDepotId)) {
            return loadedSkillDepots.get(skillDepotId);
        }
        return loadSkillDepotData(skillDepotId);
    }

    private @NotNull AvatarSkillDepotData loadSkillDepotData(int avatarId) {
        logger.info("Loading skill depot {}", avatarId);

        AvatarSkillDepotData skillDepotData = AvatarSkillDepotDataParser.parseSkillDepotData(avatarId);
        loadedSkillDepots.put(avatarId, skillDepotData);

        logger.info("Finished loading skill depot {}!", avatarId);
        return skillDepotData;
    }
}
