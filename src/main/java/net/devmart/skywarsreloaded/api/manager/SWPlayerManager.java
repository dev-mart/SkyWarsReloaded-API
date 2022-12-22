package net.devmart.skywarsreloaded.api.manager;

import net.devmart.skywarsreloaded.api.wrapper.entity.SWEntity;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;

import java.util.List;
import java.util.UUID;

public interface SWPlayerManager {

    SWEntity getEntityFromUUID(UUID uuid);

    SWPlayer getPlayerByUUID(UUID uuid);

    SWPlayer initPlayer(UUID uuid);

    List<SWPlayer> getPlayers();

    void removePlayer(SWPlayer player);

    void initAllPlayers();
}
