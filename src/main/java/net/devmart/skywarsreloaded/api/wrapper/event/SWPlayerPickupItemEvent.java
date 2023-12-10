package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.wrapper.entity.SWDroppedItem;

public interface SWPlayerPickupItemEvent extends SWPlayerEvent, SWCancellable {

    SWDroppedItem getItem();

    int getRemaining();

}
