package net.devmart.skywarsreloaded.api.data.config;

import net.devmart.skywarsreloaded.api.manager.YAMLManager;
import net.devmart.skywarsreloaded.api.unlockable.Unlockable;
import net.devmart.skywarsreloaded.api.utils.Item;
import net.devmart.skywarsreloaded.api.utils.Message;
import net.devmart.skywarsreloaded.api.utils.SWCoord;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface YAMLConfig {

    String getId();

    String getDirectoryName();

    String getFileName();

    File getDirectory();

    File getFile();

    String getString(String property);

    String getString(String property, String defaultValue);

    String getString(Enum<?> property);

    String getString(Enum<?> property, String defaultValue);

    int getInt(String property);

    int getInt(String property, int defaultValue);

    int getInt(Enum<?> property);

    int getInt(Enum<?> property, int defaultValue);

    List<?> getList(String property);

    List<?> getList(String property, List<?> defaultValue);

    List<?> getList(Enum<?> property);

    List<?> getList(Enum<?> property, List<?> defaultValue);

    List<Map<?, ?>> getMapList(String property);

    List<Map<?, ?>> getMapList(Enum<?> property);

    List<Item> getItemList(String property);

    List<Item> getItemList(Enum<?> property);

    List<String> getStringList(String property);

    List<String> getStringList(Enum<?> property);

    Map<String, String> getStringMap(String toString);

    Map<String, String> getStringMap(Enum<?> toString);

    double getDouble(String property);

    double getDouble(String property, double defaultValue);

    double getDouble(Enum<?> property);

    double getDouble(Enum<?> property, double defaultValue);


    boolean getBoolean(String property);

    boolean getBoolean(String property, boolean defaultValue);

    boolean getBoolean(Enum<?> property);

    boolean getBoolean(Enum<?> property, boolean defaultValue);

    Object get(String property);

    Object get(String property, Object defaultValue);

    Object get(Enum<?> property);

    Object get(Enum<?> property, Object defaultValue);

    boolean isSet(String property);

    boolean contains(String property);

    boolean isSet(Enum<?> property);

    boolean contains(Enum<?> property);

    Set<String> getKeys(String property);

    Set<String> getKeys(Enum<?> property);

    Item getItem(String category);

    Item getItem(String category, Item def);

    Item getItem(Enum<?> category);

    Item getItem(Enum<?> category, Item def);

    SWCoord getCoord(String property);

    SWCoord getCoord(Enum<?> property);

    SWCoord getCoord(String property, SWCoord def);

    SWCoord getCoord(Enum<?> property, SWCoord def);

    Message getMessage(String property);

    Message getMessage(Enum<?> property);

    Message getMessage(String property, String def);

    Message getMessage(Enum<?> property, String def);

    Message getMessage(String property, List<String> def);

    void loadUnlockableData(Unlockable unlockable, String property);

    void loadUnlockableData(Unlockable unlockable, Enum<?> property);

    <E extends Enum<E>> E getEnum(Class<E> enumClass, String property);

    <E extends Enum<E>> E getEnum(Class<E> enumClass, String property, String def);

    /**
     * Set a value to a key in the yaml config
     *
     * @param property The key to save the data to
     * @param value    The value to save
     */
    void set(String property, Object value);

    void set(Enum<?> property, Object value);

    /**
     * Do not use this unless you know what you are doing! Use {@link YAMLManager} to perform saves instead.
     * This method is not actually deprecated but instead used as a visual alert.
     */
    @Deprecated
    void save();
}
