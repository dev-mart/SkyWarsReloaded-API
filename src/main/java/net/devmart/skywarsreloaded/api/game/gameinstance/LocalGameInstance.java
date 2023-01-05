package net.devmart.skywarsreloaded.api.game.gameinstance;

import net.devmart.skywarsreloaded.api.game.GamePlayer;
import net.devmart.skywarsreloaded.api.game.GameScheduler;
import net.devmart.skywarsreloaded.api.game.GameTeam;
import net.devmart.skywarsreloaded.api.game.chest.SWChestTier;
import net.devmart.skywarsreloaded.api.game.types.ChestType;
import net.devmart.skywarsreloaded.api.utils.Message;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import net.devmart.skywarsreloaded.api.wrapper.world.SWWorld;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface LocalGameInstance extends GameInstance {

    /**
     * Get a list of all the teams in the game.
     *
     * @return A list of all the teams in the game.
     */
    List<GameTeam> getTeams();

    /**
     * Get the team of the player.
     *
     * @param player The player to get the team of
     * @return The team of the player when assigned, null otherwise
     */
    GameTeam getTeam(GamePlayer player);

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
     * End the current game.
     */
    void endGame();

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
     * Get the voted chest tiers per player.
     *
     * @return The voted chest tiers per player
     */
    Map<UUID, SWChestTier> getVotedChestTiers();

    /**
     * Get the chest types that players are using during their edit session.
     *
     * @return The selected chest types per player.
     */
    Map<UUID, ChestType> getSelectedEditingChestTypes();

    /**
     * Get the voted chest tier of the game.
     *
     * @return The voted chest tier
     */
    SWChestTier getChestTier();

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
     * Sets what chest tier the player is using for editing the game template.
     *
     * @param player The player that is editing.
     * @param type   The chest tier to set.
     */
    void setChestTypeSelected(UUID player, SWChestTier type);

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
     * @param player Player to remove
     */
    void removePlayer(GamePlayer player);

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
     */
    void makeReadyForGame();

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
}
