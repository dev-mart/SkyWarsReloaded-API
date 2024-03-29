package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.event.SWEvent;
import net.devmart.skywarsreloaded.api.gui.handlers.SWGuiClickHandler;
import net.devmart.skywarsreloaded.api.wrapper.Item;
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
