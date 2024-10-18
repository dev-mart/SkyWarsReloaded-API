package net.devmart.skywarsreloaded.api.game.event;

import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;

import java.util.List;

public interface GameInstanceEvent {

    LocalGameInstance getGameInstance();

    GameEvent getGameEvent();

    List<Integer> getStartTimes();

    int getDuration();

}
