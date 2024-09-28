package net.devmart.skywarsreloaded.api.game.event;

public interface GameEvent {

    String getId();

    void onStart();

    void onStop();

    void onTick();

}
