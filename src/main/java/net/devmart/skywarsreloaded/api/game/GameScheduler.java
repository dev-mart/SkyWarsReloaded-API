package net.devmart.skywarsreloaded.api.game;

import net.devmart.skywarsreloaded.api.wrapper.scheduler.SWRunnable;

import java.util.function.Consumer;

public interface GameScheduler {

    void start();

    void end();

    GameStateHandler getGameStateHandler();

    void setGameStateHandler(GameStateHandler handler);

    void addDelayedTask(SWRunnable runnable, double delay);

    void addTimer(Consumer<SWRunnable> consumer, int timer);

    int getTicksSinceGameStart();

    int getTicksSinceStart();

    int getSecondsSinceGameStart();

    void updateScoreboards();

}
