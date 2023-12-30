package net.devmart.skywarsreloaded.api.utils;

import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;

public interface Effect {

    String toString();

    String getType();

    int getDuration();

    int getStrength();

    boolean showParticles();

    void applyToPlayer(SWPlayer player);

}
