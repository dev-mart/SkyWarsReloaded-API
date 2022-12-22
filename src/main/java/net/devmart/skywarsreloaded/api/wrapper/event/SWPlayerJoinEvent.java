package net.devmart.skywarsreloaded.api.wrapper.event;

public interface SWPlayerJoinEvent extends SWPlayerEvent {

    String getJoinMessage();

    void setJoinMessage(String joinMessage);

}
