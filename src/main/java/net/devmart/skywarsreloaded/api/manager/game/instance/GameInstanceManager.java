package net.devmart.skywarsreloaded.api.manager.game.instance;

import net.devmart.skywarsreloaded.api.game.GameTemplate;
import net.devmart.skywarsreloaded.api.game.gameinstance.GameInstance;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface GameInstanceManager<G extends GameInstance> {

    /**
     * Load all {@link GameTemplate} from storage into memory.
     */
    void loadAllGameTemplates();

    /**
     * Get a {@link GameTemplate} by its name/identifier.
     *
     * @param gameId Identifier of the template.
     * @return {#link GameTemplate} if found, null otherwise.
     */
    GameTemplate getGameTemplateByName(String gameId);

    /**
     * Get a list of all game instances.
     *
     * @return List of all game instances.
     */
    Collection<G> getGameInstancesList();

    /**
     * Get a list of all GameInstances that were created under a specified template.
     *
     * @param template The template to get the game instances of.
     * @return List of all {@link GameInstance}s made using the template.
     */
    List<G> getGameInstancesByTemplate(GameTemplate template);

    /**
     * Get a list of idle instances that have no assigned template.
     *
     * @return List of idle instances.
     */
    List<G> getIdleGameInstances();

    /**
     * Delete a game template from the skywars registry and optionally from the active storage method
     *
     * @param gameId       The template name to delete
     * @param deleteRemote If true, the map will be deleted as well
     * @return If the map deletion was successful
     */
    boolean deleteGameTemplate(String gameId, boolean deleteRemote);

    /**
     * Get all the currently known game templates
     *
     * @return A list of all the game templates
     */
    List<GameTemplate> getGameTemplatesCopy();

    /**
     * Create a new {@link GameTemplate} with the id/name specified if it doesn't already exist.
     *
     * @param gameId The name of the game template
     * @return The created {@link GameTemplate} or null when a template with that name already exists
     */
    GameTemplate createGameTemplate(String gameId);

    /**
     * Create a new {@link GameInstance} from a {@link GameTemplate}.
     *
     * @param data GameTemplate to create a world from.
     * @return The newly created {@link GameInstance}.
     */
    CompletableFuture<G> createGameInstance(GameTemplate data);

    /**
     * Remove a game instance from running.
     *
     * @param instance GameInstance to remove.
     */
    CompletableFuture<Void> deleteGameInstance(G instance);

    /**
     * Get a GameInstance by its assigned world name.
     *
     * @param worldName Name of the world to look up.
     * @return {@link GameInstance} if found, null otherwise.
     */
    G getGameInstanceByWorldName(String worldName);


    /**
     * Request that the instance provided be used to update the template it is based on.
     * This is primarily used in map editing to save changes.
     * If the save succeeded, the {@link CompletableFuture<Boolean>} will return true.
     * If the save failed, the {@link CompletableFuture<Boolean>} will return false.
     *
     * @param instance The game instance used to update the template
     * @return A {@link CompletableFuture<Boolean>} which completes when the save has succeeded or failed.
     */
    CompletableFuture<Boolean> saveInstanceToTemplate(G instance);

    /**
     * Check whether the game instance manager is managing remote games only.
     *
     * @return True if the game instance manager is managing remote games only, false otherwise.
     */
    boolean isManagerRemote();

    G getGameInstanceById(UUID uuid);

    /**
     * Get a list of all game instances that are playable (not in progress, not full, etc).
     *
     * @param templates Optional templates to filter by. Leave empty to get all playable game instances.
     * @return List of all playable game instances.
     */
    List<G> getPlayableGameInstances(GameTemplate... templates);

    /**
     * Get a list of all game instances that are playable (not in progress, not full, etc).
     *
     * @param sortByPlayerCount Whether to sort the list by player count (descending).
     * @param templates         Optional templates to filter by. Leave empty to get all playable game instances.
     * @return List of all playable game instances.
     */
    List<G> getPlayableGameInstances(boolean sortByPlayerCount, GameTemplate... templates);

}
