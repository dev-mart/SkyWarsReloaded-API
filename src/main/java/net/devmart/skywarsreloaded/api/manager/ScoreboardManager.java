package net.devmart.skywarsreloaded.api.manager;

import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;
import net.devmart.skywarsreloaded.api.utils.scoreboards.SWBoard;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface ScoreboardManager {

    void updatePlayer(SWPlayer player);

    void updateAllPlayers(LocalGameInstance gameWorld);

    /**
     * Determine what scoreboard format to apply to a player.
     *
     * @param player Player to show scoreboard to.
     * @return id of scoreboard format.
     */
    String determineScoreboardFormat(SWPlayer player);

    /**
     * Replaces all placeholders for the player in the game.
     *
     * @param player    Player to parse the placeholders for.
     * @param line      Line to parse the placeholders for.
     * @param gameWorld Optional GameWorld of the player to use for parsing.
     * @return Parsed line.
     */
    String prepareLine(SWPlayer player, String line, @Nullable LocalGameInstance gameWorld);

    SWBoard createScoreboard(SWPlayer player, int lineCount);

    SWBoard getScoreboard(SWPlayer player);

    List<String> getScoreboardLines(SWPlayer player, String format);

}
