package net.devmart.skywarsreloaded.api.game.vote;

import net.devmart.skywarsreloaded.api.game.vote.options.*;

import java.util.Optional;

public interface VoteOptionFreezer {

    /**
     * Get the chest vote option.
     *
     * @return
     */
    ChestVoteOption getChestVote();

    /**
     * Set the chest vote option.
     *
     * @param option
     */
    void setChestVote(ChestVoteOption option);

    /**
     * Get the health vote option.
     *
     * @return
     */
    HealthVoteOption getHealthVote();

    /**
     * Set the health vote option.
     *
     * @param option
     */
    void setHealthVote(HealthVoteOption option);

    /**
     * Get the modifier vote option.
     *
     * @return
     */
    ModifierVoteOption getModifierVote();

    /**
     * Set the modifier vote option.
     *
     * @param option
     */
    void setModifierVote(ModifierVoteOption option);

    /**
     * Get the time vote option.
     *
     * @return
     */
    TimeVoteOption getTimeVote();

    /**
     * Set the time vote option.
     *
     * @param option
     */
    void setTimeVote(TimeVoteOption option);

    /**
     * Get the weather vote option.
     *
     * @return
     */
    WeatherVoteOption getWeatherVote();

    /**
     * Set the weather vote option.
     *
     * @param option
     */
    void setWeatherVote(WeatherVoteOption option);

    /**
     * Set an option. The type of the option provided will be used to store the option.
     *
     * @return
     */
    <T extends VoteOption> void set(T option);

    /**
     * Get an option by type.
     *
     * @return
     */
    <T extends VoteOption> Optional<T> get(Class<T> clazz);

    /**
     * Freeze the vote options.
     */
    void freeze();

    /**
     * Get if the vote options are frozen.
     */
    boolean isFrozen();

}
