package net.devmart.skywarsreloaded.api.utils.properties;

public enum MessageChannelProperty {

    GAME_CREATION_REQUEST("creategame"),
    GAME_CREATION_RESPONSE("gamecreated"),
    GAME_DELETION_REQUEST("deletegame"),
    GAME_UPDATE_PING("gameupdate"),
    SERVER_UPDATE_PING("serverupdate"),
    GAME_JOIN_RESERVATION_REQUEST("reservejoin"),
    GAME_JOIN_RESERVATION_RESPONSE("joinreserved");

    private final String id;

    MessageChannelProperty(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

}