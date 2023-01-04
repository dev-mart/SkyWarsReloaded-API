package net.devmart.skywarsreloaded.api.data.redis;

import redis.clients.jedis.Jedis;

import java.util.function.BiConsumer;

public interface SWRedisConnection {

    void registerMessenger(SWRedisMessenger messenger);

    // BiConsumer<String channel, String message>
    void registerPubSubListener(String channel, BiConsumer<String, String> consumer);

    // BiConsumer<String channel, String message>
    void unregisterPubSubListener(String channel, BiConsumer<String, String> consumer);

    /**
     * Get Jedis connection from the connection pool
     * @return {@link redis.clients.jedis.Connection}
     */
    Jedis getConnection();

    /**
     * @return True if the connection pool is not closed AND at least one connection is open, otherwise false
     */
    boolean isConnected();
}
