package model.element.mobile.character;

import model.element.Direction;
import model.element.Position;
import model.element.mobile.Mobile;

/**
 * <h1>The class RockFord can destroy Mud, take Diamond, push Rock and die when a monster touch him</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class RockFord extends Mobile{
	/**Create an instance of Rockford*/
	public RockFord(Position position, Direction direction){
		super(position, direction);
	}
	
	public void dig(){
		
	}
	
}
