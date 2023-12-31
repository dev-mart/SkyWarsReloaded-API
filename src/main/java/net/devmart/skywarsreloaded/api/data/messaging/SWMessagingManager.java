package net.devmart.skywarsreloaded.api.data.messaging;

import com.google.gson.JsonObject;
import net.devmart.skywarsreloaded.api.utils.SWCompletableFuture;
import net.devmart.skywarsreloaded.api.utils.properties.MessageChannelProperty;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public interface SWMessagingManager {

    /**
     * Set up the messaging environment.
     */
    void setup();

    /**
     * Create a message to send over the messaging channel.
     *
     * @param channel The channel to send the message over.
     * @param payload The payload of the message.
     * @return {@link SWPacketMessage} an SWMessage
     */
    SWPacketMessage createMessage(MessageChannelProperty channel, JsonObject payload);

    /**
     * Create a message to send over the messaging channel.
     *
     * @param channel The channel to send the message over. See {@link MessageChannelProperty}
     * @param payload The payload of the message.
     * @return {@link SWPacketMessage} an SWMessage
     */
    SWPacketMessage createMessage(String channel, JsonObject payload);

    /**
     * Send a message over the messaging channel.
     *
     * @param message The message to send.
     * @return
     */
    CompletableFuture<SWPacketMessage> sendMessage(SWPacketMessage message);

    /**
     * Reply to a received message.
     *
     * @param message The message to send.
     * @param replyTo The message to reply to.
     */
    void replyMessage(SWPacketMessage message, SWPacketMessage replyTo);

    /**
     * Start listening for incoming messages.
     */
    void startListening();

    /**
     * Stop listening for new messages.
     */
    void stopListening();

    /**
     * Start the cleaning of cached messages.
     */
    void startCleaning();

    /**
     * Completes when reply is received for the message supplied.
     * The message supplied must be sent previously.
     *
     * @param message The message that was sent and for which we are waiting for a reply
     * @return CompletableFuture with the received SWMessage (the reply to the ones sent)
     */
    SWCompletableFuture<SWPacketMessage> waitForReply(SWPacketMessage message);

    /**
     * Executes the consumer when a reply is received for the message parameter.
     * The message parameter must be sent previous to executing this.
     * The returned consumer can be executed multiple times until this messaging implementation
     * is told to stop handling replies to this message.
     *
     * @param message       The message that was sent and for which we are waiting for replies
     * @param replyConsumer The consumer that is executed for every reply received
     */
    void waitForMultipleReplies(SWPacketMessage message, Consumer<SWPacketMessage> replyConsumer);

    void handleIncomingMessage(List<SWPacketMessage> messages);

    void cleanCache();

    enum Type {
        LOCAL, MYSQL, REDIS
    }

}
