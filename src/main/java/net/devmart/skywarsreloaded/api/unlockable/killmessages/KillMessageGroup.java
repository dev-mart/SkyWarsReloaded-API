package net.devmart.skywarsreloaded.api.unlockable.killmessages;

import net.devmart.skywarsreloaded.api.enums.DeathReason;
import net.devmart.skywarsreloaded.api.unlockable.Unlockable;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;

public interface KillMessageGroup extends Unlockable {

    HashMap<DeathReason, List<String>> getMessages();

    void addMessage(DeathReason reason, String message);

    List<String> getMessages(DeathReason reason);

    void setMessages(DeathReason reason, List<String> messages);

    String getRandomMessage(DeathReason reason, @Nullable SWPlayer killer);

}
