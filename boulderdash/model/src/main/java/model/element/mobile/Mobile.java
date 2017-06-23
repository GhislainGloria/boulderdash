/*
 * 
 */
package model.element.mobile;

import model.element.Direction;
import model.element.Element;
import model.element.Position;

/**
 * <h1>The abstract class Mobile define what a motion element is.</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public abstract class Mobile extends Element implements IMobile {
	/** The position of the Mobile object. */
	
	private Direction direction;

	

	/**
	 * Instantiates a new mobile.
	 *
	 * @param position the position
	 * @param direction the direction
	 */
	public Mobile(Position position, Direction direction) {
		super(position, direction);
	}

	/**
	 * Gets the direction.
	 *
	 * @return the direction
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * Sets the direction.
	 *
	 * @param direction the new direction
	 */
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	/**
	 * the Mobile object changing his Position.
	 */
	public void moveUp() {

	}

	/**
	 * Move down.
	 */
	public void moveDown() {

	}

	/**
	 * Move left.
	 */
	public void moveLeft() {

	}

	/**
	 * Move right.
	 */
	public void moveRight() {

	}

	/**
	 * This method set the initial position in the map
	 */
	
}
