package net.devmart.skywarsreloaded.api.manager.game;

import net.devmart.skywarsreloaded.api.game.vote.VoteOption;
import net.devmart.skywarsreloaded.api.game.vote.VoteType;

import java.util.List;

public interface VoteOptionManager {

    void loadAllVoteOptions();

    List<VoteType> getVoteTypes();

    List<VoteOption> getVoteOptions(VoteType type);

    List<VoteOption> getAllVoteOptions();

}
