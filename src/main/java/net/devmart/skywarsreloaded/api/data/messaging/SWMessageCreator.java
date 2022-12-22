package net.devmart.skywarsreloaded.api.data.messaging;

import net.devmart.skywarsreloaded.api.game.GameTemplate;
import net.devmart.skywarsreloaded.api.game.gameinstance.GameInstance;
import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;
import org.jetbrains.annotations.Nullable;

public interface SWMessageCreator {

    SWMessage createGameCreationRequest(GameTemplate template, String targetServer);

    SWMessage createGameCreationResponse(SWMessage message, @Nullable GameInstance createdGame);

    SWMessage createGameDeletionRequest(GameInstance instance, String targetServer);

    SWMessage createGameUpdatePing(LocalGameInstance game);

    SWMessage createServerUpdatePing();

    enum MessageChannel {
        GAME_CREATION_REQUEST("creategame"),
        GAME_CREATION_RESPONSE("gamecreated"),
        GAME_DELETION_REQUEST("deletegame"),
        GAME_UPDATE_PING("gameupdate"),
        SERVER_UPDATE_PING("serverupdate");

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
