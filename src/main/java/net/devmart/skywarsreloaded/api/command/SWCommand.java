package net.devmart.skywarsreloaded.api.command;

import net.devmart.skywarsreloaded.api.wrapper.sender.SWCommandSender;

import java.util.List;

public interface SWCommand {

    String sendUsage(SWCommandSender sender, boolean send);

    boolean processCommand(SWCommandSender sender, String[] args);

    List<String> processTabCompletion(SWCommandSender sender, String[] args);

    String getParentCommand();

    String getPermission();

    String getName();

    String[] getAliases();

}
