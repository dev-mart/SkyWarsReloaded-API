package net.devmart.skywarsreloaded.api.manager;

import net.devmart.skywarsreloaded.api.game.kits.SWKit;
import net.devmart.skywarsreloaded.api.utils.Item;

import java.util.List;

public interface KitManager {

    void loadAllKits();

    SWKit getKitById(String kitId);

    void deleteKit(String kitId);

    void createDefaultsIfNotPresent();

    List<SWKit> getKits();

    SWKit getKitFromSlot(int slot);

    SWKit createKit(String id, Item icon);

    SWKit initKit(String id);

    /**
     * Fixes all duplicate kit menu slots and replaces duplicates with unique slots.
     */
    void fixKitSlots();

}
