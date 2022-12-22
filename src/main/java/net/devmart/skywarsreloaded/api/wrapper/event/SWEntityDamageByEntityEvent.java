package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.wrapper.entity.SWEntity;

public interface SWEntityDamageByEntityEvent extends SWEntityDamageEvent, SWCancellable {

    SWEntity getEntity();

    SWEntity getDamager();

}
