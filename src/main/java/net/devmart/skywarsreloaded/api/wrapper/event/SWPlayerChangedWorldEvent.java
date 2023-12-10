package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.wrapper.world.SWWorld;

public interface SWPlayerChangedWorldEvent extends SWPlayerEvent {

    SWWorld getFrom();

    SWWorld getTo();

}
