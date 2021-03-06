/*
 * 
 */
package controller;

import java.sql.SQLException;

import model.IModel;
import view.GameFrame;
import view.IView;
import view.MainWindow;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;

    /**
     * Instantiates a new controller facade.
     *
     * @param gameFrame
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final MainWindow mainWindow, final IModel model) {
        super();
        this.view = mainWindow;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() throws SQLException {
    	System.out.println(this.getModel().getLevelById(1).toString());
    	//LevelMap levelmap = new LevelMap();
    	
        //this.getView().displayMessage(this.getModel().getLevelById(1).toString());

        //this.getView().displayMessage(this.getModel().getExampleByName("Example 2").toString());

       /* final List<Example> examples = this.getModel().getAllExamples();
        final StringBuilder message = new StringBuilder();
        // a.append(" bar);
        for (final Example example : examples) {
            message.append(example);
            message.append('\n');
        }
        this.getView().displayMessage(message.toString());*/
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }
}
