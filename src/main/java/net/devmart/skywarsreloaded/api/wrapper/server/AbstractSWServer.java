package net.devmart.skywarsreloaded.api.wrapper.server;

import net.devmart.skywarsreloaded.api.SkyWarsReloaded;

public abstract class AbstractSWServer implements SWServer {

    protected final SkyWarsReloaded plugin;

    public AbstractSWServer(SkyWarsReloaded pluginIn) {
        this.plugin = pluginIn;
    }


}
