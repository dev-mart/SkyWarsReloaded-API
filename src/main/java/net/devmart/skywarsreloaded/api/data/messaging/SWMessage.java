package net.devmart.skywarsreloaded.api.data.messaging;

import com.google.gson.JsonObject;
import net.devmart.skywarsreloaded.api.utils.SWCompletableFuture;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public interface SWMessage {

    int getId();

    SWMessage setId(int id);

    /**
     * Gets the time at which the message was sent
     *
     * @return Millis timestamp of time
     */
    long getTimestamp();

    @NotNull
    String getChannel();

    SWMessage setChannel(@NotNull String channel);

    JsonObject getPayload();

    SWMessage setPayload(JsonObject payload);

    String getOriginServer();

    String getTargetServer();

    SWMessage setTargetServer(String targetServerName);

    Integer getReplyToId();

    SWMessage setReplyToId(Integer replyToId);

    SWMessage send();

    SWCompletableFuture<SWMessage> waitForReply();

    void waitForReplyMultiple(Consumer<SWMessage> consumer);

}
