package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.event.SWEvent;
import net.devmart.skywarsreloaded.api.utils.SWCoord;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWEntity;

public interface SWEntitySpawnEvent extends SWEvent, SWCancellable {

    SWEntity getEntity();

    SWCoord getLocation();

}
