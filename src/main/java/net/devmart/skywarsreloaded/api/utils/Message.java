package net.devmart.skywarsreloaded.api.utils;

import net.devmart.skywarsreloaded.api.wrapper.sender.SWCommandSender;

import java.util.List;

public interface Message {

    Message colors(boolean colors);

    Message replace(String search, String replace);

    void send(SWCommandSender... senders);

    void sendCentered(SWCommandSender... senders);

    void sendTitle(SWCommandSender... senders);

    void sendTitle(int in, int stay, int out, SWCommandSender... senders);

    List<String> getLines();

}
