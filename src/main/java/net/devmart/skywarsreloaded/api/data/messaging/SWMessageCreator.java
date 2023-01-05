package net.devmart.skywarsreloaded.api.data.messaging;

import net.devmart.skywarsreloaded.api.game.GameTemplate;
import net.devmart.skywarsreloaded.api.game.gameinstance.GameInstance;
import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;
import net.devmart.skywarsreloaded.api.game.gameinstance.RemoteGameInstance;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import org.jetbrains.annotations.Nullable;

public interface SWMessageCreator {

    SWMessage createGameCreationRequest(GameTemplate template, String targetServer);

    SWMessage createGameCreationResponse(SWMessage message, @Nullable GameInstance createdGame);

    SWMessage createGameDeletionRequest(GameInstance instance, String targetServer);

    SWMessage createGameUpdatePing(LocalGameInstance game);

    SWMessage createGameJoinReservationRequest(RemoteGameInstance instance, SWPlayer player);

    SWMessage createGameJoinReservationResponse(SWMessage message, boolean accepted, Long expirationTime);

    SWMessage createServerUpdatePing();

    enum MessageChannel {
        GAME_CREATION_REQUEST("creategame"),
        GAME_CREATION_RESPONSE("gamecreated"),
        GAME_DELETION_REQUEST("deletegame"),
        GAME_UPDATE_PING("gameupdate"),
        SERVER_UPDATE_PING("serverupdate"),
        GAME_JOIN_RESERVATION_REQUEST("reservejoin"),
        GAME_JOIN_RESERVATION_RESPONSE("joinreserved");

        private final String id;

        MessageChannel(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return id;
        }

        public String getId() {
            return id;
        }
    }

}
