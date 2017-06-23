/*
 * 
 */
package model.element.mobile.object;

import model.element.Direction;
import model.element.Position;

/**
 * <h1>The class Boulder is a type of object, he can kill monster and move by interacting with RockFord</h1>.
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class Boulder extends Object{
	
	/**
	 * Instantiates a new boulder.
	 *
	 * @param position the position
	 * @param direction the direction
	 */
	public Boulder(Position position, Direction direction) {
		super(position, direction);
	}

	/**
	 *  Destroy the monster at the same position of the boulder.
	 */
	public void kill(){
		
	}
}
