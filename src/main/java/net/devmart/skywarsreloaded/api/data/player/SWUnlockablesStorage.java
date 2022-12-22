package net.devmart.skywarsreloaded.api.data.player;

import net.devmart.skywarsreloaded.api.unlockable.Unlockable;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;

public interface SWUnlockablesStorage {

    void addUnlockable(SWPlayer player, Unlockable unlockable);

    void removeUnlockable(SWPlayer player, Unlockable unlockable);

    boolean hasUnlockable(SWPlayer player, Unlockable unlockable);

}
