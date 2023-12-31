package net.devmart.skywarsreloaded.api.utils.proxy;

import net.devmart.skywarsreloaded.api.listener.PluginMessageListener;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;

import java.util.Optional;

public interface PluginMessaging {

    /**
     * Register a channel for the plugin messaging
     *
     * @param channel The channel
     */
    void registerChannel(String channel);

    /**
     * Unregister a channel for the plugin messaging
     *
     * @param channel The channel
     */
    void unregisterChannel(String channel);

    /**
     * Send a message over the plugin messaging
     *
     * @param channel The channel
     * @param data    The data in bytes
     */
    void send(String channel, byte[] data);

    /**
     * Send a message over the plugin messaging
     *
     * @param player  The player
     * @param channel The channel
     * @param data    The data in bytes
     */
    void sendToPlayer(SWPlayer player, String channel, byte[] data);

    /**
     * Register a plugin messaging listener
     * @param channel The channel
     * @param listener The listener
     */
    void registerListener(String channel, PluginMessageListener listener);

    /**
     * Unregister a plugin messaging listener
     *
     * @param listener The listener
     * @return The channel that was unregistered
     */
    Optional<String> unregisterListener(PluginMessageListener listener);

}
