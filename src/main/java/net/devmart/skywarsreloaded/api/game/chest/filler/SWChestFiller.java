package net.devmart.skywarsreloaded.api.game.chest.filler;

import net.devmart.skywarsreloaded.api.game.chest.SWChestTier;
import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;
import net.devmart.skywarsreloaded.api.game.types.ChestType;
import net.devmart.skywarsreloaded.api.utils.SWCoord;
import net.devmart.skywarsreloaded.api.wrapper.Item;

public interface SWChestFiller {

    Item[] generateChestLoot(SWChestTier chestTier, ChestType chestType, boolean doubleChest);

    void fillChest(SWChestTier chestTier, LocalGameInstance world, SWCoord coord, ChestType chestType);

}
