package net.devmart.skywarsreloaded.api.data.messaging;

import java.util.List;

public interface SWMySQLMessagingStorage {

    int addMessage(SWPacketMessage message);

    /**
     * Delete a message from the database.
     *
     * @param message     The message to delete.
     * @param withReplies Whether to delete any replies to the message.
     */
    void removeMessage(SWPacketMessage message, boolean withReplies);

    List<SWPacketMessage> getIncomingMessages();

    void cleanupTable();

}
