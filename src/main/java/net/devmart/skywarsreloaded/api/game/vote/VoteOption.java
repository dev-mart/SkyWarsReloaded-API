package net.devmart.skywarsreloaded.api.game.vote;

import net.devmart.skywarsreloaded.api.utils.Item;

public interface VoteOption {

    /**
     * The name of the vote option.
     *
     * @return the name
     */
    String getName();

    /**
     * The parent vote type.
     *
     * @return the parent vote type
     */
    VoteType getType();

    /**
     * The menu slot of the vote option.
     *
     * @return the menu slot
     */
    int getSlot();

    /**
     * The menu icon of the vote option.
     *
     * @return the menu icon
     */
    Item getIcon();

}
