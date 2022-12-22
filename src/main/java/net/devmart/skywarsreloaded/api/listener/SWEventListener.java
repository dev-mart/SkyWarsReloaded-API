package net.devmart.skywarsreloaded.api.listener;

import net.devmart.skywarsreloaded.api.event.SWEvent;

public interface SWEventListener<T extends SWEvent> {

    void onEvent(T event);

    SWListenerPriority getPriority();

    Class<T> getEventClass();

}
