package net.devmart.skywarsreloaded.api.manager;

import net.devmart.skywarsreloaded.api.data.config.YAMLConfig;
import net.devmart.skywarsreloaded.api.unlockable.killmessages.KillMessageGroup;
import net.devmart.skywarsreloaded.api.unlockable.projectileeffect.ProjectileEffect;

import java.util.List;

public interface UnlockablesManager {

    void load();

    void loadKillMessages();

    void loadDefaultKillMessage();

    List<KillMessageGroup> getKillMessageGroups();

    void loadKillMessageGroup(String identifier, YAMLConfig config);

    KillMessageGroup getKillMessageGroup(String identifier);

    List<ProjectileEffect> getProjectileEffects();

    ProjectileEffect getProjectileEffect(String identifier);

    void loadProjectileEffect(String identifier, YAMLConfig config);

    void loadProjectileEffects();

}
