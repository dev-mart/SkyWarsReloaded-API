package net.devmart.skywarsreloaded.api.event;

import net.devmart.skywarsreloaded.api.data.messaging.SWMessage;

public interface SWMessageReceivedEvent extends SWEvent {

    SWMessage getMessage();

}
