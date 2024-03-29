package net.devmart.skywarsreloaded.api.game;

import net.devmart.skywarsreloaded.api.game.gameinstance.GameInstance;
import net.devmart.skywarsreloaded.api.game.vote.PlayerVote;
import net.devmart.skywarsreloaded.api.game.vote.VoteOption;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;

import java.util.List;

public interface GamePlayer {

    /**
     * Get the actual Player that is in the game.
     *
     * @return The Player that's in the team.
     */
    SWPlayer getSWPlayer();

    /**
     * Get the player that damaged the player last.
     *
     * @return The player that damaged the player last.
     */
    SWPlayer getLastTaggedBy();

    /**
     * Set the player that damaged the player last.
     *
     * @param player Player that dealt damage.
     */
    void setLastTaggedBy(SWPlayer player);

    /**
     * Get if the player is still alive in the game.
     *
     * @return true when alive, false when dead.
     */
    boolean isAlive();

    /**
     * Set whether a player is still alive in the game.
     * This should only be called once per game to mark the player as dead.
     *
     * @param alive Whether the player is alive.
     */
    void setAlive(boolean alive);

    /**
     * Get if the player is spectating the game.
     *
     * @return True when spectating, false otherwise.
     */
    boolean isSpectating();

    /**
     * Set whether a player is spectating the game.
     *
     * @param spectating Whether the player is spectating the game.
     */
    void setSpectating(boolean spectating);

    /**
     * Get the {@link GameInstance} that the Player is in.
     *
     * @return Game that the player is in.
     */
    GameInstance getGame();

    /**
     * Get the team that the Player is in.
     *
     * @return Team that the player is in.
     */
    GameTeam getTeam();

    /**
     * Get the amount of players that this player killed.
     *
     * @return Number of killed players.
     */
    int getKills();

    /**
     * Add a kill to the player.
     */
    void addKill();

    /**
     * Get the number of assisted kills.
     *
     * @return The number of assisted kills.
     */
    int getAssists();

    // todo add a percentage to the assist?

    /**
     * Add an assisted kill to the player.
     */
    void addAssist();

    /**
     * Set the team that the player belongs to
     *
     * @param team the team that the player belongs to
     */
    void setTeam(GameTeam team);

    /**
     * Get the votes that the player has made
     *
     * @return the votes that the player has made
     */
    List<PlayerVote> getVotes();

    /**
     * Set the votes that the player has made
     *
     * @param votes the votes that the player has made
     */
    void setVotes(List<PlayerVote> votes);

    /**
     * Whether the player has voted for a vote option
     *
     * @param vote the vote option
     * @return True if the player has voted for the vote option, false otherwise
     */
    boolean hasVoted(VoteOption vote);

}
