package net.devmart.skywarsreloaded.api;

import net.devmart.skywarsreloaded.api.data.config.YAMLConfig;
import net.devmart.skywarsreloaded.api.data.games.GameInstanceStorage;
import net.devmart.skywarsreloaded.api.data.messaging.SWMessageCreator;
import net.devmart.skywarsreloaded.api.data.messaging.SWMessaging;
import net.devmart.skywarsreloaded.api.data.player.SWPlayerStorage;
import net.devmart.skywarsreloaded.api.data.redis.SWRedisConnection;
import net.devmart.skywarsreloaded.api.data.sql.SQLStorage;
import net.devmart.skywarsreloaded.api.game.gameinstance.GameInstance;
import net.devmart.skywarsreloaded.api.game.loader.GameWorldLoader;
import net.devmart.skywarsreloaded.api.hook.SWHook;
import net.devmart.skywarsreloaded.api.listener.PlatformSWEventListener;
import net.devmart.skywarsreloaded.api.manager.*;
import net.devmart.skywarsreloaded.api.manager.game.*;
import net.devmart.skywarsreloaded.api.manager.game.instance.GameInstanceManager;
import net.devmart.skywarsreloaded.api.manager.player.SWPlayerDataManager;
import net.devmart.skywarsreloaded.api.manager.player.SWPlayerManager;
import net.devmart.skywarsreloaded.api.utils.PlatformUtils;
import net.devmart.skywarsreloaded.api.utils.SWLogger;
import net.devmart.skywarsreloaded.api.wrapper.scheduler.SWScheduler;
import net.devmart.skywarsreloaded.api.wrapper.sender.SWCommandSender;
import net.devmart.skywarsreloaded.api.wrapper.server.SWServer;

import java.io.File;

/**
 * The interface for the main class of the SkyWarsReloaded plugin.
 */
public interface SkyWarsReloaded {

    // Plugin

    void onEnable() throws ClassNotFoundException;

    void onDisable();

    /**
     * Registers the default hooks that SkyWars uses for compatibility
     * This method can be overridden if you wish to disable the default SkyWars hooks.
     * <br><br>
     * If you want to register plugin hooks into SkyWars that can be hooked after the {@link #onEnable()}
     * is executed, we recommend using {@link #getHookManager()} then {@link SWHookManager#registerHook(Class, SWHook)}
     * <br><br>
     * If you really need to register your own hooks into SkyWars that will run at enable time, we recommend
     * overriding this method in your own SkyWars implementation and calling super.
     * before registering your own.
     */
    void registerDefaultHooks();

    SWLogger getLogger();

    void setLogger(SWLogger logger);

    void disableSkyWars();

    /**
     * Get the plugin version
     *
     * @return The plugin version
     */
    String getVersion();

    // Config and init data

    File getDataFolder();

    YAMLManager getYAMLManager();

    void setYAMLManager(YAMLManager yamlManager);

    YAMLConfig getConfig();

    void setConfig(YAMLConfig config);

    YAMLConfig getDataConfig();

    void setDataConfig(YAMLConfig data);

    YAMLConfig getGeneralMessages();

    void setGeneralMessages(YAMLConfig config);

    YAMLConfig getItemMessages();

    void setItemMessages(YAMLConfig config);

    YAMLConfig getVoteOptionsMessages();

    void setVoteOptionsMessages(YAMLConfig config);

    // Hooks

    SWHookManager getHookManager();

    void setHookManager(SWHookManager hookManager);

    // Other plugin managers

    GameWorldLoader getWorldLoader();

    void setWorldLoader(GameWorldLoader loader);

    SchematicManager getSchematicManager();

    void setSchematicManager(SchematicManager schematicManager);

    KitManager getKitManager();

    void setKitManager(KitManager kitManager);

    SWCommandManager getCommandManager();

    void setCommandManager(SWCommandManager commandManager);

    GameInstanceManager<? extends GameInstance> getGameInstanceManager();

    void setGameInstanceManager(GameInstanceManager<? extends GameInstance> gameManager);

    SWPlayerManager getPlayerManager();

    void setPlayerManager(SWPlayerManager playerManager);

    CageManager getCageManager();

    void setCageManager(CageManager cageManager);

    UnlockablesManager getUnlockablesManager();

    void setUnlockablesManager(UnlockablesManager unlockablesManager);

    EntityManager getEntityManager();

    void setEntityManager(EntityManager entityManager);

    ScoreboardManager getScoreboardManager();

    void setScoreboardManager(ScoreboardManager scoreboardManager);

    SWChestFillerManager getChestFillerManager();

    void setChestFillerManager(SWChestFillerManager chestFillerManager);

    ItemManager getItemManager();

    void setItemManager(ItemManager itemManager);

    SWGuiManager getGuiManager();

    void setGuiManager(SWGuiManager itemManager);

    SWInventoryManager getInventoryManager();

    void setInventoryManager(SWInventoryManager inventoryManager);

    SWPlayerDataManager getPlayerDataManager();

    void setPlayerDataManager(SWPlayerDataManager playerDataManager);

    SWChestManager getChestManager();

    void setChestManager(SWChestManager chestManager);

    VoteOptionManager getVoteOptionManager();

    void setVoteOptionManager(VoteOptionManager voteOptionManager);

    DatabaseVersionManager getDatabaseVersionManager();

    void setDatabaseVersionManager(DatabaseVersionManager databaseVersionManager);

    SWMessaging getMessaging();

    void setMessaging(SWMessaging messaging);

    SWMessageCreator getMessageCreator();

    void setMessageCreator(SWMessageCreator messageCreator);

    // Console

    SWCommandSender getConsoleSender();

    void setConsoleSender(SWCommandSender consoleSender);


    // Player Data

    SQLStorage getSQLStorage();

    void setSQLStorage(SQLStorage storage);

    SWRedisConnection getRedisConnection();

    void setRedisConnection(SWRedisConnection redisConnection);

    SWPlayerStorage getPlayerStorage();

    void setPlayerStorage(SWPlayerStorage storage);

    // Instance Data

    GameInstanceStorage getGameInstanceStorage();

    void setGameInstanceStorage(GameInstanceStorage instanceStorage);

    // Events

    void setEventManager(SWEventManager eventManager);

    SWEventManager getEventManager();

    // Listeners

    void setPlatformUtils(PlatformUtils utils);

    PlatformSWEventListener getPlatformEventListener();

    void setPlatformEventListener(PlatformSWEventListener listener);

    // Messaging

    // Schedulers

    SWScheduler getScheduler();

    void setScheduler(SWScheduler scheduler);

    // Server

    /**
     * Get the server's minecraft version
     *
     * @return The server's minecraft version
     */
    String getMinecraftVersion();

    /**
     * Get the platform's version (such as git-Purpur-1413)
     *
     * @return The platform's version
     */
    String getPlatformVersion();

    /**
     * Get the server wrapper
     *
     * @return The server wrapper
     */
    SWServer getServer();

    /**
     * Set server wrapper
     *
     * @param server The server wrapper
     */
    void setServer(SWServer server);

    /**
     * Get the NMS manager
     *
     * @return The NMS manager
     */
    NMSManager getNMSManager();

    /**
     * Set the NMS manager
     *
     * @param nmsManager The NMS manager
     */
    void setNMSManager(NMSManager nmsManager);

    // Utils

    PlatformUtils getUtils();
}
