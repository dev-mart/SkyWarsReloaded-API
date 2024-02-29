package net.devmart.skywarsreloaded.api.game.vote;

import net.devmart.skywarsreloaded.api.utils.Message;
import net.devmart.skywarsreloaded.api.wrapper.Item;

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

    /**
     * Get the options for this vote type.
     *
     * @return
     */
    List<VoteOption> getOptions();

    /**
     * Set the options for this vote type.
     *
     * @param options
     */
    void setOptions(List<VoteOption> options);

    /**
     * Get the default option for this vote type.
     *
     * @return
     */
    VoteOption getDefaultOption();

    /**
     * Set the default option for this vote type.
     *
     * @param option
     */
    void setDefaultOption(VoteOption option);

}
