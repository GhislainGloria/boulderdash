package model.element.motionless;

import model.element.Position;

/**
 * <h1>The class Mud can be dig and don't move</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class Mud extends Motionless{
	/**Create a bloc of mud*/
	public Mud (Position position, String image){
		setPosition(position);
		
	}
	/**
     * Destroy the Mud when RockFord is in the same position.
     */
	/**
     * @see model.element.mobile.character.RockFord#digMud(Mud)
     */
	public void beDig(){
		
	}
}
