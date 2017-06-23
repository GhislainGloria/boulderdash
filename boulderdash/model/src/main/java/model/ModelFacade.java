/*
 * 
 */
package model;

import java.sql.SQLException;
import java.util.List;
import model.dao.LevelDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ModelFacade implements IModel {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    
    /**
     * Gets the level by id.
     *
     * @param id the id
     * @return the level by id
     * @throws SQLException the SQL exception
     * @see model.IModel#getLevelById(int)
     */
    @Override
    public Level getLevelById(final int id) throws SQLException {
        return LevelDAO.getLevelById(id);
    }
    
    /*
	@Override
	public Example getExampleById(int id) throws SQLException {
		return null;
	}
	*/
    /*
     *
     * @see model.IModel#getExampleByName(java.lang.String)
     */
   /* @Override
    public Example getExampleByName(final String name) throws SQLException {
        return ExampleDAO.getExampleByName(name);
    }
	*/
    
    /*
     *
     * @see model.IModel#getAllExamples()
     */
   /* @Override
    public List<Example> getAllExamples() throws SQLException {
        return ExampleDAO.getAllExamples();
    }
    */

}
