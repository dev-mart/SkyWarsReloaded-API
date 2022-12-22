package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.utils.SWCoord;

public interface SWBlockPlaceEvent extends SWPlayerEvent, SWCancellable {

    SWCoord getCoord();

    String getBlockTypeName();

}
