package net.devmart.skywarsreloaded.api.game.loader;

import net.devmart.skywarsreloaded.api.game.GameTemplate;
import net.devmart.skywarsreloaded.api.game.gameinstance.GameInstance;
import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;

import java.util.concurrent.CompletableFuture;

public interface GameWorldLoader {

    /**
     * Create an instance of a minecraft world for the given game world based on the template associated
     *
     * @param gameWorld The {@link LocalGameInstance} used to determine data to be loaded
     * @return true if the template data already exists given the template name
     */
    CompletableFuture<Boolean> generateWorldInstance(LocalGameInstance gameWorld) throws IllegalStateException, IllegalArgumentException;

    /**
     * Create an empty world for the corresponding GameWorld.
     *
     * @param gameWorld {@link LocalGameInstance} to create a void world for.
     * @return {@link CompletableFuture<Void>} which completes when the world is finished creating.
     */
    CompletableFuture<Void> createEmptyWorld(LocalGameInstance gameWorld);

    /**
     * Delete the world instance for the {@link LocalGameInstance} provided
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
     * @param gameWorld The {@link LocalGameInstance} to create the platform in.
     */
    void createBasePlatform(LocalGameInstance gameWorld);

    /**
     * Update the World Border for the target {@link GameInstance}.
     *
     * @param gameWorld {@link GameInstance} to update the border of.
     */
    void updateWorldBorder(LocalGameInstance gameWorld);

    /**
     * Save the current world to disk for future use when creating instances of the map.
     */
    CompletableFuture<Boolean> save(LocalGameInstance gameWorld);

}
