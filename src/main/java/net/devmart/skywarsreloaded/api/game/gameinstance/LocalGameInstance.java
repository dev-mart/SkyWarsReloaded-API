package net.devmart.skywarsreloaded.api.game.gameinstance;

import net.devmart.skywarsreloaded.api.enums.DeathCause;
import net.devmart.skywarsreloaded.api.enums.GameLeaveReason;
import net.devmart.skywarsreloaded.api.game.GamePlayer;
import net.devmart.skywarsreloaded.api.game.GameScheduler;
import net.devmart.skywarsreloaded.api.game.GameTeam;
import net.devmart.skywarsreloaded.api.game.TeamSpawn;
import net.devmart.skywarsreloaded.api.game.types.ChestType;
import net.devmart.skywarsreloaded.api.game.vote.PlayerVote;
import net.devmart.skywarsreloaded.api.game.vote.VoteOption;
import net.devmart.skywarsreloaded.api.game.vote.VoteOptionFreezer;
import net.devmart.skywarsreloaded.api.game.vote.VoteType;
import net.devmart.skywarsreloaded.api.utils.Message;
import net.devmart.skywarsreloaded.api.utils.SWCompletableFuture;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import net.devmart.skywarsreloaded.api.wrapper.world.SWWorld;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface LocalGameInstance extends GameInstance {

    /**
     * Get the vote options for this game.
     *
     * @return The vote option freezer
     */
    VoteOptionFreezer getVoteOptionFreezer();

    /**
     * Get a list of all the teams in the game.
     *
     * @return A list of all the teams in the game.
     */
    List<GameTeam> getTeams();

    /**
     * Get the team of the player.
     *
     * @param gamePlayer The player to get the team of
     * @return The team of the player when assigned, null otherwise
     */
    GameTeam getTeam(GamePlayer gamePlayer);

    /**
     * Get the team of the player.
     *
     * @param player The player to get the team of
     * @return The team of the player when assigned, null otherwise
     */
    GameTeam getTeam(SWPlayer player);

    /**
     * Find the preferred team for the given player.
     * This will take into account the player's party and the team sizes.
     *
     * @param player    The player to find the preferred team for
     * @param gameTeams The teams to choose from (see {@link #getJoinableTeamsSortedByPlayerCount()})
     * @return The preferred team for the player
     */
    GameTeam findPreferredTeam(SWPlayer player, List<GameTeam> gameTeams);

    /**
     * Get a list of all the teams in the game that are joinable, sorted by player count (descending).
     *
     * @return A list of all joinable teams, sorted by player count (descending).
     */
    List<GameTeam> getJoinableTeamsSortedByPlayerCount();

    /**
     * Teleport the player to the game. This will choose whether the player should be placed
     * in the waiting lobby or directly in the cage automatically.
     *
     * @param swPlayer The player to teleport.
     * @param spawn    The spawn to teleport the player to if the player shouldn't be sent to the map's lobby
     */
    SWCompletableFuture<Boolean> teleportPlayerToLobbyOrTeamSpawn(SWPlayer swPlayer, TeamSpawn spawn);

    /**
     * Prepare the waiting lobby for the cages stage.
     * This will assign all players to a team and teleport them to their team spawn.
     * This will also place all cages.
     */
    void prepareWaitingLobbyForCages();

    /**
     * Get the game player instance associated with the given player.
     *
     * @param player The player to get the game player instance for
     * @return The game player instance when in the game, null otherwise
     */
    GamePlayer getPlayer(SWPlayer player);

    /**
     * Get the {@link SWWorld} instance of the world that is being used to run this game in.
     *
     * @return The world instance
     */
    SWWorld getWorld();

    /**
     * Get the name of the world that is being used to run this game in.
     *
     * @return The name of the world
     */
    String getWorldName();

    /**
     * Checks whether a spawn is available for a player.
     *
     * @return True if a spawn is available, false otherwise
     */
    boolean isSpawnAvailable();

    /**
     * Enable/disable editing mode for this game.
     *
     * @param edit True to enable editing mode, false to disable
     */
    void setEditing(boolean edit);

    /**
     * Starts the core game scheduler.
     * This starts the ticking of the game.
     */
    void startScheduler();

    /**
     * Start the current game.
     */
    void startGame();

    /**
     * Calculate the final votes for the game.
     */
    void calculateFinalVotes();

    /**
     * Apply the final votes to the game.
     */
    void applyFinalVotes();

    /**
     * End the current game.
     * This will stop the scheduler and set the state to ENDING.
     * If you want to delete the game instance, use {@link #delete()} instead.
     */
    void endGame();

    /**
     * Delete the current game instance and all associated data.
     * This will remove the world from the server.
     * If you want to end the game, use {@link #endGame()} instead.
     */
    void delete();

    /**
     * Turns the game into idle mode.
     * This will remove the assigned template from this game and make it free to be used by other templates.
     */
    void setIdle();

    /**
     * Get a list of players with the most kills.
     *
     * @return A list of players with the most kills.
     */
    List<GamePlayer> getTopKillers();

    /**
     * Get the scheduler that is currently running.
     *
     * @return The scheduler
     */
    GameScheduler getScheduler();

    /**
     * Get the chest types that players are using during their edit session.
     *
     * @return The selected chest types per player.
     */
    Map<UUID, ChestType> getSelectedEditingChestTypes();

    /**
     * Announces a message to all players in the game.
     *
     * @param message The message to announce
     */
    void announce(Message message);

    /**
     * Announce a message to all players in the game
     *
     * @param message The message to announce
     */
    void announce(String message);

    /**
     * Sends a title to all players in the game.
     * Uses the default timings of: 20, 50, 20.
     *
     * @param message The message to send
     */
    void announceTitle(Message message);

    /**
     * Sends a title to all players in the game, with specific timings.
     *
     * @param message Message to send.
     * @param fadeIn  Fade in time in ticks.
     * @param stay    Stay time in ticks.
     * @param fadeOut Fade out time in ticks.
     */
    void announceTitle(Message message, int fadeIn, int stay, int fadeOut);

    /**
     * This method is to be run async since it could perform long operations
     *
     * @param uuid                  UUID of the player to add
     * @param ignoreAvailableSpawns true if the player should be added anyway if there is no available spawn points
     * @return A {@link GamePlayer} object if the player was added, null otherwise
     */
    GamePlayer preparePlayerJoin(UUID uuid, boolean ignoreAvailableSpawns);

    /**
     * If this method doesn't return true, the calling method is expected to handle kicking the player(s) which
     * have not made it into a team.
     *
     * @param players List of player to try adding to the game
     * @return true if all players were added to the game
     */
    boolean addPlayers(GamePlayer... players);

    /**
     * Remove a player from the game.
     *
     * @param player      Player to remove
     * @param deathCause  The cause of death (aka damage source)
     * @param leaveReason The reason the player left the game. Set to something other than {@link GameLeaveReason#DEATH} to prevent the player from becoming a spectator.
     *                    All {@link GameLeaveReason#isSelfInflicted()} reasons will cause the player's death stats to be incremented.
     */
    void removePlayer(GamePlayer player, DeathCause deathCause, GameLeaveReason leaveReason);

    /**
     * Prepare the player for the state of the game.
     *
     * @param player The player to prepare
     */
    void preparePlayer(SWPlayer player);

    /**
     * Prepare the inventory of the player for the state of the game.
     *
     * @param player The player to prepare
     */
    void preparePlayerInventory(SWPlayer player);

    /**
     * Get all players in the game.
     * This is a copy of the list, so it is safe to modify it.
     *
     * @return A copy of the list of players in the game
     */
    List<GamePlayer> getPlayersCopy();

    /**
     * Get all players in the game that are alive.
     *
     * @return A list of players that are alive
     */
    List<GamePlayer> getAlivePlayers();

    /**
     * Get all teams that are alive.
     *
     * @return A list of teams that are alive
     */
    List<GameTeam> getAliveTeams();

    /**
     * Get all players that are in the waiting lobby for the game (no team assigned).
     *
     * @return List of waiting players
     */
    List<GamePlayer> getWaitingPlayers();

    /**
     * Get all players that are spectating the game.
     *
     * @return A list of spectators.
     */
    List<GamePlayer> getSpectators();

    /**
     * Prepare the world for an edit session.
     * Places all spawnpoints.
     */
    void makeReadyForEditing();

    /**
     * Get the current timer of the game in seconds.
     *
     * @return The current timer of the game in seconds.
     */
    int getTimer();

    /**
     * Updates the timer of the game
     *
     * @param timer The new timer
     */
    void setTimer(int timer);

    /**
     * Removes all the cages that are currently placed.
     */
    void removeCages();

    /**
     * Fill all the registered chests in the world
     */
    void fillChests();

    /**
     * Loads all teams and their spawn locations from the template.
     */
    void loadTeams();

    /**
     * Make the game ready for players to join.
     * Starts the schedulers and sets the state to WAITING.
     *
     * @return A future that completes when the game is ready for players to join
     */
    CompletableFuture<Void> makeReadyForGame();

    /**
     * Get the winning team.
     *
     * @return The winning team, null if there is no winner (yet)
     */
    GameTeam getWinningTeam();

    /**
     * Determine which team has won the game.
     */
    void determineWinner();

    /**
     * Handle the death of a player.
     *
     * @param player The player that died
     * @param reason The reason of death
     */
    void handlePlayerDeath(GamePlayer player, DeathCause reason);

    /**
     * Cast a vote for a vote option.
     *
     * @param player The player that is voting
     * @param option The option that is being voted for
     */
    void addPlayerVote(GamePlayer player, VoteOption option);

    /**
     * Get the votes for a vote type.
     *
     * @param voteType The vote type to get the votes for
     * @return A list of player votes
     */
    List<PlayerVote> getPlayerVotes(VoteType voteType);

    /**
     * Get the votes for a vote option.
     *
     * @param voteOption The vote option to get the votes for
     * @return The number of votes for the vote option
     */
    int getPlayerVotesCount(VoteOption voteOption);

}
