package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.utils.SWCoord;

public interface SWBlockBreakEvent extends SWPlayerEvent, SWCancellable {

    SWCoord getCoord();

    String getBlockTypeName();

}
