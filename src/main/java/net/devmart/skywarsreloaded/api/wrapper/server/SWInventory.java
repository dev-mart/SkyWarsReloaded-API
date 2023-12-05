package net.devmart.skywarsreloaded.api.wrapper.server;

import net.devmart.skywarsreloaded.api.utils.Item;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;

import java.util.List;

public interface SWInventory {

    void clear();

    void setItem(int slot, Item item);

    Item getItem(int slot);

    Item[] getContents();

    void setContents(Item[] items);

    String getTitle();

    int getSize();

    List<SWPlayer> getViewers();

    boolean isViewing(SWPlayer player);

    void clearArmor();

    void setItemInOffHand(Item item);

    int getHeldItemSlot();

}
