package net.devmart.skywarsreloaded.api.wrapper.world;

public interface SWChunk {

    boolean isLoaded();

    void load();

    void unload();

    SWWorld getWorld();

}
