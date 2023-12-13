package net.devmart.skywarsreloaded.api.data.player;

import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import org.jetbrains.annotations.ApiStatus;

public interface SWPlayerStorageUnit {

    /**
     * Loads all data from storage (MySQL/MongoDB/YAML) into cache.
     */
    void loadData(SWPlayer player);

    /**
     * Overwrites the data in storage with the data in cache. This method should only really be used for initialization purposes or if you know what you're doing.
     *
     * @param player The player to overwrite the data of.
     * @deprecated This method is not actually deprecated, but it should be noted that this will overwrite the data rather than saving it. For saving the current cached changes, use {@link #saveChanges(SWPlayer)}.
     */
    @ApiStatus.Internal
    void overwriteData(SWPlayer player);

    /**
     * Saves the current cached changes (deltas) to storage.
     *
     * @param player The player to save the changes for.
     */
    void saveChanges(SWPlayer player);

}
