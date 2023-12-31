package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import net.devmart.skywarsreloaded.api.wrapper.server.SWInventory;

public interface SWInventoryCloseEvent extends SWPlayerEvent {

    SWPlayer getPlayer();

    SWInventory getInventory();

}
