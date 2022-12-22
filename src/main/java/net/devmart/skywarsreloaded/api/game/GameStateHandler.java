package net.devmart.skywarsreloaded.api.game;

import net.devmart.skywarsreloaded.api.SkyWarsReloaded;
import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;

public interface GameStateHandler {

    void tick();

    void tickSecond();

    LocalGameInstance getGameInstance();

    SkyWarsReloaded getPlugin();

}
