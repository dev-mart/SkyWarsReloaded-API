package net.devmart.skywarsreloaded.api.utils.gui;

import net.devmart.skywarsreloaded.api.utils.Item;
import net.devmart.skywarsreloaded.api.utils.gui.handlers.SWGuiClickHandler;

import java.util.List;

public interface SWPaginatedGui<T> extends SWGui {

    /**
     * Open the GUI at a specific page
     *
     * @param page The page to open
     */
    void open(int page);

    /**
     * Get the total number of pages, populated from {@link #getAllItems()} and {@link #getItemsPerPage()}
     *
     * @return The total number of pages
     */
    int getTotalPages();

    /**
     * Get whether there the GUI has a next page.
     *
     * @return True if there is a next page, false otherwise
     */
    boolean hasNextPage();

    /**
     * Get whether there the GUI has a previous page.
     *
     * @return True if there is a previous page, false otherwise
     */
    boolean hasPreviousPage();

    /**
     * Get whether the current page is the first page.
     *
     * @return True if the current page is the first page, false otherwise
     */
    boolean isFirstPage();

    /**
     * Get whether the current page is the last page.
     *
     * @return True if the current page is the last page, false otherwise
     */
    boolean isLastPage();

    /**
     * Get the current page number
     *
     * @return The current page number
     */
    int getCurrentPage();

    /**
     * Get the number of items per page
     *
     * @return The number of items per page
     */
    int getItemsPerPage();

    /**
     * Get all items to be displayed in the GUI.
     * This includes all items, not just the items on the current page.
     *
     * @return All items to be displayed in the GUI
     * @see #getPaginatedItems(int)
     */
    List<T> getAllItems();

    /**
     * Get the {@link Item} to be displayed for a given item.
     *
     * @param item The item to get the {@link Item} for
     * @return The {@link Item} to be displayed for the given item
     */
    Item getItem(T item);

    /**
     * Get the {@link SWGuiClickHandler.ClickResult} for a given button.
     *
     * @param item         The item associated with the button
     * @param gui          The current GUI
     * @param slot         The slot of the button
     * @param clickType    The type of click
     * @param isShiftClick Whether the click was a shift click
     * @return The {@link SWGuiClickHandler.ClickResult} for the given button
     */
    SWGuiClickHandler.ClickResult handleButton(T item, SWGui gui, int slot, SWGuiClickHandler.ClickType clickType, boolean isShiftClick);

    /**
     * Get the items to be displayed on the current page.
     * Populated from {@link #getAllItems()} and {@link #getItemsPerPage()}
     *
     * @param page The page number
     * @return The items to be displayed on the current page
     */
    List<T> getPaginatedItems(int page);

    /**
     * Get the size of the GUI for a given page.
     *
     * @param page The page number
     * @return The size of the GUI for the given page
     */
    int getSize(int page);

    /**
     * Apply the footer to the GUI (if enabled).
     */
    void applyFooter();

}
