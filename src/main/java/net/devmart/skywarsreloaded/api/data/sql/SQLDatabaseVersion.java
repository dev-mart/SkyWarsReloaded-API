package net.devmart.skywarsreloaded.api.data.sql;

public interface SQLDatabaseVersion {

    /**
     * <p>
     * The version of the database schema, represented as a UNIX timestamp.
     * </p>
     * <br />
     * <p>
     * This number should be unique for each version of the database and should be incremented whenever the database schema is changed.
     * The version number represents a point in time where the database schema was changed.
     * </p>
     * <br />
     * <p>To create a new version, please consult <a href="https://www.unixtimestamp.com/">this tool to get the current UNIX timestamp</a>.</p>
     *
     * @return The version of the database schema as a UNIX timestamp
     */
    long getVersion();

    /**
     * <p>
     * This method is called when the database schema is being upgraded to this version.
     * </p>
     * <br />
     * <p>
     * This method should be used to create new tables, add new columns, or perform any other necessary changes to the database schema.
     * </p>
     *
     * @param storage The {@link SQLStorage} instance to use for database operations
     */
    void upgrade(SQLStorage storage);

    /**
     * <p>
     * This method is called when the database schema is being downgraded from this version.
     * </p>
     * <br />
     * <p>
     * This method should be used to remove tables, remove columns, or perform any other necessary changes to the database schema.
     * </p>
     *
     * @param storage The {@link SQLStorage} instance to use for database operations
     */
    void rollback(SQLStorage storage);

}
