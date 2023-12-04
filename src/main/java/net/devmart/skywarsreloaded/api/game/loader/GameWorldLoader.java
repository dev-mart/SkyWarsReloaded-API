package net.devmart.skywarsreloaded.api.game.loader;

import net.devmart.skywarsreloaded.api.game.GameTemplate;
import net.devmart.skywarsreloaded.api.game.gameinstance.GameInstance;
import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;

import java.util.concurrent.CompletableFuture;

public interface GameWorldLoader {

    /**
     * Create an instance of a minecraft world for the given {@link GameInstance} based on the template associated
     *
     * @param gameWorld The {@link LocalGameInstance} used to determine data to be loaded
     * @return {@link CompletableFuture<Boolean>} that yields true if the world was successfully generated, false otherwise
     */
    CompletableFuture<Boolean> generateWorldInstance(LocalGameInstance gameWorld) throws IllegalStateException, IllegalArgumentException;

    /**
     * Create an empty world for the corresponding {@link GameInstance}.
     *
     * @param gameInstance {@link LocalGameInstance} to create a void world for.
     * @return {@link CompletableFuture<Void>} which completes when the world is finished creating.
     */
    CompletableFuture<Void> createEmptyWorld(LocalGameInstance gameInstance);

    /**
     * Delete the world instance for the provided {@link LocalGameInstance}.
     *
     * @param gameWorld The {@link LocalGameInstance} to delete the world for
     */
    void deleteWorldInstance(LocalGameInstance gameWorld);

    /**
     * Delete the stored template map data for the given {@link GameTemplate}
     *
     * @param gameTemplate The {@link GameTemplate} to delete the map for
     */
    void deleteMap(GameTemplate gameTemplate, boolean forceUnloadInstances);

    /**
     * Create the base platform to spawn on when editing the map for the first time.
     *
     * @param gameInstance The {@link LocalGameInstance} to create the platform in.
     */
    void createBasePlatform(LocalGameInstance gameInstance);

    /**
     * Update the World Border for the target {@link GameInstance}.
     *
     * @param gameInstance {@link GameInstance} to update the border of.
     */
    void updateWorldBorder(LocalGameInstance gameInstance);

    /**
     * Save the current world to disk for future use when creating instances of the map.
     */
    CompletableFuture<Boolean> save(LocalGameInstance gameInstance);

}
