package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.enums.DeathReason;
import net.devmart.skywarsreloaded.api.event.SWEvent;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWEntity;

public interface SWEntityDamageEvent extends SWEvent, SWCancellable {

    SWEntity getEntity();

    void setDamage(double damage);

    double getDamage();

    double getFinalDamage();

    DeathReason getCause();

}
