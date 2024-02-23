package net.devmart.skywarsreloaded.api.unlockable.projectileeffect;

import net.devmart.skywarsreloaded.api.unlockable.Unlockable;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWEntity;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWProjectile;
import net.devmart.skywarsreloaded.api.wrapper.world.block.SWBlock;

public interface ProjectileEffect extends Unlockable {

    void tick(SWProjectile entity);

    void onEntityHit(SWProjectile projectile, SWEntity hitEntity);

    void onBlockHit(SWProjectile projectile, SWBlock block);

}
