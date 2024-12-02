package io.irminsul.common.game.player;

import io.irminsul.common.game.GameServer;
import io.irminsul.common.game.database.PlayerData;
import io.irminsul.common.game.net.Session;
import io.irminsul.common.game.Tickable;
import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.world.Position;
import io.irminsul.common.game.world.Scene;
import io.irminsul.common.game.world.Teleport;
import io.irminsul.common.game.world.World;
import io.irminsul.common.proto.MotionStateOuterClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

/**
 * A representation of an online player
 */
public interface Player extends Tickable {

    // ================================================================ //
    //                               Core                               //
    // ================================================================ //

    /**
     * @return The {@link Session} this player is connecting through
     */
    @NotNull Session getSession();

    /**
     * @return The {@link GameServer} this player is connected to
     */
    @NotNull GameServer getServer();

    /**
     * Sets the {@link Session} that this player is connecting through
     * @param session The new session that this player is connecting through
     */
    void setSession(@NotNull Session session);

    /**
     * @return This player's UID
     */
    int getUid();

    /**
     * @return This player's social profile
     */
    @NotNull PlayerProfile getProfile();


    // ================================================================ //
    //                               Data                               //
    // ================================================================ //

    /**
     * @return A map of properties that this player has
     */
    @NotNull Map<Integer, Integer> getProperties();

    /**
     * @return A list of {@link Avatar}s this player owns
     */
    @NotNull List<Avatar> getAvatars();

    /**
     * @return A list, by ID, of chat emojis this player has unlocked
     */
    @NotNull List<Integer> getChatEmojis();

    /**
     * @return A list, by ID, of gliders this player owns
     */
    @NotNull List<Integer> getOwnedFlyCloaks();

    /**
     * @return A list, by ID, of avatar costumes this player owns
     */
    @NotNull List<Integer> getOwnedCostumes();

    /**
     * @return A list, by ID, of name cards this player owns
     */
    @NotNull List<Integer> getOwnedNameCards();

    // ================================================================ //
    //                               World                              //
    // ================================================================ //

    /**
     * @return This player's current {@link World}
     */
    @NotNull World getWorld();

    /**
     * @return This player's current scene, or null if none exists
     */
    @Nullable Scene getScene();

    /**
     * @return This player's current {@link Position} within their scene
     */
    @NotNull Position getPosition();

    /**
     * @return This player's current {@link MotionStateOuterClass.MotionState}
     */
    @NotNull MotionStateOuterClass.MotionState getMotionState();

    /**
     * @return The ID of this player's current scene
     */
    int getSceneId();

    /**
     * Sets this player's current scene ID. This does not teleport this player to the scene! Use
     * {@link Player#sendToScene(int)} to send the player to a new scene
     * @param sceneId The new scene ID to store
     */
    void setSceneId(int sceneId);

    /**
     * @return This player's current token used to transfer between scenes
     */
    int getEnterSceneToken();

    /**
     * Sets this player's token to be used to transfer between scenes
     * @param enterSceneToken The new token to store
     */
    void setEnterSceneToken(int enterSceneToken);

    /**
     * @return This player's peer ID to their world
     */
    int getPeerId();

    // ================================================================ //
    //                             Managers                             //
    // ================================================================ //

    /**
     * @return This player's {@link PlayerTeamManager} instance
     */
    @NotNull PlayerTeamManager getTeamManager();

    /**
     * @return This player's game progress container
     */
    @NotNull PlayerProgress getProgress();

    /**
     * @return This player's {@link PlayerInventory} instance
     */
    @NotNull PlayerInventory getInventory();

    // ================================================================ //
    //                             Function                             //
    // ================================================================ //

    /**
     * Execute the login process for this player, sending them to the overworld scene
     */
    void login();

    /**
     * Executes the logout process for this player, saving their data and closing their connection
     */
    void logout();

    /**
     * Create a new world for this player and register it
     */
    void createWorld();

    /**
     * @return This next free GUID to assign. Calling this method will mark the returned value as used.
     */
    long getNextGuid();

    /**
     * Gives this player the provided avatar
     * @param avatar The avatar to give the player
     */
    void addAvatar(@NotNull Avatar avatar);

    /**
     * Attempts to look up an avatar this player owns by GUID
     * @param guid The GUID of the avatar to look up
     * @return An {@link Avatar} instance if one was found, otherwise {@code null}
     */
    @Nullable Avatar getAvatar(long guid);

    /**
     * Sends this player to a specified scene at the default spawn position
     * @param sceneId The scene to send the player to
     */
    void sendToScene(int sceneId);

    /**
     * Sends this player to a specified scene at the default spawn position
     * @param sceneId The scene to send the player to
     * @param reason The reason for the teleport
     */
    void sendToScene(int sceneId, int reason);

    /**
     * Sends this player to a specified scene at a specified position
     * @param sceneId The scene to send the player to
     * @param position The position within the new scene to send the player to
     */
    void sendToScene(int sceneId, @NotNull Position position);

    /**
     * Sends this player to a specified scene at a specified position
     * @param sceneId The scene to send the player to
     * @param position The position within the new scene to send the player to
     * @param reason The reason for the teleport
     */
    void sendToScene(int sceneId, @NotNull Position position, int reason);

    /**
     * Sends this player to a scene at a specified position
     * @param teleport The teleport data to use
     */
    void sendToScene(Teleport teleport);

    /**
     * Sends this player to a specified position within their current scene
     * @param position The position within the current scene to send the player to
     */
    void teleport(@NotNull Position position);

    /**
     * Award this player a certain amount of AR exp
     * @param exp The amount of EXP to award
     */
    void awardExp(int exp);

    /**
     * @return The amount of primogems (H coins) held by this player
     */
    int getPrimogems();

    /**
     * Sets the amount of primogems (H coins) held by this player
     * @param primogems The new amount of primogems
     */
    void setPrimogems(int primogems);

    /**
     * @return The amount of genesis crystals (M coins) held by this player
     */
    int getCrystals();

    /**
     * Sets the amount of genesis crystals (M coins) held by this player
     * @param genesisCrystals The new amount of genesis crystals
     */
    void setCrystals(int genesisCrystals);

    /**
     * @return The amount of mora (S coins) held by this player
     */
    int getMora();

    /**
     * Sets the amount of mora (S coins) held by this player
     * @param mora The new amount of genesis mora
     */
    void setMora(int mora);

    /**
     * @return The amount of home coins held by this player
     */
    int getHomeCoins();

    /**
     * Sets the amount of home coins held by this player
     * @param homeCoins The new amount of home coins
     */
    void setHomeCoins(int homeCoins);

    /**
     * Exports this player's data
     * @return This player's data, as a {@link PlayerData} instance
     */
    @NotNull PlayerData exportData();

    /**
     * Imports this player's data
     * @param data The data to load, as a {@link PlayerData} instance
     */
    void importData(@NotNull PlayerData data);
}
