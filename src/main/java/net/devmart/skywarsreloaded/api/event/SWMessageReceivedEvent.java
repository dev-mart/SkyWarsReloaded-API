package net.devmart.skywarsreloaded.api.event;

import net.devmart.skywarsreloaded.api.data.messaging.SWPacketMessage;

public interface SWMessageReceivedEvent extends SWEvent {

    SWPacketMessage getMessage();

}
