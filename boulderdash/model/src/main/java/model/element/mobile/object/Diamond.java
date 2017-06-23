package model.element.mobile.object;

import model.element.Direction;
import model.element.Position;
import model.element.mobile.character.RockFord;

/**
 * <h1>The class Diamond add Diamond in the score</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public class Diamond extends Object{
	/**Create an instance of a Diamond*/
	
	public Diamond(Position position, Direction direction) {
		super(position, direction);
	}

	/**Make the Diamond disappeared when RockFord is in the same Position*/
	public void beTake(RockFord rockford){
		if (rockford.getPosition() == this.getPosition()){
			
		}
	}
}
