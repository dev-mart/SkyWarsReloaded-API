package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.event.SWEvent;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;

public interface SWPlayerEvent extends SWEvent {

    SWPlayer getPlayer();

}
