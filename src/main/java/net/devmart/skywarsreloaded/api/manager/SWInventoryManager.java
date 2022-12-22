package net.devmart.skywarsreloaded.api.manager;

import net.devmart.skywarsreloaded.api.wrapper.server.SWInventory;

public interface SWInventoryManager {

    void registerInventory(SWInventory inventory);

    void unregisterInventory(SWInventory inventory);

    void replaceInventory(SWInventory oldInventory, SWInventory newInventory);

}
