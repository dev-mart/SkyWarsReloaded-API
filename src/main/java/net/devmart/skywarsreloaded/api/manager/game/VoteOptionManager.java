package net.devmart.skywarsreloaded.api.manager.game;

import net.devmart.skywarsreloaded.api.game.vote.VoteOption;

import java.util.List;

public interface VoteOptionManager {

    void loadAllVoteOptions();

    VoteOption getByType(String type);

    VoteOption getByTypeAndValue(String type, String value);

    List<VoteOption> getAllVoteOptions();

}
