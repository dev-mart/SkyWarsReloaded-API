package net.devmart.skywarsreloaded.api.game.vote;

import net.devmart.skywarsreloaded.api.utils.Item;

import java.util.List;

public interface VoteType {

    String getName();

    boolean isEnabled();

    void setEnabled(boolean enabled);

    int getMenuSize();

    void setMenuSize(int size);

    String getMenuTitle();

    void setMenuTitle(String title);

    int getSlot();

    void setSlot(int slot);

    Item getIcon();

    void setIcon(Item icon);

    List<VoteOption> getOptions();

    void setOptions(List<VoteOption> options);

}
