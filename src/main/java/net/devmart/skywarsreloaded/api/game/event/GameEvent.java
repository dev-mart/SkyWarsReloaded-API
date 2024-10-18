package net.devmart.skywarsreloaded.api.game.event;

import net.devmart.skywarsreloaded.api.data.config.YAMLConfig;
import net.devmart.skywarsreloaded.api.game.GameTemplate;
import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;
import net.devmart.skywarsreloaded.api.wrapper.event.*;

/**
 * Interface representing a game event in the SkyWars game.
 */
public interface GameEvent {

    /**
     * Loads the configuration for the event.
     *
     * @param config the YAML configuration section to load
     */
    void loadConfig(YAMLConfig config);

    /**
     * Gets the game template associated with this event.
     *
     * @return the game template
     */
    GameTemplate getGameTemplate();

    /**
     * Checks if the event is enabled.
     *
     * @return true if the event is enabled, false otherwise
     */
    boolean isEnabled();

    /**
     * Sets whether the event is enabled.
     *
     * @param enabled true to enable the event, false to disable it
     */
    void setEnabled(boolean enabled);

    /**
     * Checks if the event is repeatable.
     *
     * @return true if the event is repeatable, false otherwise
     */
    boolean isRepeatable();

    /**
     * Sets whether the event is repeatable.
     *
     * @param repeatable true to make the event repeatable, false otherwise
     */
    void setRepeatable(boolean repeatable);

    /**
     * Gets the interval at which the event repeats.
     *
     * @return the repeat interval in seconds
     */
    int getRepeatInterval();

    /**
     * Sets the interval at which the event repeats.
     *
     * @param repeatInterval the repeat interval in seconds
     */
    void setRepeatInterval(int repeatInterval);

    /**
     * Gets the maximum number of times the event can repeat.
     *
     * @return the maximum number of repeats
     */
    int getMaxRepeats();

    /**
     * Sets the maximum number of times the event can repeat.
     *
     * @param maxRepeats the maximum number of repeats
     */
    void setMaxRepeats(int maxRepeats);

    /**
     * Gets the duration of the event.
     *
     * @return the duration of the event in seconds
     */
    int getDuration();

    /**
     * Sets the duration of the event.
     *
     * @param duration the duration of the event in seconds
     */
    void setDuration(int duration);

    /**
     * Gets the chance of the event occurring.
     *
     * @return the chance of the event occurring as a percentage
     */
    int getChance();

    /**
     * Sets the chance of the event occurring.
     *
     * @param chance the chance of the event occurring as a percentage
     */
    void setChance(int chance);

    /**
     * Gets the minimum start time for the event.
     *
     * @return the minimum start time in seconds
     */
    int getMinStartTime();

    /**
     * Sets the minimum start time for the event.
     *
     * @param minStartTime the minimum start time in seconds
     */
    void setMinStartTime(int minStartTime);

    /**
     * Gets the maximum start time for the event.
     *
     * @return the maximum start time in seconds
     */
    int getMaxStartTime();

    /**
     * Sets the maximum start time for the event.
     *
     * @param maxStartTime the maximum start time in seconds
     */
    void setMaxStartTime(int maxStartTime);

    /**
     * Called when the event starts.
     *
     * @param gameInstance the game instance in which the event is starting
     */
    void onStart(LocalGameInstance gameInstance);

    /**
     * Called when the event stops.
     *
     * @param gameInstance the game instance in which the event is stopping
     */
    void onStop(LocalGameInstance gameInstance);

    /**
     * Called on each tick of the event.
     *
     * @param gameInstance the game instance in which the event is ticking
     */
    void onTick(LocalGameInstance gameInstance);

    /**
     * Checks if the event accepts other events while it is inactive.
     *
     * @return true if the event accepts other events while inactive, false otherwise
     */
    boolean isAcceptingEventsWhileInactive();

    /**
     * Checks if the event accepts ticking while it is inactive.
     *
     * @return true if the event accepts ticking while inactive, false otherwise
     */
    boolean isAcceptingTickingWhileInactive();

    /**
     * Called when a player interacts with the game.
     *
     * @param gameInstance the game instance in which the interaction is occurring
     * @param event        the player interaction event
     */
    void onInteraction(LocalGameInstance gameInstance, SWPlayerInteractEvent event);

    /**
     * Called when a block is placed in the game.
     *
     * @param gameInstance the game instance in which the block is being placed
     * @param event        the block place event
     */
    void onBlockPlace(LocalGameInstance gameInstance, SWBlockPlaceEvent event);

    /**
     * Called when a block is broken in the game.
     *
     * @param gameInstance the game instance in which the block is being broken
     * @param event        the block break event
     */
    void onBlockBreak(LocalGameInstance gameInstance, SWBlockBreakEvent event);

    /**
     * Called when an entity takes damage in the game.
     *
     * @param gameInstance the game instance in which the damage is occurring
     * @param event        the entity damage event
     */
    void onDamage(LocalGameInstance gameInstance, SWEntityDamageEvent event);

    /**
     * Called when a player drops an item in the game.
     *
     * @param gameInstance the game instance in which the item is being dropped
     * @param event        the player drop item event
     */
    void onItemDrop(LocalGameInstance gameInstance, SWPlayerDropItemEvent event);

    /**
     * Called when a player picks up an item in the game.
     *
     * @param gameInstance the game instance in which the item is being picked up
     * @param event        the player pickup item event
     */
    void onItemPickup(LocalGameInstance gameInstance, SWPlayerPickupItemEvent event);

    /**
     * Called when an entity spawns in the game.
     *
     * @param gameInstance the game instance in which the entity is spawning
     * @param event        the entity spawn event
     */
    void onEntitySpawn(LocalGameInstance gameInstance, SWEntitySpawnEvent event);
}
