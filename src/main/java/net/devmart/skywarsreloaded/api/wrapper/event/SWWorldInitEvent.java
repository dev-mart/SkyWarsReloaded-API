package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.event.SWEvent;
import net.devmart.skywarsreloaded.api.wrapper.world.SWWorld;

public interface SWWorldInitEvent extends SWEvent {

    SWWorld getWorld();

}
