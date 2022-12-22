package net.devmart.skywarsreloaded.api.manager;

import net.devmart.skywarsreloaded.api.event.SWEvent;
import net.devmart.skywarsreloaded.api.listener.SWEventListener;

public interface SWEventManager {

    void unregisterListener(SWEventListener<?> listener);

    void registerListener(SWEventListener<?> listener);

    <T extends SWEvent> void callEvent(T event);

}
