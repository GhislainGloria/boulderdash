/*
 * 
 */
package model.element.mobile.character;

import model.element.Direction;
import model.element.Position;

/**
 * <h1>The class TackyTacky is a type of monster, he transform in diamond</h1>.
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class TackyTacky extends Monster{
	
	/**
	 * Create a TackyTacky.
	 *
	 * @param position the position
	 * @param direction the direction
	 */
	public TackyTacky(Position position, Direction direction){
		super(position, direction);
	}
	
	/**
	 * Transform the monster in diamond if he die.
	 */
	public void die(){
		
	}
	
	/**
	 * The monster turn right when he encounter a object.
	 */
	public void move(){
			
	}
}
