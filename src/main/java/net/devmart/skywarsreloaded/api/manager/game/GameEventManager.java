package net.devmart.skywarsreloaded.api.manager.game;

import net.devmart.skywarsreloaded.api.game.event.GameEvent;

import java.util.List;

public interface GameEventManager {

    void registerGameEvent(GameEvent event);

    void unregisterGameEvent(GameEvent event);

    GameEvent getGameEvent(String id);

    List<GameEvent> getGameEvents();

}
