package main;

import java.sql.SQLException;

import controller.ControllerBoulder;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Corentin RAGUENEAU
 * @version 1.0
 */
public abstract class Main {

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
		} catch (final SQLException exception) {
			exception.printStackTrace();
		}
	}

}
