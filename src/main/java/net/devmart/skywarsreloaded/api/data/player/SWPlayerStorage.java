package net.devmart.skywarsreloaded.api.data.player;

public interface SWPlayerStorage extends SWPlayerStorageUnit {

    void initStatsTable();

    void initUnlockablesTable();

    SWUnlockablesStorage getUnlockablesStorage();

}
