package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.utils.SWCoord;

public interface SWPlayerMoveEvent extends SWPlayerEvent, SWCancellable {

    SWCoord getFrom();

    SWCoord getTo();

}
