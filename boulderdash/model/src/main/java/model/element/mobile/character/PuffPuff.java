/*
 * 
 */
package model.element.mobile.character;

import model.element.Direction;
import model.element.Position;

/**
 * <h1>The class PuffPuff is a type of monster, he transform in diamond</h1>.
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class PuffPuff extends Monster{
	
	/**
	 *  Create a PuffPuff.
	 *
	 * @param position the position
	 * @param direction the direction
	 */
	public PuffPuff(Position position, Direction direction){
		super(position, direction);
	}
	
	/**
	 * The monster turn left when he encounter a object.
	 */
	public void move(){
			
	}
}
