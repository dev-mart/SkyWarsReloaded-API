package net.devmart.skywarsreloaded.api.wrapper.entity;

public interface SWOwnedEntity extends SWEntity {

    String getType();

    SWPlayer getOwner();

    void setOwner(SWPlayer player);

}
