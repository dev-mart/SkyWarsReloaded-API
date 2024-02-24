package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.wrapper.Item;

import java.util.List;

public interface SWPlayerDeathEvent extends SWPlayerEvent {

    String getDeathMessage();

    void setDeathMessage(String message);

    boolean isKeepInventory();

    void setKeepInventory(boolean keepInventory);

    List<Item> getDrops();

}
