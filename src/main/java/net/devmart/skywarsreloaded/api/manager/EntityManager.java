package net.devmart.skywarsreloaded.api.manager;

import net.devmart.skywarsreloaded.api.wrapper.entity.SWEntity;

import java.util.UUID;

public interface EntityManager {

    SWEntity getEntityByUUID(UUID uuid);

}
