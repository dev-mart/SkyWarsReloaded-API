package net.devmart.skywarsreloaded.api.manager.player;

import net.devmart.skywarsreloaded.api.game.gameinstance.GameInstance;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWEntity;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface SWPlayerManager {

    SWEntity getEntityFromUUID(UUID uuid);

    SWPlayer getPlayerByUUID(UUID uuid);

    SWPlayer initPlayer(UUID uuid);

    List<SWPlayer> getPlayers();

    void removePlayer(SWPlayer player);

    void initAllPlayers();

    CompletableFuture<Boolean> joinGameAsync(GameInstance game, SWPlayer player);

    void prepareForLobby(SWPlayer player);

    void giveLobbyItems(SWPlayer player);
}
