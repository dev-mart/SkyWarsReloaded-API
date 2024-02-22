package net.devmart.skywarsreloaded.api.hook;

import net.devmart.skywarsreloaded.api.utils.Item;

public interface SWHeadDatabaseHook extends SWHook {

    /**
     * Get a custom head item from the HeadDatabase by its id.
     *
     * @param id the id of the custom head
     * @return the custom head item, or null if the id is invalid
     */
    Item getHeadFromId(String id);

}
