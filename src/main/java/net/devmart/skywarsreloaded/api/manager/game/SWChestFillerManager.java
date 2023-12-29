package net.devmart.skywarsreloaded.api.manager.game;

import net.devmart.skywarsreloaded.api.game.chest.filler.SWChestFiller;

public interface SWChestFillerManager {

    SWChestFiller getFillerByName(String name);

}
