package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.utils.Item;

public interface SWPlayerFoodLevelChangeEvent extends SWPlayerEvent, SWCancellable {

    int getFoodLevel();

    void setFoodLevel(int foodLevel);

    Item getItem();

}
