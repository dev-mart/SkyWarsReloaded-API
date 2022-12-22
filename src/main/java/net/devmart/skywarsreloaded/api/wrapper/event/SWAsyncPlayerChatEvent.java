package net.devmart.skywarsreloaded.api.wrapper.event;

public interface SWAsyncPlayerChatEvent extends SWPlayerEvent, SWCancellable {

    String getMessage();

    void setMessage(String message);

}
