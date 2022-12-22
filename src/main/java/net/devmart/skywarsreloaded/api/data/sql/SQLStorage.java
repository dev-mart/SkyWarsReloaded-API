package net.devmart.skywarsreloaded.api.data.sql;

import net.devmart.skywarsreloaded.api.SkyWarsReloaded;
import net.devmart.skywarsreloaded.api.data.Storage;

import java.sql.Connection;
import java.sql.SQLException;

public interface SQLStorage extends Storage {

    Connection getConnection() throws SQLException;

    void setupDatabase(Connection connection, String database) throws SQLException;

    SkyWarsReloaded getPlugin();

    void addTable(SQLTable<?> table);

}
