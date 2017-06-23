package controller;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.List;
import model.Example;
=======
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.List;
>>>>>>> 9e6ebd3d9805dd1d6947fbf945d2e98432b4a76b
import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerBoulder.</h1>
 *
 * @author chloe
 * @version 1.0
 */
<<<<<<< HEAD
public class ControllerBoulder implements IController, IOrderPerform {
=======
public class ControllerBoulder implements IController, IOrderPerformer {
>>>>>>> 9e6ebd3d9805dd1d6947fbf945d2e98432b4a76b

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;

	/** The speed. */
	private final int speed = 300;

	/** The stack order. */
	private UserOrder stackOrder;

	/**
<<<<<<< HEAD
=======
	 * The User enter a number between 1 and 5 to choose the level
	 * 
	 * @return nLevel Choose the level
	 */
	public int choiceLevel() {
		int nLevel;
		do {
			String numLevel = JOptionPane.showInputDialog(null, "Choose a level", "BoulderDash",
					JOptionPane.QUESTION_MESSAGE);
			nLevel = Integer.parseInt(numLevel);
		} while (nLevel > 6 || nLevel < 0);

		return nLevel;
	}

	/**
>>>>>>> 9e6ebd3d9805dd1d6947fbf945d2e98432b4a76b
	 * Instantiates a new controller.
	 *
	 * @param view
	 *            the view
	 * @param model
	 *            the model
	 */
	public ControllerBoulder(final IView view, final IModel model) {
		super();
		this.view = view;
		this.model = model;
		this.clearStackOrder();
	}

	/**
	 * Start the game.
	 *
	 * @throws InterruptedException
	 *
	 */
	public void start() throws InterruptedException {
		while (this.getModel().getMap().getCharacter().isAlive()) {
			Thread.sleep(speed);
			switch (this.getStackOrder()) {
			case RIGHT:
				this.getModel().getCharacter().moveRight();
				break;
			case LEFT:
				this.getModel().getCharacter().moveLeft();
				break;
			case UP:
				this.getModel().getCharacter().moveUp();
				break;
			case DOWN:
				this.getModel().getCharacter().moveDown();
				break;
			case NOP:
			default:
				this.getModel().getCharacter().doNothing();
				break;
			}
			this.clearStackOrder();
			if (this.getModel().getMap().getdiamondscount() == 0) {
				this.getView().displayMessage("You collected all the diamonds, well done!!");
				System.exit(0);
			}
		}
		this.getView().displayMessage("You are dead!");
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
	 * Sets the view.
	 *
	 * @param view
	 *            the view to set
	 */
	private void setView(final IView view) {
		this.view = view;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public IModel getModel() {
		return this.model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *            the model to set
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Gets the stack order.
	 *
	 * @return the stack order
	 */
	private UserOrder getStackOrder() {
		return this.stackOrder;
	}

	/**
	 * Sets the stack order.
	 *
	 * @param stackOrder
	 *            the new stack order
	 */
	private void setStackOrder(final UserOrder stackOrder) {
		this.stackOrder = stackOrder;
	}

	/**
	 * Clear stack order.
	 */
	private void clearStackOrder() {
		this.stackOrder = UserOrder.NOP;
	}

<<<<<<< HEAD
	@Override
	public IOrderPerform getOrderPerform() {
		return this;
=======
	public IOrderPerformer getOrderPerformer() {
		return this.getOrderPerformer();
>>>>>>> 9e6ebd3d9805dd1d6947fbf945d2e98432b4a76b
	}
}
