package net.devmart.skywarsreloaded.api.command;

public interface CommandArgumentValidator {

    boolean between(int value, int min, int max);

    boolean lessThan(int value, int max);

    boolean greaterThan(int value, int min);

    boolean isInt(String value);

}
