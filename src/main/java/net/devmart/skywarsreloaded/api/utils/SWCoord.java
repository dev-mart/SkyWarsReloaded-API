package net.devmart.skywarsreloaded.api.utils;

import net.devmart.skywarsreloaded.api.wrapper.world.SWWorld;

public interface SWCoord {

    @Override
    String toString();

    String toString(boolean withWorld);

    SWWorld getWorld();

    int x();

    double xPrecise();

    int y();

    double yPrecise();

    int z();

    double zPrecise();

    float pitch();

    float yaw();

    SWCoord add(SWCoord coord);

    SWCoord add(double x, double y, double z);

    boolean equals(SWCoord o);

    SWCoord asBlock();

    SWCoord clone();

    SWCoord setWorld(SWWorld world);

}
