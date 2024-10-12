package net.devmart.skywarsreloaded.api.manager.game;

import net.devmart.skywarsreloaded.api.game.GameTemplate;
import net.devmart.skywarsreloaded.api.game.event.GameEvent;
import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;

/**
 * Interface for managing game events in the SkyWars game.
 */
public interface GameEventManager {

    /**
     * Registers a game event with a specified ID and event class.
     *
     * @param id the unique identifier for the game event
     * @param eventClass the class of the game event to register
     */
    void registerGameEvent(String id, Class<? extends GameEvent> eventClass);

    /**
     * Unregisters a game event by its ID.
     *
     * @param id the unique identifier for the game event to unregister
     */
    void unregisterGameEvent(String id);

    /**
     * Unregisters a game event by its class.
     *
     * @param eventClass the class of the game event to unregister
     */
    void unregisterGameEvent(Class<? extends GameEvent> eventClass);

    /**
     * Retrieves the class of a game event by its ID.
     *
     * @param id the unique identifier for the game event
     * @return the class of the game event associated with the given ID
     */
    Class<? extends GameEvent> getGameEvent(String id);

    /**
     * Creates an instance of a game event for a specific game template.
     *
     * @param eventId the unique identifier for the game event
     * @param gameTemplate the game template for which the event instance is created
     * @return an instance of the game event
     */
    GameEvent createGameEvent(String eventId, GameTemplate gameTemplate);

    GameInstanceEventManager createGameInstanceEventManager(LocalGameInstance gameInstance);

}