package net.devmart.skywarsreloaded.api.utils.properties;

public class DatabaseProperties {

    public static String UUID = "uuid";
    public static String ID = "id";
    public static String TIMESTAMP = "timestamp";

    public static String TABLE_PLAYER_DATA = "player_data";
    public static String TABLE_PLAYER_STATS = "player_stats";
    public static String TABLE_PLAYER_UNLOCKABLES = "player_unlockables";
    public static String TABLE_GAME_INSTANCES = "game_instances";
    public static String TABLE_MESSAGING = "messaging";


    // player data
    public static String PLAYER_DATA_SOLO_CAGE = "selected_solo_cage";
    public static String PLAYER_DATA_TEAM_CAGE = "selected_team_cage";
    public static String PLAYER_DATA_PARTICLE = "selected_particle";
    public static String PLAYER_DATA_KILL_EFFECT = "selected_kill_effect";
    public static String PLAYER_DATA_WIN_EFFECT = "selected_win_effect";
    public static String PLAYER_DATA_PROJECTILE_EFFECT = "selected_projectile_effect";
    public static String PLAYER_DATA_KILL_MESSAGES_THEME = "selected_kill_messages_theme";
    public static String PLAYER_DATA_KIT = "selected_kit";

    // player stats
    public static String PLAYER_STATS_SOLO_WINS = "solo_wins";
    public static String PLAYER_STATS_SOLO_KILLS = "solo_kills";
    public static String PLAYER_STATS_SOLO_GAMES = "solo_games";
    public static String PLAYER_STATS_SOLO_DEATHS = "solo_deaths";
    public static String PLAYER_STATS_TEAM_WINS = "team_wins";
    public static String PLAYER_STATS_TEAM_KILLS = "team_kills";
    public static String PLAYER_STATS_TEAM_GAMES = "team_games";
    public static String PLAYER_STATS_TEAM_DEATHS = "team_deaths";
    public static String PLAYER_STATS_EXPERIENCE = "experience";

    // player unlockables
    public static String PLAYER_UNLOCKABLES_TYPE = "type";
    public static String PLAYER_UNLOCKABLES_NAME = "name";

    // game instances
    public static String GAME_INSTANCES_TEMPLATE_ID = "template_id";
    public static String GAME_INSTANCES_SERVER_ID = "server_id";
    public static String GAME_INSTANCES_PLAYER_COUNT = "playercount";
    public static String GAME_INSTANCES_STATE = "state";
    public static String GAME_INSTANCES_CREATED_AT = "created_at";
    public static String GAME_INSTANCES_UPDATED_AT = "updated_at";

    // messaging
    public static String MESSAGING_PAYLOAD = "payload";
    public static String MESSAGING_CHANNEL = "channel";
    public static String MESSAGING_ORIGIN_SERVER = "origin_server";
    public static String MESSAGING_TARGET_SERVER = "target_server";
    public static String MESSAGING_REPLY_TO_ID = "reply_to_id";

}
