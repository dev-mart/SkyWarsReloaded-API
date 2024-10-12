package net.devmart.skywarsreloaded.api.manager.game;

import net.devmart.skywarsreloaded.api.game.event.GameInstanceEvent;

public interface GameInstanceEventManager {

    void addEvent(GameInstanceEvent event);

    void removeEvent(GameInstanceEvent event);

    void populateEvents();

    void tickEvents();

    GameInstanceEvent getNextEvent();

    boolean hasEvents();

}
