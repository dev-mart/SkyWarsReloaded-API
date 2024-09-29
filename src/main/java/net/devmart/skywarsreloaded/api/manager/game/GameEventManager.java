package net.devmart.skywarsreloaded.api.manager.game;

import net.devmart.skywarsreloaded.api.game.GameTemplate;
import net.devmart.skywarsreloaded.api.game.event.GameEvent;
import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;

public interface GameEventManager {

    void registerGameEvent(String id, Class<? extends GameEvent> eventClass);

    void unregisterGameEvent(String id);

    void unregisterGameEvent(Class<? extends GameEvent> eventClass);

    Class<? extends GameEvent> getGameEvent(String id);

    GameEvent createGameInstanceEvent(String eventId, GameTemplate gameTemplate);

}
