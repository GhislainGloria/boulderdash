package model.element.mobile.object;

import model.element.Position;
import model.element.mobile.Mobile;

/**
 * <h1>The class Object can move with gravity</h1>
 *
 * @author Ghislain Gloria
 * @version 1.0
 */

public abstract class Object extends Mobile {
	/**Make the object fall if he don't have motionless element under him */
	public void Fall(Position position){
	}
	
	
}
