package net.devmart.skywarsreloaded.api.data.player.stats;

public interface SWPlayerStats {

    boolean isInitialized();

    void initData(int solo_wins,
                  int solo_kills,
                  int solo_games,
                  int solo_deaths,
                  int team_wins,
                  int team_kills,
                  int team_games,
                  int team_deaths,
                  int experience);

    int getSoloWins();

    void setSoloWins(int amount);

    void addSoloWins(int delta);

    int getDeltaSoloWins();


    int getSoloKills();

    void setSoloKills(int amount);

    void addSoloKills(int delta);

    int getDeltaSoloKills();

    int getSoloGamesPlayed();

    void setSoloGamesPlayed(int amount);

    void addSoloGamesPlayed(int delta);

    int getDeltaSoloGamesPlayed();

    int getTeamWins();

    void setTeamWins(int amount);

    void addTeamWins(int delta);

    int getDeltaTeamWins();

    int getTeamKills();

    void setTeamKills(int amount);

    void addTeamKills(int delta);

    int getDeltaTeamKills();

    int getSoloDeaths();

    void setSoloDeaths(int amount);

    void addSoloDeaths(int delta);

    int getDeltaSoloDeaths();

    int getTeamDeaths();

    void setTeamDeaths(int amount);

    void addTeamDeaths(int delta);

    int getDeltaTeamDeaths();

    int getTeamGamesPlayed();

    void setTeamGamesPlayed(int amount);

    void addTeamGamesPlayed(int delta);

    int getDeltaTeamGamesPlayed();

    int getTotalGamesPlayed();

    int getTotalWins();

    int getTotalKills();

    int getStat(PlayerStat stat);

    int getExperience();

    void setExperience(int amount);

    void addExperience(int delta);

    int getDeltaExperience();

    int getLevel();

    void resetDeltas();

}
