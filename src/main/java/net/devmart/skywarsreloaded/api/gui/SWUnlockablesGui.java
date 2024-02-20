package net.devmart.skywarsreloaded.api.gui;

import net.devmart.skywarsreloaded.api.unlockable.Unlockable;

import java.util.List;

public interface SWUnlockablesGui<T extends Unlockable> extends SWPaginatedGui<T> {

    /**
     * Get all items in this gui, sorted and organized.
     * This method is used to determine the items per page.
     *
     * @return the sorted and organized items
     */
    List<T> getAllItems();

    /**
     * Get all items in this gui, unsorted and unorganized.
     *
     * @return the unsorted and unorganized items
     */
    List<T> getAllItemsUnsorted();

    /**
     * Sort and organize the items in this gui.
     * This method is called automatically when the gui is created
     * and should be called again if the items are changed.
     */
    void sortAndOrganizeItems();

}
