package controller;

import java.sql.SQLException;
import java.util.List;

import fr.exia.insanevehicles.controller.IOrderPerformer;
import fr.exia.insanevehicles.controller.UserOrder;
import fr.exia.insanevehicles.model.IInsaneVehiclesModel;
import fr.exia.insanevehicles.view.IInsaneVehiclesView;
import model.Example;
import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerBoulder.</h1>
 *
 * @author chloe
 * @version 1.0
 */
public class ControllerBoulder implements IController, IOrderPerformer {

	/** The view. */
	private final IView view;

	/** The model. */
	private final IModel model;

	/** The speed. */
	private final int speed = 300;

	/** The stack order. */
	private UserOrder stackOrder;

	/**
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

	@Override
	public IOrderPerformer getOrderPeformer() {
		return this;
	}
}
