package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import model.ModelFacade;
import view.GameFrame;
import view.IView;
import view.MainWindow;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        final ControllerFacade controller = new ControllerFacade(new GameFrame(), new ModelFacade());
        final MainWindow mainWindow = new MainWindow();
        
        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
        
        
    }

}
