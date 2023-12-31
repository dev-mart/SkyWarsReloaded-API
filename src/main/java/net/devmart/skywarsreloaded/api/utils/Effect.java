package net.devmart.skywarsreloaded.api.utils;

import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;

public interface Effect {

    String toString();

    String getType();

    void setType(String type);

    int getDuration();

    void setDuration(int duration);

    int getStrength();

    void setStrength(int strength);

    boolean showParticles();

    void setShowParticles(boolean showParticles);

    void applyToPlayer(SWPlayer player);

}
