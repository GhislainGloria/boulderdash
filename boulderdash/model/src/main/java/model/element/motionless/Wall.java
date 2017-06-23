/*
 * 
 */
package model.element.motionless;

import model.element.*;

/**
 * <h1>The class Wall can't be dig and don't move</h1>.
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class Wall extends Motionless{
	
	/**
	 * Create a Wall.
	 *
	 * @param position the position
	 */
	public Wall(Position position){
		super(position);
	}
}
