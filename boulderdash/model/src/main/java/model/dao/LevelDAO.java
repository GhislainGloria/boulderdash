package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.element.Level;


/**
 * <h1>The Class LevelDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class LevelDAO extends AbstractDAO {

    /** The sql Level by id. */
    private static String sqlLevelById   = "{call findLevelById(?)}";

    /** The sql Level by name. */
    private static String sqlLevelByName = "{call findLevelByPath(?)}";

    /** The sql all Levels. */
    private static String sqlAllLevels   = "{call findAllLevel()}";

    /** The id column index. */
    private static int    idColumnIndex    = 1;

    /** The name column index. */
    private static int    nameColumnIndex  = 2;

    /**
     * Gets the Level by id.
     *
     * @param id
     *            the id
     * @return the Level by id
     * @throws SQLException
     *             the SQL exception
     */
    public static Level getLevelById(final int id) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlLevelById);
        Level level = null;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                level = new Level(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
            }
            result.close();
        }
        return level;
    }

    /**
     * Gets the Level by name.
     *
     * @param name
     *            the name
     * @return the Level by name
     * @throws SQLException
     *             the SQL exception
     */
    public static Level getLevelByName(final String name) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlLevelByName);
        Level level = null;

        callStatement.setString(1, name);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                level = new Level(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
            }
            result.close();
        }
        return level;
    }

    /**
     * Gets the all Levels.
     *
     * @return the all Levels
     * @throws SQLException
     *             the SQL exception
     */
    public static List<Level> getAllLevels() throws SQLException {
        final ArrayList<Level> Levels = new ArrayList<Level>();
        final CallableStatement callStatement = prepareCall(sqlAllLevels);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
                Levels.add(new Level(result.getInt(idColumnIndex), result.getString(nameColumnIndex)));
            }
            result.close();
        }
        return Levels;
    }
}
