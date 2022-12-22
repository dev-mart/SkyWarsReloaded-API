package net.devmart.skywarsreloaded.api.game.chest;

import net.devmart.skywarsreloaded.api.game.chest.filler.SWChestFiller;
import net.devmart.skywarsreloaded.api.game.types.ChestType;

public interface SWChestTier {

    String getName();

    void loadData();

    void saveData();

    String getDisplayName();

    boolean hasChestType(ChestType chestType);

    SWChestFiller getChestFiller();
}
