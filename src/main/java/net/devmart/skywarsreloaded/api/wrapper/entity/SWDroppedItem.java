package net.devmart.skywarsreloaded.api.wrapper.entity;

import net.devmart.skywarsreloaded.api.utils.Item;

import java.util.UUID;

public interface SWDroppedItem extends SWEntity {

    Item getItem();

    void setItem(Item itemStack);

    int getPickupDelay();

    void setPickupDelay(int delay);

    void setUnlimitedLifetime(boolean unlimitedLifetime);

    boolean isUnlimitedLifetime();

    UUID getOwner();

    void setOwner(UUID owner);

    UUID getThrower();

    void setThrower(UUID thrower);

}
