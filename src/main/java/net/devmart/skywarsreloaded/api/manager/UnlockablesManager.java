package net.devmart.skywarsreloaded.api.manager;

import net.devmart.skywarsreloaded.api.unlockable.killmessages.KillMessageGroup;

import java.util.List;

public interface UnlockablesManager {

    void load();

    void loadKillMessages();

    void loadDefaultKillMessage();

    List<KillMessageGroup> getKillMessageGroups();

    KillMessageGroup getKillMessageGroup(String identifier);

}
