package net.devmart.skywarsreloaded.api.manager.game;

import net.devmart.skywarsreloaded.api.event.SWEvent;
import net.devmart.skywarsreloaded.api.game.event.GameInstanceEvent;

import java.util.List;

public interface GameInstanceEventManager {

    void addEvent(GameInstanceEvent event);

    void removeEvent(GameInstanceEvent event);

    void populateEvents();

    List<GameInstanceEvent> getActiveEvents();

    void tickEvents();

    GameInstanceEvent getNextEvent();

    boolean hasEvents();

    void callMCEvent(SWEvent event);

}
