package net.devmart.skywarsreloaded.api.game.event;

import net.devmart.skywarsreloaded.api.data.config.YAMLConfig;
import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;

public interface GameInstanceEvent {

    GameEvent getGameEvent();

    LocalGameInstance getGameInstance();

    void loadConfig(YAMLConfig config);

    boolean isEnabled();

    void setEnabled(boolean enabled);

    boolean isRepeatable();

    void setRepeatable(boolean repeatable);

    int getRepeatInterval();

    void setRepeatInterval(int repeatInterval);

    int getMaxRepeats();

    void setMaxRepeats(int maxRepeats);

    int getDuration();

    void setDuration(int duration);

    int getChance();

    void setChance(int chance);

    int getMinStartTime();

    void setMinStartTime(int minStartTime);

    int getMaxStartTime();

    void setMaxStartTime(int maxStartTime);

}
