package net.devmart.skywarsreloaded.api.manager.game;

import net.devmart.skywarsreloaded.api.event.SWEvent;
import net.devmart.skywarsreloaded.api.game.event.GameEvent;
import net.devmart.skywarsreloaded.api.game.event.GameInstanceEvent;

import java.util.List;

/**
 * Interface for managing game instance events.
 */
public interface GameInstanceEventManager {

    /**
     * Adds a game instance event.
     *
     * @param event the event to add
     */
    void addEvent(GameInstanceEvent event);

    /**
     * Removes a game instance event.
     *
     * @param event the event to remove
     */
    void removeEvent(GameInstanceEvent event);

    /**
     * Gets the list of game instance events.
     * @return a list of events
     */
    List<GameInstanceEvent> getEvents();

    /**
     * Populates the list of events for this game instance based on the event settings as configured in the game template
     */
    void populateEvents();

    /**
     * Gets the list of active game instance events.
     *
     * @return a list of active events
     */
    List<GameInstanceEvent> getActiveEvents();

    /**
     * Gets the list of active game instance events.
     *
     * @param allowInactiveTicking if true, events that are not actively running but allow ticking while inactive will be included
     * @param allowInactiveEvents  if true, events that are not actively running but allow events while inactive will be included
     * @return a list of active game instance events
     */
    List<GameInstanceEvent> getActiveEvents(boolean allowInactiveTicking, boolean allowInactiveEvents);

    /**
     * Ticks all active events, updating their state.
     * Events that are not actively running but do have the {@link GameEvent#isAcceptingTickingWhileInactive()} flag set will still be ticked.
     */
    void tickEvents();

    /**
     * Gets the next game instance event.
     *
     * @return the next event
     */
    GameInstanceEvent getNextEvent();

    /**
     * Checks if there are any events.
     *
     * @return true if there are events, false otherwise
     */
    boolean hasEvents();

    /**
     * Calls a Minecraft event to all active events in the game.
     * Events that are not actively running but do have the {@link GameEvent#isAcceptingEventsWhileInactive()} flag set will still be called.
     *
     * @param event the event to call
     */
    void callMCEvent(SWEvent event);

}
