package net.devmart.skywarsreloaded.api.wrapper.world;

import net.devmart.skywarsreloaded.api.utils.SWCoord;
import net.devmart.skywarsreloaded.api.wrapper.Item;
import net.devmart.skywarsreloaded.api.wrapper.ParticleEffect;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWDroppedItem;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import net.devmart.skywarsreloaded.api.wrapper.world.block.SWBlock;

import java.util.List;

public interface SWWorld {

    /**
     * Get all the players that are currently in this world
     *
     * @return A list of the players in this world
     */
    List<SWPlayer> getAllPlayers();

    /**
     * Set the block at a location to a block type
     *
     * @param location The location of where to set the spawn
     * @param block    The block to set at that location
     */
    void setBlockAt(SWCoord location, Item block);

    /**
     * Set the block at a location to a block type
     *
     * @param location  The location of where to set the spawn
     * @param blockName The name of the block to set at that location
     */
    void setBlockAt(SWCoord location, String blockName);

    /**
     * Get a block at a specific location.
     *
     * @param location {@link SWCoord} The location of the block to get
     * @return A {@link SWBlock} at the location
     */
    SWBlock getBlockAt(SWCoord location);

    /**
     * Get a block at a specific location.
     *
     * @param x The x coordinate of the block to get
     * @param y The y coordinate of the block to get
     * @param z The z coordinate of the block to get
     * @return A {@link SWBlock} at the location
     */
    SWBlock getBlockAt(int x, int y, int z);

    /**
     * Get the world's name
     *
     * @return The world's name
     */
    String getName();

    /**
     * Get the world's default spawn location
     *
     * @return {@link SWCoord} of the world's default spawn location
     */
    SWCoord getDefaultSpawnLocation();

    /**
     * Unload the wrapped world from the server
     *
     * @param saveChunks Whether to save the chunks before unloading
     */
    void unload(boolean saveChunks);

    /**
     * Get if the world that is wrapped is loaded / exists
     *
     * @return If the world is loaded
     */
    boolean isLoaded();

    /**
     * Set whether spawn chunks should automatically be always loaded
     *
     * @param keepSpawnLoaded true if spawn chunk should always be loaded.
     */
    void setKeepSpawnLoaded(boolean keepSpawnLoaded);

    /**
     * Get the time of the world
     *
     * @return The time of the world
     */
    long getTime();

    /**
     * Set the time of the world
     *
     * @param time The time to set the world to
     */
    void setTime(long time);

    /**
     * Get whether it is currently raining in the world
     *
     * @return True if it is raining, false otherwise
     */
    boolean isRaining();

    /**
     * Set whether it is currently raining in the world
     *
     * @param raining True if it is raining, false otherwise
     */
    void setRaining(boolean raining);

    /**
     * Get whether it is currently thundering in the world
     *
     * @return True if it is thundering, false otherwise
     */
    boolean isThundering();

    /**
     * Set whether it is currently thundering in the world
     *
     * @param thunder True if it is thundering, false otherwise
     */
    void setThundering(boolean thunder);

    /**
     * Drop an item naturally at a location
     *
     * @param location The location to drop the item
     * @param item     The item to drop
     * @return The dropped item entity
     */
    SWDroppedItem dropItemNaturally(SWCoord location, Item item);

    void spawnParticle(SWCoord location, ParticleEffect particleEffect);

}
