package io.irminsul.common.game.player;

import io.irminsul.common.game.Session;
import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.world.Position;
import io.irminsul.common.game.world.Scene;
import io.irminsul.common.game.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * A representation of an Irminsul player
 */
public interface Player extends Serializable {

    // ================================================================ //
    //                               Core                               //
    // ================================================================ //

    /**
     * @return The {@link Session} this player is connecting through
     */
    @NotNull Session getSession();

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

    // ================================================================ //
    //                             Function                             //
    // ================================================================ //

    /**
     * Execute the login process for this player, sending them to the overworld scene
     */
    void login();

    /**
     * Create a new world for this player and register it
     */
    void createWorld();

    /**
     * @return This next free GUID to assign. Calling this method will mark the returned value as used.
     */
    long getNextGuid();

    /**
     * Sends this player to a specified scene
     * @param sceneId The scene to send the player to
     */
    void sendToScene(int sceneId);

    /**
     * Sends this player to a specified scene at a specified position
     * @param sceneId The scene to send the player to
     * @param position The position within the new scene to send the player to
     */
    void sendToScene(int sceneId, @NotNull Position position);
}
