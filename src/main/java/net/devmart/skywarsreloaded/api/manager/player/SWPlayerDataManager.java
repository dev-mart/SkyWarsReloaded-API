package net.devmart.skywarsreloaded.api.manager.player;

import net.devmart.skywarsreloaded.api.data.player.stats.SWPlayerData;
import net.devmart.skywarsreloaded.api.data.player.stats.SWPlayerStats;
import net.devmart.skywarsreloaded.api.data.player.stats.SWPlayerUnlockables;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;

public interface SWPlayerDataManager {

    SWPlayerData createSWPlayerDataInstance(SWPlayer player);

    SWPlayerStats createSWPlayerStatsInstance();

    SWPlayerUnlockables createSWPlayerUnlockablesInstance(SWPlayer player);

    void loadAllPlayerData();

}
