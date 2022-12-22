package net.devmart.skywarsreloaded.api.wrapper.sender;

public interface SWCommandSender {

    void sendMessage(String message);

    boolean hasPermission(String permission);

    String getName();

}
