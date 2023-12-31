package net.devmart.skywarsreloaded.api.game.vote.options;

import net.devmart.skywarsreloaded.api.game.vote.VoteOption;

public interface WeatherVoteOption extends VoteOption {

    /**
     * Whether it should be raining.
     *
     * @return true if it should be raining, false otherwise
     */
    boolean isRain();

    /**
     * Whether it should be thundering.
     *
     * @return true if it should be thundering, false otherwise
     */
    boolean isThunder();

}
