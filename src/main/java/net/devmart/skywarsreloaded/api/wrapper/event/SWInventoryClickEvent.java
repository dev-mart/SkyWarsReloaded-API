package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.event.SWEvent;
import net.devmart.skywarsreloaded.api.utils.Item;
import net.devmart.skywarsreloaded.api.utils.gui.handlers.SWGuiClickHandler;
import net.devmart.skywarsreloaded.api.wrapper.server.SWInventory;

public interface SWInventoryClickEvent extends SWEvent, SWCancellable, SWPlayerEvent {

    SWInventory getInventory();

    SWGuiClickHandler.ClickType getClick();

    int getSlot();

    int getRawSlot();

    boolean isShiftClick();

    Item getCurrentItem();

    void setCurrentItem(Item item);

}
