package net.devmart.skywarsreloaded.api.unlockable;

import net.devmart.skywarsreloaded.api.data.player.stats.PlayerStat;
import net.devmart.skywarsreloaded.api.data.player.stats.UnlockableType;
import net.devmart.skywarsreloaded.api.utils.Item;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

public interface Unlockable {

    /**
     * Get the type of this unlockable.
     *
     * @return The type.
     */
    UnlockableType getType();

    /**
     * Get the id of this unlockable.
     *
     * @return The id.
     */
    String getId();

    /**
     * Get the prefix for the permission required to unlock this unlockable.
     *
     * @return The permission prefix.
     */
    String getPermissionPrefix();

    /**
     * Get the permission required to unlock this unlockable.
     * This is by default the {@link #getPermissionPrefix()} + {@link #getId()}.
     *
     * @return The permission.
     */
    String getPermission();

    /**
     * Get whether the unlockable needs a permission to be unlocked.
     * Having a permission does not mean that the unlockable is unlocked.
     * It just means that the player can unlock it if they have the resources.
     *
     * @return Whether the unlockable needs a permission to be unlocked.
     */
    boolean needsPermission();

    /**
     * Set whether the unlockable needs a permission to be unlocked.
     * Having a permission does not mean that the unlockable is unlocked.
     *
     * @param require Whether the unlockable needs a permission to be unlocked.
     */
    void setNeedPermission(boolean require);

    /**
     * Get the position of the unlockable in the unlockables menu.
     * This is a continuous number starting at 1.
     * The position is used to determine the position of the unlockable in the menu
     * and is a replacement for the previously used static page and slot.
     *
     * @return The menu position. 0 or lower if the unlockable should be dynamically placed.
     */
    int getMenuPosition();

    /**
     * Set the position of the unlockable in the unlockables menu.
     * This is a continuous number starting at 1, or 0 or lower if the unlockable should be dynamically placed.
     * <p>
     * (See {@link #getMenuPosition()} for more information)
     * </p>
     *
     * @param position The position to set.
     */
    void setMenuPosition(int position);

    /**
     * Get the balance cost of the unlockable.
     *
     * @return The cost.
     */
    int getCost();

    /**
     * Set the balance cost of the unlockable.
     *
     * @param cost The cost to set.
     */
    void setCost(int cost);

    /**
     * Get the minimum required stats for the unlockable.
     *
     * @return The minimum stats.
     */
    Map<PlayerStat, Integer> getMinimumStats();

    /**
     * Add a minimum required stat to the unlockable.
     *
     * @param stat  The stat to add.
     * @param value The value to set.
     */
    void addMinimumStat(PlayerStat stat, int value);

    /**
     * Get whether the player has unlocked this kit.
     *
     * @param player The player to check.
     * @return True if the player has unlocked this kit, false otherwise.
     */
    boolean hasUnlocked(SWPlayer player);

    /**
     * Check whether the player has the resources to unlock this unlockable.
     *
     * @param player The player to check.
     * @return True if the player has the resources to unlock this unlockable, false otherwise.
     */
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

    /**
     * The display name of the unlockable
     * @return The display name
     */
    String getDisplayName();

    /**
     * Set the display name of the unlockable.
     *
     * @param displayName The display name to set.
     */
    void setDisplayName(String displayName);

    /**
     * Get the icon to display when the unlockable is available to the player.
     *
     * @return The icon.
     */
    Item getIcon();

    /**
     * Set the icon to display when the unlockable is available to the player.
     *
     * @param icon The icon to set.
     */
    void setIcon(Item icon);

    /**
     * Get the icon to display when the unlockable is unavailable to the player.
     *
     * @return The icon.
     */
    @Nullable
    Item getUnavailableIcon();

    /**
     * Set the icon to display when the unlockable is unavailable to the player.
     *
     * @param unavailableIcon The icon to set.
     */
    void setUnavailableIcon(@Nullable Item unavailableIcon);

    /**
     * Get the description for the unlockable.
     *
     * @return The description.
     */
    String getDescription();

    /**
     * Set the description for the unlockable.
     *
     * @param description The description to set.
     */
    void setDescription(String description);

    /**
     * Get the lore for the unlockable.
     *
     * @return The lore.
     */
    List<String> getLore();

    /**
     * Set the lore for the unlockable.
     *
     * @param lore The lore to set.
     */
    void setLore(List<String> lore);

}
