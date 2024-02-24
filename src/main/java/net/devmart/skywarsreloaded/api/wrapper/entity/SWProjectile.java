package net.devmart.skywarsreloaded.api.wrapper.entity;

public interface SWProjectile extends SWOwnedEntity {

    SWEntity getShooter();

    void setShooter(SWEntity shooter);

}
