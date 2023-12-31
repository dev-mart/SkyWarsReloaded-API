package net.devmart.skywarsreloaded.api.listener;

public interface PluginMessageListener {

    void onPluginMessageReceived(String channel, byte[] message);

}
