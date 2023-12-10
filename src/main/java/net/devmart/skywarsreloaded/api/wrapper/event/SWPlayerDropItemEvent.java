package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.wrapper.entity.SWDroppedItem;

public interface SWPlayerDropItemEvent extends SWPlayerEvent, SWCancellable {

    SWDroppedItem getItem();

}
