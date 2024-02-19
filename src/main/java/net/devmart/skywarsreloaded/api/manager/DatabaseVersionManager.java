package net.devmart.skywarsreloaded.api.manager;

import net.devmart.skywarsreloaded.api.data.sql.SQLDatabaseVersion;

import java.util.List;

public interface DatabaseVersionManager {

    /**
     * Upgrades the database schema to the latest version.
     * If the database is already at the latest version, this method does nothing.
     */
    void upgradeToLatestVersion();

    /**
     * Downgrades the database schema to a specific version.
     *
     * @param version The version to downgrade to
     */
    void rollbackToVersion(long version);

    /**
     * Gets a list of all versions of the database schema.
     * Sorted by version number in ascending order.
     *
     * @return A list of all versions of the database schema
     */
    List<SQLDatabaseVersion> getVersions();

    /**
     * Gets the current version of the database schema.
     *
     * @return The current version of the database schema. See {@link SQLDatabaseVersion#getVersion()} for more info.
     */
    Long getCurrentVersion();

    /**
     * Gets the latest version of the database schema.
     *
     * @return The latest version of the database schema
     */
    Long getLatestVersion();

    /**
     * Adds a version to the database version manager.
     *
     * @param version The version to add
     */
    void addVersion(SQLDatabaseVersion version);

    /**
     * Removes a version from the database version manager.
     *
     * @param version The version to remove
     */
    void removeVersion(SQLDatabaseVersion version);

}
