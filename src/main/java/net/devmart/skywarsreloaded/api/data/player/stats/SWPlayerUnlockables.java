package net.devmart.skywarsreloaded.api.data.player.stats;

import net.devmart.skywarsreloaded.api.unlockable.Unlockable;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;

import java.util.List;

public interface SWPlayerUnlockables {

    void addUnlockable(Unlockable unlockable);

    void removeUnlockable(Unlockable unlockable);

    List<Unlockable> getUnlocked(SWPlayer player);

    boolean isUnlocked(Unlockable unlockable);

    void initUnlockable(String type, String id);

}
