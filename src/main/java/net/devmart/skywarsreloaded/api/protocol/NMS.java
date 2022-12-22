package net.devmart.skywarsreloaded.api.protocol;

import net.devmart.skywarsreloaded.api.utils.Item;
import net.devmart.skywarsreloaded.api.utils.SWCoord;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import net.devmart.skywarsreloaded.api.wrapper.item.SWEnchantmentType;
import net.devmart.skywarsreloaded.api.wrapper.server.SWGameRule;
import net.devmart.skywarsreloaded.api.wrapper.world.SWChunk;
import net.devmart.skywarsreloaded.api.wrapper.world.SWChunkGenerator;
import net.devmart.skywarsreloaded.api.wrapper.world.SWWorld;

public interface NMS {

    void setBlock(SWCoord loc, Item item);

    void setGameRule(SWWorld world, SWGameRule rule, Object value);

    void sendActionbar(SWPlayer player, String message);

    void sendJSONMessage(SWPlayer player, String message);

    void setChestOpen(SWCoord loc, boolean open);

    SWChunkGenerator getChunkGenerator();

    void addPluginChunkTicket(SWChunk chunk);

    String getVoidGeneratorSettings();

    SWEnchantmentType getEnchantment(String name);

}
