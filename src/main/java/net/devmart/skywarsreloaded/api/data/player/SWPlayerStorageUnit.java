package net.devmart.skywarsreloaded.api.data.player;

import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;

public interface SWPlayerStorageUnit {

    /**
     * Loads all data from storage (MySQL/MongoDB/YAML) into cache.
     */
    void loadData(SWPlayer player);

    /**
     * Saves all cache data to storage (MySQL/MongoDB/YAML).
     */
    void saveData(SWPlayer player);

}
