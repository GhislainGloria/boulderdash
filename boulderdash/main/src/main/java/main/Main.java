/*
 * 
 */
package main;

import java.sql.SQLException;

import controller.ControllerBoulder;
import model.ModelFacade;
import view.GameFrame;
import view.IView;
import view.MainWindow;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Corentin RAGUENEAU
 * @version 1.0
 */
public abstract class Main {

<<<<<<< HEAD
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
=======
	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws Exception
	 */
	public static void main(final String[] args) throws Exception {
		final ControllerBoulder controller = new ControllerBoulder(new ViewFacade(), new ModelFacade());

		try {
			controller.choiceLevel();
			controller.start();
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	}
>>>>>>> 9e6ebd3d9805dd1d6947fbf945d2e98432b4a76b

}
