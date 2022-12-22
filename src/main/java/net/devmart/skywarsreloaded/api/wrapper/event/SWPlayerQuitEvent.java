package net.devmart.skywarsreloaded.api.wrapper.event;

public interface SWPlayerQuitEvent extends SWPlayerEvent {

    String getQuitMessage();

    void setQuitMessage(String quitMessage);

}
