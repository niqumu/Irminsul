package io.irminsul.common.game.data;

import io.irminsul.common.game.ServerSystem;
import io.irminsul.common.game.data.avatar.AvatarData;
import io.irminsul.common.game.data.avatar.AvatarSkillDepotData;
import io.irminsul.common.game.data.dungeon.DungeonData;
import io.irminsul.common.game.data.misc.OpenStateData;
import io.irminsul.common.game.data.scene.SceneData;
import io.irminsul.common.game.data.weapon.WeaponData;
import io.irminsul.common.game.data.weapon.WeaponPromotionData;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface DataContainer extends ServerSystem {

    /**
     * @return The directory this data container is pulling data from, as a {@link File}
     */
    @NotNull File getDataDirectory();

    /**
     * Gets a scene's {@link SceneData} by scene ID, attempting to load the scene data if not already loaded
     * @param sceneId The ID of the scene to fetch the data for
     * @return The scene's {@link SceneData}
     */
    @NotNull SceneData getOrLoadSceneData(int sceneId);

    /**
     * Gets an avatar's {@link AvatarData} by avatar ID, attempting to load the avatar data if not already loaded
     * @param avatarId The ID of the avatar to fetch the data for
     * @return The avatar's {@link AvatarData}
     */
    @NotNull AvatarData getOrLoadAvatarData(int avatarId);

    /**
     * Gets a skill depot's {@link AvatarSkillDepotData} by skill depot ID, attempting to load the skill depot data
     * if not already loaded
     * @param skillDepotId The ID of the skill depot to fetch the data for
     * @return The skill depot's {@link AvatarSkillDepotData}
     */
    @NotNull AvatarSkillDepotData getOrLoadSkillDepotData(int skillDepotId);

    /**
     * Gets an avatar's abilities (list of ability names) by avatar name, attempting to load the ability names if not
     * already loaded
     * @param avatarName The name of the avatar to fetch the abilities of
     * @return The avatar's abilities, as a list of names
     */
    @NotNull List<String> getOrLoadAbilities(String avatarName);

    /**
     * Gets a weapon's {@link WeaponData} by weapon ID, attempting to load the weapon data if not already loaded
     * @param weaponId The ID of the weapon to fetch the data for
     * @return The weapon's {@link WeaponData}
     */
    @NotNull WeaponData getOrLoadWeaponData(int weaponId);

    /**
     * Gets a weapon stat curve's {@code level -> multiplier} mapping, attempting to load the curve data if not
     * already loaded
     * <p>
     * NOTE: The "level" in this case isn't actually the level of the weapon, but the level of the weapon divided by
     * the maximum level of the weapon, times 100. Isn't this fun?
     * @param curveType The internal name of the stat curve to fetch the data for
     * @return The stat curve's {@code level -> multiplier} mapping
     */
    @NotNull Map<Integer, Float> getOrLoadWeaponCurve(String curveType);

    /**
     * Gets a weapon's {@code promotion level -> WeaponPromotionData} mapping, attempting to load the promotion
     * data if not already loaded
     * @param weaponId The ID the weapon to fetch the data for
     * @return The weapon's {@code promotion level -> WeaponPromotionData} mapping
     */
    @NotNull Map<Integer, WeaponPromotionData> getOrLoadWeaponPromotions(int weaponId);

    /**
     * Gets a dungeon/domain's {@link DungeonData} by dungeon ID, attempting to load the data if not already loaded
     * @param dungeonId The ID of the dungeon to fetch the data for
     * @return The dungeon's {@link DungeonData}
     */
    @NotNull DungeonData getOrLoadDungeonData(int dungeonId);

    /**
     * Gets an open state's {@link OpenStateData} by open state ID
     * @param openState The ID of the open state to fetch the data for
     * @return The open state's {@link OpenStateData}
     */
    @NotNull OpenStateData getOpenStateData(int openState);

    /**
     * Gets a list of all known open states and their {@link OpenStateData}
     * @return A list of all known open states
     */
    @NotNull List<OpenStateData> getAllOpenStateData();
}
