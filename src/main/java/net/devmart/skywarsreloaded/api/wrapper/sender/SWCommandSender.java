package net.devmart.skywarsreloaded.api.wrapper.sender;

import net.devmart.skywarsreloaded.api.command.CommandArgumentValidator;

public interface SWCommandSender {

    void sendMessage(String message);

    boolean hasPermission(String permission);

    String getName();

    CommandArgumentValidator getArgumentValidator();

}
