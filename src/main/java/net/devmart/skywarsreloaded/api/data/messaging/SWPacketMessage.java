package net.devmart.skywarsreloaded.api.data.messaging;

import com.google.gson.JsonObject;
import net.devmart.skywarsreloaded.api.utils.SWCompletableFuture;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public interface SWPacketMessage {

    int getId();

    SWPacketMessage setId(int id);

    /**
     * Gets the time at which the message was sent
     *
     * @return Millis timestamp of time
     */
    long getTimestamp();

    @NotNull
    String getChannel();

    SWPacketMessage setChannel(@NotNull String channel);

    JsonObject getPayload();

    SWPacketMessage setPayload(JsonObject payload);

    String getOriginServer();

    String getTargetServer();

    SWPacketMessage setTargetServer(String targetServerName);

    Integer getReplyToId();

    SWPacketMessage setReplyToId(Integer replyToId);

    SWPacketMessage send();

    SWCompletableFuture<SWPacketMessage> waitForReply();

    void waitForReplyMultiple(Consumer<SWPacketMessage> consumer);

}
