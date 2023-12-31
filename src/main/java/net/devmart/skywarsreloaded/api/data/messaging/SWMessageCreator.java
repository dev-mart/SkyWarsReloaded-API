package net.devmart.skywarsreloaded.api.data.messaging;

import net.devmart.skywarsreloaded.api.game.GameTemplate;
import net.devmart.skywarsreloaded.api.game.gameinstance.GameInstance;
import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import org.jetbrains.annotations.Nullable;

public interface SWMessageCreator {

    SWPacketMessage createGameCreationRequest(GameTemplate template, String targetServer);

    SWPacketMessage createGameCreationResponse(SWPacketMessage message, @Nullable GameInstance createdGame);

    SWPacketMessage createGameDeletionRequest(GameInstance instance, String targetServer);

    SWPacketMessage createGameUpdatePing(LocalGameInstance game);

    SWPacketMessage createGameJoinReservationRequest(GameInstance instance, SWPlayer player);

    SWPacketMessage createGameJoinReservationResponse(SWPacketMessage message, boolean accepted, Long expirationTime);

    SWPacketMessage createServerUpdatePing();



}
