package net.devmart.skywarsreloaded.api.event;

import net.devmart.skywarsreloaded.api.game.GamePlayer;
import net.devmart.skywarsreloaded.api.game.gameinstance.GameInstance;

public interface SWLeaveGameEvent extends SWEvent {

    GameInstance getGame();

    GamePlayer getPlayer();

}
