package net.devmart.skywarsreloaded.api.data.sql;

public interface SWDatabaseVersionsStorage {

    Long getCurrentVersion();

    void addVersions(SQLDatabaseVersion... versions);

    void resetToVersion(long version);

}
