package net.devmart.skywarsreloaded.api.utils.properties;

public class ConfigProperties {

    // Server info
    public static final String PROXY_ENABLED = "proxy.enabled";
    public static final String PROXY_SERVER_NAME = "proxy.server-name";
    public static final String PROXY_SERVER_TYPE = "proxy.server-type";
    public static final String PROXY_SERVERS = "proxy.servers";
    public static final String PROXY_SERVERS_MAX_GAMES = "proxy.servers.max-games"; // sub property

    // Storage database implementation & auth
    public static final String STORAGE_TYPE = "storage.type";
    public static final String STORAGE_MYSQL_HOSTNAME = "storage.mysql.hostname";
    public static final String STORAGE_MYSQL_PORT = "storage.mysql.port";
    public static final String STORAGE_MYSQL_USERNAME = "storage.mysql.username";
    public static final String STORAGE_MYSQL_PASSWORD = "storage.mysql.password";
    public static final String STORAGE_MYSQL_DATABASE = "storage.mysql.database";
    public static final String STORAGE_MYSQL_USE_SSL = "storage.mysql.use-ssl";

    // General settings
    public static final String GENERAL_LOBBY_CLEAR_INVENTORY_ON_ENTRY = "general.lobby.clear-inventory-on-entry";
    public static final String GENERAL_LOBBY_TELEPORT_ON_WORLD_ENTRY = "general.lobby.teleport-on-world-entry";
    public static final String GENERAL_LOBBY_TELEPORT_ON_SERVER_JOIN = "general.lobby.teleport-on-server-join";
    public static final String GENERAL_LOBBY_HEAL_ON_ENTRY = "general.lobby.heal-on-entry";
    public static final String GENERAL_LOBBY_PROTECT_WORLD = "general.lobby.protect-world";
    public static final String GENERAL_LOBBY_ITEMS_GIVE_JOIN_ITEM = "general.lobby.items.give-join-menu-item";
    public static final String GENERAL_LOBBY_ITEMS_GIVE_OPTIONS_ITEM = "general.lobby.items.give-options-menu-item";
    public static final String GENERAL_LOBBY_SCOREBOARD_ENABLED = "general.lobby.scoreboard.enable";
    public static final String GENERAL_LOBBY_SCOREBOARD_UPDATE_INTERVAL = "general.lobby.scoreboard.update-interval";

    // Messaging
    public static final String MESSAGING_TYPE = "messaging.type";
    public static final String MESSAGING_REDIS_HOSTNAME = "messaging.redis.hostname";
    public static final String MESSAGING_REDIS_USERNAME = "messaging.redis.username";
    public static final String MESSAGING_REDIS_PASSWORD = "messaging.redis.password";
    public static final String MESSAGING_REDIS_PORT = "messaging.redis.port";

    // menus
    public static final String MENUS_PAGINATION_SHRINK_TO_FIT = "menus.pagination.shrink-to-fit";
    public static final String MENUS_PAGINATION_ONLY_SHRINK_SINGLE_PAGE = "menus.pagination.only-shrink-single-page";
    public static final String MENUS_PAGINATION_ALLOW_GAPS_WITH_FIXED_POSITIONED_ITEMS = "menus.pagination.allow-gaps-with-fixed-positioned-items";

    public static final String MENUS_KITS_LAYOUT = "menus.kits.layout";
    public static final String MENUS_KITS_ENCHANT_SELECTED_KIT = "menus.kits.enchant-selected-kit";

    public static final String MENUS_TEAM_SELECTOR_LAYOUT = "menus.team-selector.layout";
    public static final String MENUS_TEAM_SELECTOR_ENCHANT_SELECTED_TEAM = "menus.team-selector.enchant-selected-team";

    public static final String MENUS_JOIN_SORT_BY = "menus.join.sort-by";
    public static final String MENUS_JOIN_SHOW_AVAILABLE_TEMPLATES_ONLY = "menus.join.show-available-templates-only";
    public static final String MENUS_JOIN_LAYOUT = "menus.join.layout";

    public static final String MENUS_GAME_OPTIONS_SIZE = "menus.game-options.size";

    public static final String MENUS_UNLOCKABLES_SIZE = "menus.unlockables.size";
    public static final String ITEMS_UNLOCKABLES_MENU_SLOT = "slot";

    // items
    public static final String ITEMS_GAME_KIT_SELECTOR_SLOT = "items.game.kit-selector.slot";
    public static final String ITEMS_GAME_LEAVE_SLOT = "items.game.leave.slot";
    public static final String ITEMS_GAME_OPTIONS_VOTING_SLOT = "items.game.options-voting.slot";
    public static final String ITEMS_GAME_TEAM_SELECTOR_SLOT = "items.game.team-selector.slot";
    public static final String ITEMS_LOBBY_JOIN_SLOT = "items.lobby.join.slot";
    public static final String ITEMS_LOBBY_OPTIONS_SLOT = "items.lobby.options.slot";

    // sounds
    public static final String SOUNDS_GENERAL_ACTION_FORBIDDEN = "sounds.general.action-forbidden";
    public static final String SOUNDS_GAME_SELECT_TEAM = "sounds.game.select-team";

    // todo: messaging impl & auth

    // Game instances
    public static final String GAME_INSTANCES = "game-instances";
    public static final String GAME_INSTANCES_MAX_INSTANCES = "game-instances.max-instances";
    public static final String GAME_INSTANCES_LOCAL_MODE = "game-instances.local-mode";
    public static final String GAME_INSTANCES_LOCAL_MODE_IDLE_INSTANCES = "game-instances.local-mode.idle-instances";
    public static final String GAME_INSTANCES_PROXY_MODE = "game-instances.proxy-mode";
    public static final String GAME_INSTANCES_PROXY_MODE_DYNAMIC_MODE = "game-instances.proxy-mode.dynamic-mode";
    public static final String GAME_INSTANCES_PROXY_MODE_DYNAMIC_MODE_MIN_IDLE = "game-instances.proxy-mode.dynamic-mode.min-idle";
    public static final String GAME_INSTANCES_PROXY_MODE_DYNAMIC_MODE_MAX_INSTANCES = "game-instances.proxy-mode.dynamic-mode.max-instances";
    public static final String GAME_INSTANCES_PROXY_MODE_FIXED_TEMPLATES = "game-instances.proxy-mode.fixed-templates";

    // Game preferences
    public static final String GAME_WAITING_LOBBY_SOLO_GAMES = "game.waiting-lobby.solo-games-lobby";
    public static final String GAME_WAITING_LOBBY_SCHEMATIC_MODE = "game.waiting-lobby.schematic-mode";
    public static final String GAME_WAITING_LOBBY_BELOW_TELEPORT_ENABLED = "game.waiting-lobby.teleport-when-below.enable";
    public static final String GAME_WAITING_LOBBY_BELOW_TELEPORT_DISTANCE = "game.waiting-lobby.teleport-when-below.distance";


    public static final String CAGE_SEPARATE_CAGES = "game.cages.separate-cages";
    // Game prefs - Timer
    public static final String GAME_TIMER_WAITING_LOBBY = "game.timers.waiting-lobby";
    public static final String GAME_TIMER_WAITING_LOBBY_FULL = "game.timers.waiting-lobby-full";
    public static final String GAME_TIMER_WAITING_CAGES = "game.timers.waiting-cages";
    public static final String GAME_TIMER_WAITING_CAGES_FULL = "game.timers.waiting-cages-full";
    public static final String GAME_TIMER_ENDING = "game.timers.ending";
    // Game prefs - Chests
    public static final String GAME_CHESTS_MAX_ITEMS = "game.chests.max-items";
    public static final String GAME_CHESTS_MAX_ITEMS_DOUBLE = "game.chests.max-items-double";
    public static final String GAME_QUICK_DEATH_ENABLED = "game.quick-death.enable";
    public static final String GAME_QUICK_DEATH_Y_LEVEL = "game.quick-death.y-level";
    public static final String GAME_PVP_TIMER_ENABLED = "game.pvp-timer.enable";
    public static final String GAME_PVP_TIMER_TIME = "game.pvp-timer.time";
    public static final String GAME_PVP_TIMER_ONLY_DISABLE_FALL_DAMAGE = "game.pvp-timer.only-disable-fall-damage";

    public static final String GAME_OPTIONS_VOTING_ENABLED = "game.options-voting.enable";
    public static final String GAME_OPTIONS_CHEST_VOTING_ENABLED = "game.options-voting.chest-voting.enable";
    public static final String GAME_OPTIONS_HEALTH_VOTING_ENABLED = "game.options-voting.health-voting.enable";
    public static final String GAME_OPTIONS_TIME_VOTING_ENABLED = "game.options-voting.time-voting.enable";
    public static final String GAME_OPTIONS_WEATHER_VOTING_ENABLED = "game.options-voting.weather-voting.enable";
    public static final String GAME_OPTIONS_MODIFIER_VOTING_ENABLED = "game.options-voting.modifier-voting.enable";
    public static final String GAME_OPTIONS_PROJECTILE_VOTING_ENABLED = "game.options-voting.projectile-voting.enable";


    // World loader
    public static final String ENABLE_SLIME_WORLD_MANAGER = "world-loader.enable-swm";
    public static final String WORLD_LOADER_ADDITIONAL_CLEAR_RADIUS = "world-loader.additional-clear-radius";
    public static final String SLIME_WORLD_LOADER = "world-loader.swm-loader";

    // Parties
    public static final String PARTIES_ALLOW_DISPERSED_PARTIES = "parties.allow-dispersed-parties";

}
