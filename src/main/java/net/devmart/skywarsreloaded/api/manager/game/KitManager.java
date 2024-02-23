package net.devmart.skywarsreloaded.api.manager.game;

import net.devmart.skywarsreloaded.api.unlockable.kits.SWKit;
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

}
