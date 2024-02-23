package net.devmart.skywarsreloaded.api.unlockable.projectileeffect;

import net.devmart.skywarsreloaded.api.unlockable.Unlockable;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWEntity;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import net.devmart.skywarsreloaded.api.wrapper.world.block.SWBlock;

public interface ProjectileEffect extends Unlockable {

    void tick(SWEntity entity);

    void onPlayerHit(SWEntity projectile, SWPlayer player);

    void onBlockHit(SWEntity projectile, SWBlock block);

}
