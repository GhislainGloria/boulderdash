package model;

import java.sql.SQLException;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

<<<<<<< HEAD
	/**
	 * Gets the example by id.
	 *
	 * @param id
	 *            the id
	 * @return the example by id
	 * @throws SQLException
	 *             the SQL exception
	 */
	Example getExampleById(int id) throws SQLException;

	/**
	 * Gets the example by name.
	 *
	 * @param name
	 *            the name
	 * @return the example by name
	 * @throws SQLException
	 *             the SQL exception
	 */
	Example getExampleByName(String name) throws SQLException;
=======
    /**
     * Gets the level by id.
     *
     * @param id
     *            the id
     * @return the level by id
     * @throws SQLException
     *             the SQL exception
     */
	Level getLevelById(int id) throws SQLException;
	
	
	//Example getExampleById(int id) throws SQLException;
    /*
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
    //Example getExampleByName(String name) throws SQLException;
>>>>>>> refs/remotes/origin/master

<<<<<<< HEAD
    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
    Example getExampleByName(String name) throws SQLException;

    /**
=======
<<<<<<< HEAD
	/**
	 * Gets the all examples.
	 *
	 * @return the all examples
	 * @throws SQLException
	 *             the SQL exception
	 */
	List<Example> getAllExamples() throws SQLException;

=======
    /*
>>>>>>> 9e6ebd3d9805dd1d6947fbf945d2e98432b4a76b
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     */
    //List<Example> getAllExamples() throws SQLException;
>>>>>>> refs/remotes/origin/master
}
