/*
 * 
 */
package model.element.motionless;

import model.element.Position;
import model.element.mobile.character.RockFord;

/**
 * <h1>The class Mud can be dig and don't move</h1>.
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class Mud extends Motionless{
	
	/**
	 * Create a bloc of mud.
	 *
	 * @param position the position
	 */
	public Mud(Position position){
		super(position);
		
	}
	/**
     * Destroy the Mud when RockFord is in the same position.
     */
	/**
     * @see model.element.mobile.character.RockFord#dig()
     */
	public void beDig(){
		
	}
}
