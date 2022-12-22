package net.devmart.skywarsreloaded.api.remote;

public interface SWRemoteServerInfo {

    String getId();

    int getMaxGames();

    int getActiveGames();

    int getFreeGames();

    int getPlayerCount();

    boolean isConnectionAlive();

    long getLastPing();

    void update(int activeGames, int playerCount);

}
