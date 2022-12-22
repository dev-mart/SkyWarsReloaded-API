package net.devmart.skywarsreloaded.api.event;

import net.devmart.skywarsreloaded.api.data.messaging.SWMessage;

public interface SWMessageSentEvent extends SWEvent {

    SWMessage getMessage();

}
