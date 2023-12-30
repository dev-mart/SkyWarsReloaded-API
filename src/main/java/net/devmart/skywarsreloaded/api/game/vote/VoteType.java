package net.devmart.skywarsreloaded.api.game.vote;

import net.devmart.skywarsreloaded.api.utils.Item;
import net.devmart.skywarsreloaded.api.utils.Message;

import java.util.List;

public interface VoteType {

    String getName();

    boolean isEnabled();

    void setEnabled(boolean enabled);

    int getMenuSize();

    void setMenuSize(int size);

    Message getMenuTitle();

    void setMenuTitle(Message title);

    int getSlot();

    void setSlot(int slot);

    Item getIcon();

    void setIcon(Item icon);

    List<VoteOption> getOptions();

    void setOptions(List<VoteOption> options);

}
