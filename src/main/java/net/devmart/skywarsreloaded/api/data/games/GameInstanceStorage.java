package net.devmart.skywarsreloaded.api.data.games;

import net.devmart.skywarsreloaded.api.data.Storage;
import net.devmart.skywarsreloaded.api.game.GameTemplate;
import net.devmart.skywarsreloaded.api.game.gameinstance.GameInstance;
import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;
import net.devmart.skywarsreloaded.api.game.gameinstance.RemoteGameInstance;

import java.util.List;
import java.util.UUID;

public interface GameInstanceStorage extends Storage {

    List<RemoteGameInstance> fetchGameInstances();

    RemoteGameInstance getGameInstanceById(UUID uuid);

    List<RemoteGameInstance> getGameInstancesByTemplate(GameTemplate template);

    void updateGameInstance(LocalGameInstance gameInstance);

    void removeOldInstances();

    void removeGameInstance(GameInstance gameInstance);

    void removeGameInstance(UUID uuid);

    void startAutoUpdating();

    void stopAutoUpdating();

}
