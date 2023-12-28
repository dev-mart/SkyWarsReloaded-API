package net.devmart.skywarsreloaded.api.game.kits;

import net.devmart.skywarsreloaded.api.unlockable.Unlockable;
import net.devmart.skywarsreloaded.api.utils.Item;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;

public interface SWKit extends Unlockable {

    /**
     * Load the kit's data from its config file.
     */
    void loadData();

    /**
     * Save the kit's data to its config file.
     */
    void saveData();

    /**
     * Get the display name for the kit.
     *
     * @return The display name.
     */
    String getDisplayName();

    /**
     * Set the display name for the kit.
     *
     * @param name The name to set.
     */
    void setDisplayName(String name);

    /**
     * Get the icon to display when the kit is available to the player.
     *
     * @return The icon.
     */
    Item getIcon();

    /**
     * Set the icon to display when the kit is available to the player.
     *
     * @param icon The icon to set.
     */
    void setIcon(Item icon);

    /**
     * Get the icon to display when the kit is unavailable to the player.
     *
     * @return The icon.
     */
    @Nullable
    Item getUnavailableIcon();

    /**
     * Set the icon to display when the kit is unavailable to the player.
     *
     * @param icon The icon to set.
     */
    void setUnavailableIcon(@Nullable Item icon);

    /**
     * Get the description for the kit.
     *
     * @return The description.
     */
    String getDescription();

    /**
     * Set the description for the kit.
     *
     * @param description The description to set.
     */
    void setDescription(String description);

    /**
     * Get the lore for the kit.
     *
     * @return The lore.
     */
    List<String> getLore();

    /**
     * Set the lore for the kit.
     *
     * @param lore The lore to set.
     */
    void setLore(List<String> lore);

    /**
     * Get the helmet for the kit.
     *
     * @return The helmet.
     */
    @Nullable
    Item getHelmet();

    /**
     * Set the helmet for the kit.
     *
     * @param item The item to set.
     */
    void setHelmet(@Nullable Item item);

    /**
     * Get the chestplate for the kit.
     *
     * @return The chestplate.
     */
    @Nullable
    Item getChestplate();

    /**
     * Set the chestplate for the kit.
     *
     * @param item The item to set.
     */
    void setChestplate(@Nullable Item item);

    /**
     * Get the leggings for the kit.
     *
     * @return The leggings.
     */
    @Nullable
    Item getLeggings();

    /**
     * Set the leggings for the kit.
     *
     * @param item The item to set.
     */
    void setLeggings(@Nullable Item item);

    /**
     * Get the boots for the kit.
     *
     * @return The boots.
     */
    @Nullable
    Item getBoots();

    /**
     * Set the boots for the kit.
     *
     * @param item The item to set.
     */
    void setBoots(@Nullable Item item);

    /**
     * Get the contents of the kit.
     *
     * @return A map of slot to item
     */
    HashMap<Integer, @Nullable Item> getContents();

    /**
     * Sets the contents of the kit.
     *
     * @param contents A map of slot to item
     */
    void setContents(HashMap<Integer, @Nullable Item> contents);

    /**
     * Get the item in the offhand slot.
     *
     * @return The item in the offhand slot.
     */
    @Nullable
    Item getOffHand();

    /**
     * <p>Sets the offhand item for the kit.</p><br>
     * <p>
     * <b>Note:</b> This is only supported on 1.9+.
     * </p>
     *
     * @param item The item to set.
     */
    void setOffHand(@Nullable Item item);

    /**
     * Get the effects for the kit.
     *
     * @return The effects.
     */
    List<String> getEffects();

    /**
     * Sets the effects for the kit.
     *
     * @param effects The effects to set.
     */
    void setEffects(List<String> effects);

    /**
     * Give the kit to a player
     *
     * @param player The player to give the kit to.
     */
    void giveToPlayer(SWPlayer player);

    /**
     * Applies the kit's effects to the player.
     *
     * @param player The player to apply the effects to.
     */
    void applyEffects(SWPlayer player);

    /**
     * Copies the contents of the player's inventory to the kit.
     * This includes armor, offhand, and inventory.
     *
     * @param player The player to copy the contents from.
     */
    void copyContentsFromPlayer(SWPlayer player);

}
