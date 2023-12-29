package net.devmart.skywarsreloaded.api.game.vote.options;

import net.devmart.skywarsreloaded.api.game.chest.SWChestTier;
import net.devmart.skywarsreloaded.api.game.vote.VoteOption;

public interface ChestVoteOption extends VoteOption {

    /**
     * Get the chest tier associated with this vote option.
     * @return the chest tier
     */
    SWChestTier getChestTier();

}
