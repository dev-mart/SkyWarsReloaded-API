package net.devmart.skywarsreloaded.api.game.vote.options;

import net.devmart.skywarsreloaded.api.game.vote.VoteOption;

public interface HealthVoteOption extends VoteOption {

    /**
     * Get the health associated with this vote option.
     *
     * @return the health value
     */
    int getHealth();

}
