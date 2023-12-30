package net.devmart.skywarsreloaded.api.game.vote;

public interface PlayerVote {

    /**
     * Get the vote option.
     *
     * @return The vote option.
     */
    VoteOption getVoteOption();

    /**
     * Get the weight of the vote.
     *
     * @return The weight of the vote.
     */
    int getWeight();

    /**
     * Set the weight of the vote.
     *
     * @param weight The weight of the vote.
     */
    void setWeight(int weight);

}
