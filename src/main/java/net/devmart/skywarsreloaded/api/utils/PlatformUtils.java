package net.devmart.skywarsreloaded.api.utils;

import com.sk89q.worldedit.world.World;
import net.devmart.skywarsreloaded.api.utils.properties.options.GuiLayoutOptions;
import net.devmart.skywarsreloaded.api.wrapper.sender.SWCommandSender;
import net.devmart.skywarsreloaded.api.wrapper.world.SWWorld;

import java.util.Map;
import java.util.UUID;

public interface PlatformUtils {

    boolean isInt(String arg0);

    boolean isDouble(String arg0);

    boolean isFloat(String arg0);

    boolean isBoolean(String arg0);

    /**
     * @param uuidString UUID string to parse.
     * @return UUID if valid, null if not.
     */
    UUID getUUIDFromString(String uuidString);

    String colorize(String text);

    String formatMessage(String message, Map<String, String> replacements, boolean colorize);

    String parsePlaceholders(String message, SWCommandSender sender);

    /**
     * Get the major sub-version-number of the current server's implementing minecraft release.
     * For example: 1.8.8 -> 8, 1.17.1 -> 17
     *
     * @return An int representing the sub version of the current server's minecraft version.
     */
    int getServerVersion();

    int getBuildLimit();

    World getWorldEditWorld(String worldName);

    SWWorld getSWWorld(String worldName);

    Effect getEffect(String effect);

    String centerMessage(String message);

    Item getItemFromMap(Map<String, Object> map);

    /**
     * Get the available slots for a given layout option.
     * @param layoutOption {@link GuiLayoutOptions} layout style
     * @return array of slots
     */
    int[] getLayoutSlots(String layoutOption, boolean withFooter);

}
