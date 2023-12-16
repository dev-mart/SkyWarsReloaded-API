package net.devmart.skywarsreloaded.api.command;

import net.devmart.skywarsreloaded.api.game.GameTemplate;
import net.devmart.skywarsreloaded.api.game.gameinstance.GameInstance;
import net.devmart.skywarsreloaded.api.game.kits.SWKit;
import net.devmart.skywarsreloaded.api.utils.Item;
import net.devmart.skywarsreloaded.api.utils.Message;
import net.devmart.skywarsreloaded.api.wrapper.sender.SWCommandSender;

import java.util.function.Function;

/**
 * This class is used to validate command arguments and send error messages to the sender if they are invalid.
 */
public interface CommandArgumentValidator {

    /**
     * Checks if the value is between the min and max values (both inclusive), otherwise sends an error message to the sender.
     *
     * @param value The value to check
     * @param min   The minimum value
     * @param max   The maximum value
     * @return True if the value is between the min and max values, otherwise false
     */
    boolean between(SWCommandSender sender, int value, int min, int max);

    /**
     * Checks if the value is less than the max value, otherwise sends an error message to the sender.
     *
     * @param value The value to check
     * @param max   The maximum value
     * @return True if the value is less than the max value, otherwise false
     */
    boolean lessThan(SWCommandSender sender, int value, int max);

    /**
     * Checks if the value is greater than the min value, otherwise sends an error message to the sender.
     *
     * @param value The value to check
     * @param min   The minimum value
     * @return True if the value is greater than the min value, otherwise false
     */
    boolean greaterThan(SWCommandSender sender, int value, int min);

    /**
     * Returns the integer value if it is a valid integer, otherwise sends an error message to the sender.
     *
     * @param value The string to parse
     * @return The integer value if it is a valid integer, otherwise null
     */
    Integer isInteger(SWCommandSender sender, String value);

    /**
     * Returns the boolean value if it is a valid boolean, otherwise sends an error message to the sender.
     *
     * @param value The string to parse
     * @return The boolean value if it is a valid boolean, otherwise null
     */
    Boolean isBoolean(SWCommandSender sender, String value);

    /**
     * Returns the game template if it exists, otherwise sends an error message to the sender.
     *
     * @param templateName The name of the template
     * @return The game template if it exists, otherwise null
     */
    GameTemplate gameTemplateExists(SWCommandSender sender, String templateName);

    /**
     * Returns the game instance of the world the player is in, if it is being edited,
     * otherwise sends an error message to the sender.
     *
     * @param worldName The name of the world
     * @return The game instance if the sender is editing it, otherwise null
     */
    GameInstance gameInstanceInEditMode(SWCommandSender sender, String worldName);

    /**
     * Returns the kit if it exists, otherwise sends an error message to the sender.
     *
     * @param kitName The name of the kit
     * @return The kit if it exists, otherwise null
     */
    SWKit kitExists(SWCommandSender sender, String kitName);

    Item holdsItem(SWCommandSender sender);

    /**
     * Returns the enum value if it exists, otherwise sends an error message to the sender.
     *
     * @param input                The input string to parse
     * @param enumFunction         The function to parse the string into an enum value
     * @param errorMessageProperty The messages config property to use for the error message
     * @param <T>                  The enum type
     * @return The enum value if it exists, otherwise null
     */
    <T extends Enum<T>> T enumValue(SWCommandSender sender, String input, Function<String, T> enumFunction, String errorMessageProperty);

    /**
     * Returns the enum value if it exists, otherwise sends an error message to the sender.
     *
     * @param input        The input string to parse
     * @param enumFunction The function to parse the string into an enum value
     * @param message      The message to send if the value is invalid
     * @param <T>          The enum type
     * @return The enum value if it exists, otherwise null
     */
    <T extends Enum<T>> T enumValue(SWCommandSender sender, String input, Function<String, T> enumFunction, Message message);

}
