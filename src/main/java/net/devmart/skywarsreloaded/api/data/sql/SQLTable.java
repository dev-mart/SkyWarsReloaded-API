package net.devmart.skywarsreloaded.api.data.sql;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface SQLTable<DataType> {

    /**
     * Dynamically binds a value to a parameter of a prepared statement.
     *
     * @param statement The {@link PreparedStatement} to supply with parameter data
     * @param index     Index of the property.
     * @param value     Parameter value.
     * @throws SQLException If an error occurs while binding the value.
     */
    void bindPropertyValue(PreparedStatement statement, int index, Object value) throws SQLException;

    /**
     * Updates a column for a specific row.
     *
     * @param property Name of the column to update.
     * @param value    New value for the column.
     * @param object   Identify class of the row.
     */
    void setProperty(String property, Object value, DataType object);

}
