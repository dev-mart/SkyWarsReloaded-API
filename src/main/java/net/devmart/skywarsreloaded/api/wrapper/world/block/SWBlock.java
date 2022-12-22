package net.devmart.skywarsreloaded.api.wrapper.world.block;

import net.devmart.skywarsreloaded.api.utils.SWCoord;
import net.devmart.skywarsreloaded.api.wrapper.world.SWChunk;

public interface SWBlock {

    // Getters

    SWChunk getChunk();

    SWCoord getCoord();

    String getMaterial();

}
