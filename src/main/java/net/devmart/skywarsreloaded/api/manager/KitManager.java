package net.devmart.skywarsreloaded.api.manager;

import net.devmart.skywarsreloaded.api.game.kits.SWKit;
import net.devmart.skywarsreloaded.api.utils.Item;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface KitManager {

    /**
     * Load all kits from the kits folder into memory.
     */
    void loadAllKits();

    /**
     * Get a kit by its id.
     *
     * @param kitId The id of the kit
     * @return The kit if it exists, otherwise null
     */
    SWKit getKitById(String kitId);

    /**
     * Delete a kit by its id.
     *
     * @param kitId The id of the kit
     */
    void deleteKit(String kitId);

    /**
     * Creates the default kits if they are not present.
     */
    void createDefaultsIfNotPresent();

    /**
     * Get all registered kits.
     *
     * @return The list of kits
     */
    List<SWKit> getKits();

    /**
     * Get a kit from its assigned slot.
     *
     * @param slot The slot of the kit
     * @return The kit if it exists, otherwise null
     */
    @Nullable
    SWKit getKitFromSlot(int slot);

    /**
     * Creates a kit with the given id and icon.
     * If a kit with the given id already exists, this method will return null.
     *
     * @param id   The id of the kit
     * @param icon The optional icon of the kit
     * @return The kit if it was created successfully, otherwise null
     */
    @Nullable
    SWKit createKit(String id, @Nullable Item icon);


    /**
     * Initializes a kit from its configuration file.
     *
     * @param id The id of the kit
     * @return The kit
     */
    SWKit initKit(String id);

    /**
     * Fixes all duplicate kit menu slots and replaces duplicates with unique slots.
     */
    void fixKitSlots();

}
