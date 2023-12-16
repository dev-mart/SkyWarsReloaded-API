package net.devmart.skywarsreloaded.api.data.sql;

import net.devmart.skywarsreloaded.api.SkyWarsReloaded;
import net.devmart.skywarsreloaded.api.data.Storage;
import net.devmart.skywarsreloaded.api.data.config.YAMLConfig;

import java.sql.Connection;
import java.sql.SQLException;

public interface SQLStorage extends Storage {

    /**
     * Establishes a connection to the database.
     *
     * @return The database connection.
     * @throws SQLException If the connection could not be established.
     */
    Connection getConnection() throws SQLException;

    /**
     * Creates the database if it doesn't exist.
     *
     * @param connection An existing connection to the database.
     * @param database   The name of the database.
     * @throws SQLException If an error occurs while creating the database.
     */
    void setupDatabase(Connection connection, String database) throws SQLException;

    /**
     * Checks whether the user that is used to connect to the database has
     * all the required permissions to create, alter, insert, update and delete tables.
     *
     * @return True if the user has all the required permissions, false otherwise.
     */
    boolean checkRequiredPermissions(Connection connection, String database);

    /**
     * Get the main {@link SkyWarsReloaded} instance
     *
     * @return The main class instance.
     */
    SkyWarsReloaded getSkywars();

    /**
     * Add a {@link SQLTable} to the data structure of the database.
     * This will allow the {@link #setup(YAMLConfig)} method to create and update the tables.
     *
     * @param table The table to add.
     */
    void addTable(SQLTable<?> table);

    enum Type {
        SQLITE, MYSQL
    }

}
