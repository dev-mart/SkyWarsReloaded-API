package net.devmart.skywarsreloaded.api.data;

import net.devmart.skywarsreloaded.api.data.config.YAMLConfig;

public interface Storage {

    void setup(YAMLConfig config) throws ClassNotFoundException;

}
