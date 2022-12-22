package net.devmart.skywarsreloaded.api.unlockable;

import net.devmart.skywarsreloaded.api.data.player.stats.PlayerStat;
import net.devmart.skywarsreloaded.api.data.player.stats.UnlockableType;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;

import java.util.Map;

public interface Unlockable {

    UnlockableType getType();

    String getId();

    String getPermissionPrefix();

    String getPermission();

    boolean needsPermission();

    void setNeedPermission(boolean require);

    int getCost();

    void setCost(int cost);

    Map<PlayerStat, Integer> getMinimumStats();

    void addMinimumStat(PlayerStat stat, int value);

    boolean hasUnlocked(SWPlayer player);

    boolean canUnlock(SWPlayer player);

    /**
     * Checks if a player is eligible to unlock this unlockable.
     *
     * @param player The player to check.
     * @return True if the player is eligible to unlock this unlockable, false otherwise.
     */
    boolean isEligible(SWPlayer player);

    /**
     * Unlock the unlockable for a player.
     *
     * @param player The player to unlock the unlockable for.
     */
    void unlock(SWPlayer player);

    /**
     * Unlock the unlockable for a player.
     *
     * @param player The player to unlock the unlockable for.
     * @param free   Whether the unlockable should be unlocked for free.
     */
    void unlock(SWPlayer player, boolean free);


}
