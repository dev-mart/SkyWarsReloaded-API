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
     * The display name of the vote option.
     * @return the display name
     */
    String getDisplayName();

    /**
     * Set the display name of the vote option.
     * @param displayName the display name
     */
    void setDisplayName(String displayName);

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
     *
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
     *
     * @param icon the menu icon
     */
    void setIcon(Item icon);

    /**
     * Apply the vote option to the game instance.
     *
     * @param gameInstance the game instance
     */
    void apply(LocalGameInstance gameInstance);

    /**
     * Get the permission of the vote option.
     * This follows the format of <b>{@code skywars.vote.<vote-type>.<vote-option>}</b> in lowercase.
     *
     * @return the permission
     */
    String getPermission();

}
