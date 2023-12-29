package net.devmart.skywarsreloaded.api.game.vote.options;

import net.devmart.skywarsreloaded.api.game.vote.VoteOption;

public interface TimeVoteOption extends VoteOption {

    /**
     * Get the time associated with this vote option.
     *
     * @return the time value
     */
    int getTime();

}
