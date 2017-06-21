package model.element.mobile;

import model.element.Direction;
import model.element.Position;

/**
 * <h1>The abstract class Mobile define what a motion element is.</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public abstract class Mobile implements IMobile {
	/** The position of the Mobile object. */
	
	private Direction direction;

	

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	/**
	 * the Mobile object changing his Position.
	 */
	public void moveUp() {

	}

	public void moveDown() {

	}

	public void moveLeft() {

	}

	public void moveRight() {

	}

	/**
	 * This method set the initial position in the map
	 */
	
}
