package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.utils.SWCoord;

public interface SWPlayerInteractEvent extends SWPlayerEvent, SWCancellable {

    Action getAction();

    SWCoord getClickedBlockLocation();

    String getClickedBlockType();

    enum Action {
        LEFT_CLICK_BLOCK,
        RIGHT_CLICK_BLOCK,
        LEFT_CLICK_AIR,
        RIGHT_CLICK_AIR,
        PHYSICAL
    }

}
