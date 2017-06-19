package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import model.dao.ExampleDAO;

public interface IModel {

    /*
     * @see model.IModel#getExampleById(int)
     */
    public Example getExampleById(final int id) throws SQLException;

    /*
     * @see model.IModel#getExampleByName(java.lang.String)
     */
    public Example getExampleByName(final String name) throws SQLException;

    /*
     * @see model.IModel#getAllExamples()
     */
    public List<Example> getAllExamples() throws SQLException;
    
}
