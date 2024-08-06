package io.irminsul.game.data;

import io.irminsul.common.game.data.avatar.AvatarData;
import io.irminsul.common.game.data.avatar.AvatarSkillDepotData;
import io.irminsul.common.game.data.item.WeaponData;
import io.irminsul.common.game.data.scene.SceneData;
import io.irminsul.game.data.parser.*;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Container class for game data.
 * <p>
 * This class is responsible for storing and loading game data. This class is entirely static, and contains several
 * maps for accessing cached data by ID, or some other key that is relevant for the data type. Data is accessed via
 * {@code getOrLoad___} methods that cache the requested data if not already cached.
 * <p>
 * This class utilizes the parsers within the {@code io.irminsul.game.data.parser} package to parse data from the raw
 * files into high level forms.
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
     * A map of loaded avatar abilities, keyed by avatar name
     */
    private final Map<String, List<String>> loadedAbilities = new HashMap<>();

    /**
     * A map of loaded weapons and their {@link WeaponData}, keyed by weapon IDs
     */
    private final Map<Integer, WeaponData> loadedWeapons = new HashMap<>();

    /**
     * Gets a scene's {@link SceneData} by scene ID, attempting to load the scene data if not already loaded
     * @param sceneId The ID of the scene to fetch the data for
     * @return The scene's {@link SceneData}
     */
    public @NotNull SceneData getOrLoadSceneData(int sceneId) {
        if (loadedScenes.containsKey(sceneId)) {
            return loadedScenes.get(sceneId);
        }
        return loadSceneData(sceneId);
    }

    private @NotNull SceneData loadSceneData(int sceneId) {
        logger.debug("Loading scene {}", sceneId);

        SceneData sceneData = SceneDataParser.parseSceneData(sceneId);
        loadedScenes.put(sceneId, sceneData);

        logger.debug("Finished loading scene {}!", sceneId);
        return sceneData;
    }

    /**
     * Gets an avatar's {@link AvatarData} by avatar ID, attempting to load the avatar data if not already loaded
     * @param avatarId The ID of the avatar to fetch the data for
     * @return The avatar's {@link AvatarData}
     */
    public @NotNull AvatarData getOrLoadAvatarData(int avatarId) {
        if (loadedAvatars.containsKey(avatarId)) {
            return loadedAvatars.get(avatarId);
        }
        return loadAvatarData(avatarId);
    }

    private @NotNull AvatarData loadAvatarData(int avatarId) {
        logger.debug("Loading avatar {}", avatarId);

        AvatarData avatarData = AvatarDataParser.parseAvatarData(avatarId);
        loadedAvatars.put(avatarId, avatarData);

        logger.debug("Finished loading avatar {}!", avatarId);
        return avatarData;
    }

    /**
     * Gets a skill depot's {@link AvatarSkillDepotData} by skill depot ID, attempting to load the skill depot data
     * if not already loaded
     * @param skillDepotId The ID of the skill depot to fetch the data for
     * @return The skill depot's {@link AvatarSkillDepotData}
     */
    public @NotNull AvatarSkillDepotData getOrLoadSkillDepotData(int skillDepotId) {
        if (loadedSkillDepots.containsKey(skillDepotId)) {
            return loadedSkillDepots.get(skillDepotId);
        }
        return loadSkillDepotData(skillDepotId);
    }

    private @NotNull AvatarSkillDepotData loadSkillDepotData(int avatarId) {
        logger.debug("Loading skill depot {}", avatarId);

        AvatarSkillDepotData skillDepotData = AvatarSkillDepotDataParser.parseSkillDepotData(avatarId);
        loadedSkillDepots.put(avatarId, skillDepotData);

        logger.debug("Finished loading skill depot {}!", avatarId);
        return skillDepotData;
    }

    /**
     * Gets an avatar's abilities (list of ability names) by avatar name, attempting to load the ability names if not
     * already loaded
     * @param avatarName The name of the avatar to fetch the abilities of
     * @return The avatar's abilities, as a list of names
     */
    public @NotNull List<String> getOrLoadAbilities(String avatarName) {
        if (loadedAbilities.containsKey(avatarName)) {
            return loadedAbilities.get(avatarName);
        }
        return loadAbilities(avatarName);
    }

    private @NotNull List<String> loadAbilities(String avatarName) {
        logger.debug("Loading {}'s abilities", avatarName);

        List<String> abilities = AvatarAbilityParser.parseAvatarAbilities(avatarName);
        loadedAbilities.put(avatarName, abilities);

        logger.debug("Finished loading {}'s abilities!", avatarName);
        return abilities;
    }

    /**
     * Gets a weapon's {@link WeaponData} by weapon ID, attempting to load the weapon data if not already loaded
     * @param weaponId The ID of the weapon to fetch the data for
     * @return The weapon's {@link WeaponData}
     */
    public @NotNull WeaponData getOrLoadWeaponData(int weaponId) {
        if (loadedWeapons.containsKey(weaponId)) {
            return loadedWeapons.get(weaponId);
        }
        return loadWeaponData(weaponId);
    }

    private @NotNull WeaponData loadWeaponData(int weaponId) {
        logger.debug("Loading weapon {}", weaponId);

        WeaponData weaponData = WeaponDataParser.parseWeaponData(weaponId);
        loadedWeapons.put(weaponId, weaponData);

        logger.debug("Finished loading weapon {}!", weaponId);
        return weaponData;
    }
}
