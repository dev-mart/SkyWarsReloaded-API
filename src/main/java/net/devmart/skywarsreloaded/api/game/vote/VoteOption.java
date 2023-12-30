package net.devmart.skywarsreloaded.api.game.vote;

import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;
import net.devmart.skywarsreloaded.api.utils.Item;

/**
 * Represents all the possible options that can be picked under a {@link VoteType}.
 */
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
     * Set the menu slot of the vote option.
     * @param slot the menu slot
     */
    void setSlot(int slot);

    /**
     * The menu icon of the vote option.
     *
     * @return the menu icon
     */
    Item getIcon();

    /**
     * Set the menu icon of the vote option.
     * @param icon the menu icon
     */
    void setIcon(Item icon);

    void apply(LocalGameInstance gameInstance);

}
