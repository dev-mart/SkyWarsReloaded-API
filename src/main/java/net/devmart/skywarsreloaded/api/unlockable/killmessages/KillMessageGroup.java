package net.devmart.skywarsreloaded.api.unlockable.killmessages;

import net.devmart.skywarsreloaded.api.enums.DeathCause;
import net.devmart.skywarsreloaded.api.unlockable.Unlockable;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;

public interface KillMessageGroup extends Unlockable {

    HashMap<DeathCause, List<String>> getMessages();

    void addMessage(DeathCause reason, String message);

    List<String> getMessages(DeathCause reason);

    void setMessages(DeathCause reason, List<String> messages);

    String getRandomMessage(DeathCause reason, @Nullable SWPlayer killer);

}
