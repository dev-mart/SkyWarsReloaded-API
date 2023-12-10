package net.devmart.skywarsreloaded.api.utils;

/**
 * The main logging class for the skywars plugin
 */
public interface SWLogger {

    /**
     * Logs a debug message with parsed arguments (String.format)
     *
     * @param message The message to log
     * @param args    The arguments to parse
     */
    void debug(String message, Object... args);

    /**
     * Logs an info message with parsed arguments (String.format)
     *
     * @param message The message to log
     * @param args    The arguments to parse
     */
    void info(String message, Object... args);

    /**
     * Logs a warning message with parsed arguments (String.format)
     *
     * @param message The message to log
     * @param args    The arguments to parse
     */
    void warn(String message, Object... args);

    /**
     * Logs an error message with parsed arguments (String.format)
     *
     * @param message The message to log
     * @param args    The arguments to parse
     */
    void error(String message, Object... args);

    /**
     * Report abnormal exception
     *
     * @param exception The exception to report
     */
    void reportException(Exception exception);

    /**
     * Get if debug mode is enabled
     *
     * @return true if debug mode is enabled
     */
    boolean isDebugModeActive();

    /**
     * Set if debug mode is enabled
     *
     * @param debugModeActive true if debug mode is enabled
     */
    void setDebugModeActive(boolean debugModeActive);

    /**
     * Get if the auto exception reporter is active
     *
     * @return true if the auto exception reporter is active
     */
    boolean isAutoExceptionReporterActive();

    /**
     * Set if the auto exception reporter is active
     *
     * @param autoExceptionReporterActive true if the auto exception reporter is active
     */
    void setAutoExceptionReporterActive(boolean autoExceptionReporterActive);

}
