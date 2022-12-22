package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.event.SWEvent;
import net.devmart.skywarsreloaded.api.wrapper.world.SWWorld;

public interface SWChunkLoadEvent extends SWEvent {

    SWWorld getWorld();

    int getX();

    int getZ();

    boolean isGeneratingChunk();

}
