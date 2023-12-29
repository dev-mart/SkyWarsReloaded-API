package net.devmart.skywarsreloaded.api.game.vote;

import net.devmart.skywarsreloaded.api.utils.Item;

import java.util.List;

public interface VoteType {

    String getName();

    boolean isEnabled();

    int getMenuSize();

    String getMenuTitle();

    int getSlot();

    Item getIcon();

    List<VoteOption> getOptions();

    void setOptions(List<VoteOption> options);

}
