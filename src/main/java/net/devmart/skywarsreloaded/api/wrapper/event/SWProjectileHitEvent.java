package net.devmart.skywarsreloaded.api.wrapper.event;

import net.devmart.skywarsreloaded.api.event.SWEvent;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWEntity;
import net.devmart.skywarsreloaded.api.wrapper.world.block.SWBlock;
import org.jetbrains.annotations.Nullable;

public interface SWProjectileHitEvent extends SWEvent, SWCancellable{

    SWEntity getProjectile();

    @Nullable
    SWBlock getHitBlock();

    @Nullable
    SWEntity getHitEntity();

}
