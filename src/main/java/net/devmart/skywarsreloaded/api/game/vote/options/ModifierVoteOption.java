package net.devmart.skywarsreloaded.api.game.vote.options;

import net.devmart.skywarsreloaded.api.game.vote.VoteOption;
import net.devmart.skywarsreloaded.api.wrapper.PotionEffect;

import java.util.List;

public interface ModifierVoteOption extends VoteOption {

    /**
     * Get the effects associated with this vote option.
     *
     * @return the effects
     */
    List<PotionEffect> getEffects();

}
