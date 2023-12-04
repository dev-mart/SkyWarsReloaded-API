package net.devmart.skywarsreloaded.api.manager.gameinstance;

import net.devmart.skywarsreloaded.api.game.GameTemplate;
import net.devmart.skywarsreloaded.api.game.gameinstance.GameInstance;
import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;
import net.devmart.skywarsreloaded.api.wrapper.world.SWWorld;

/**
 * Manager used when the plugin is in "not-proxy" mode
 */
public interface LocalGameInstanceManager extends GameInstanceManager<LocalGameInstance> {

    /**
     * Get a {@link GameTemplate} by its wrapped world.
     *
     * @param swWorld The wrapped world object the game world is based on.
     * @return GameTemplate if found, null otherwise.
     */
    LocalGameInstance getGameInstanceBySWWorld(SWWorld swWorld);

}
